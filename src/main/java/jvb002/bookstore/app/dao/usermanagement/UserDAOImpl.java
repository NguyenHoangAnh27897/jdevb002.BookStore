package jvb002.bookstore.app.dao.usermanagement;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import jvb002.bookstore.app.model.usermanagement.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	@Override
	public void insertUser(User user) {
		Session session = getSessionFactory().openSession();
		Transaction ts = null;
		try {
			ts = session.beginTransaction();
			if(user.getId() == 0) {
				session.save(user);
			} else { 
				session.saveOrUpdate(user);
			}
		} catch (Exception e) {
			ts.rollback();
		} finally {
			session.flush();
			ts.commit();
			session.close();
		}
	}

	@Override
	public User getUserById(int id) {

		Session session = getSessionFactory().openSession();
		Transaction ts = null;
		User user = new User();
		ts = session.beginTransaction();
		Query q1 = session.createQuery("from User where id = :id");
		q1.setParameter("id", id);
		logger.info(q1.toString());
		List data = q1.list();
		
		return (User) data.iterator().next();
	}

	@Override
	public List<User> userList() {
		Session session = getSessionFactory().openSession();
		Transaction ts = null;
		
		ts = session.beginTransaction();
		Query q1 = session.createQuery("from User");
		List<User> userList = q1.list();
		for (User u : userList) {
			logger.info("User List::" + u);
		}

		return userList;
	}

	@Override
	public void deleteUser(int id) {
		Session session = getSessionFactory().openSession();
		Transaction ts = null;

		try {
			ts = session.beginTransaction();
			User user = (User) session.load(User.class, id);
			if (user != null) {
				session.delete(user);
			}

		} catch (Exception e) {

		} finally {
			session.flush();
			ts.commit();
			session.close();
		}

	}
}
