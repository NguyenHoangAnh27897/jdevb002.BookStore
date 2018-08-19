package jvb002.bookstore.app.dao.usermanagement;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import jvb002.bookstore.app.model.usermanagement.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	@Override
	public void insertUser(User user) {
		Session session = getSessionFactory().openSession();
		Transaction ts = null;
		try {
			ts = session.beginTransaction();
			session.save(user);
			session.persist(user);
	
		} catch (Exception e) {
			ts.rollback();
		} finally {
			session.flush();
			ts.commit();
			session.close();
		}
	}
}
