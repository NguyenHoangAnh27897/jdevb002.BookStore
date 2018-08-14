package jvb002.bookstore.app.dao.classification;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import jvb002.bookstore.app.model.classification.Category;

@Repository
public class ClassificationDAOImpl implements ClassificationDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addCategory(Category c) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist("Category saved successfully, Category Details=" + c);
	}

	@Override
	public void updateCategory(Category c) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update("Category updated successfully, Category Details=" + c);
	}
}
