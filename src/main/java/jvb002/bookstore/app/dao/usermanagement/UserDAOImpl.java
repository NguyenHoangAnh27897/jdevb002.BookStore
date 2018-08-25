package jvb002.bookstore.app.dao.usermanagement;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import jvb002.bookstore.app.model.usermanagement.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	private SessionFactory sessionFactory;

	@Override
	public void insertUser(User user) {
		Session session = getSessionFactory().openSession();
		Transaction ts = null;
		try {
			ts = session.beginTransaction();
			session.save(user);

		} catch (Exception e) {
			ts.rollback();
		} finally {
			session.flush();
			ts.commit();
			session.close();
		}
	}

	@Override
	public User getUser(int id) {
		Session session = getSessionFactory().openSession();
		Transaction ts = null;
//		Select User
		User user = new User();
		Query q1 = session.createQuery("from User where id = :id");
		q1.setParameter("id", id);
		List list = q1.list();
		user = (User) list.get(0);
		logger.info("User name " + user.getFullName()); 
		return user;
	}

	@Override
	public void updateUser(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(user);
		logger.info("User updated successfully, User Details=" + user);
	}

}
