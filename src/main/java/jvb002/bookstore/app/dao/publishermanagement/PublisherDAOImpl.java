package jvb002.bookstore.app.dao.publishermanagement;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import jvb002.bookstore.app.dto.PublisherVO;
import jvb002.bookstore.app.model.publishermanagement.Publisher;
import jvb002.bookstore.app.util.ConvertUtils;

public class PublisherDAOImpl implements PublisherDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
//	@Override
//	public List<Publisher> getList() {
//		DetachedCriteria criteria = DetachedCriteria.forClass(Publisher.class);
//		return (List<Publisher>) getHibernateTemplate()
//				.find("select publishID," + "name, createdUserID, createdDate from publishinghouse");
//	}

	@Override
	public List<Publisher> getDetail() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery("from Publisher");
		return query.list();
	}

	@Override
	public void delete(long publishID) {
		Session session = sessionFactory.getCurrentSession();
		Publisher publisher=(Publisher) session.load(Publisher.class,  publishID);
		if(publisher!=null){
			session.delete(publisher);
		}
	}

	@Override
	public void create(PublisherVO publisherVO) {
		Publisher publisher = ConvertUtils.convertPublisherVOToPublisher(publisherVO);
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			session.close();
		}
	}

	@Override
	public void update(PublisherVO publisherVO) {
		Publisher publisher = ConvertUtils.convertPublisherVOToPublisher(publisherVO);
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(ConvertUtils.convertPublisherVOToPublisher(publisherVO));
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			session.close();
		}
	}
	@Override
	public Publisher getPublisherByID(long publishID) {
		Session session = sessionFactory.getCurrentSession();
		
		return (Publisher) session.load(Publisher.class, publishID);
	}
}
