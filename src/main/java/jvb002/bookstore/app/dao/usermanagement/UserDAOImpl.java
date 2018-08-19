package jvb002.bookstore.app.dao.usermanagement;


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
	public void getUser(int id) {
	
		Session session = getSessionFactory().openSession();
		Transaction ts = null;
		try {
			ts = session.beginTransaction();
			Query q1 = session.createQuery("from User where id = :id");
			User user = new User();
			q1.setParameter("id", id);
			logger.info("User: " + user.getUserName());
	
		} catch (Exception e) {
			ts.rollback();
		} finally {
			session.flush();
			ts.commit();
			session.close();
		}
	}
}
