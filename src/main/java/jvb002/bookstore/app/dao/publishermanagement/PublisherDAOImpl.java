package jvb002.bookstore.app.dao.publishermanagement;

/**
 * PUBLISHER DAOImpl
 * NHA - QUAN
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import jvb002.bookstore.app.dto.PublisherVO;
import jvb002.bookstore.app.model.publishermanagement.Publisher;
import jvb002.bookstore.app.util.ConvertUtils;

public class PublisherDAOImpl implements PublisherDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	// @Override
	// public List<Publisher> getList() {
	// DetachedCriteria criteria = DetachedCriteria.forClass(Publisher.class);
	// return (List<Publisher>) getHibernateTemplate()
	// .find("select publishID," + "name, createdUserID, createdDate from
	// publishinghouse");
	// }

	@Override
	public List<Publisher> getDetail() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Publisher");
		return query.list();
	}

	@Override
	public void delete(long publishID) {
		Session session = sessionFactory.openSession();
		Publisher publisher = (Publisher) session.load(Publisher.class, publishID);
		if (publisher != null) {
			session.delete(publisher);
		}
		session.flush();
	}

	@Override
	public void create(Publisher publisher) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			publisher.setCreatedDate(new java.sql.Date(new Date().getTime()));
			session.save(publisher);
			session.flush();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			session.close();
		}
	}

	@Override
	public void update(Publisher publisher) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			Publisher publisherTemp = (Publisher) session.load(Publisher.class, publisher.getPublishID());
			publisher.setCreatedDate(publisherTemp.getCreatedDate());
			// publisher.setCreatedUserID(publisherTemp.getCreatedUserID());
			session.close();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(publisher);
			session.flush();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			session.close();
		}
	}

	@Override
	public PublisherVO getPublisher(int id) {
		Session session = sessionFactory.openSession();
		Publisher p = (Publisher) session.load(Publisher.class, new Long(id));
		return ConvertUtils.convertPublisherToPublisherVO(p);
	}

	@Override
	public Publisher getPublisherByID(long publishID) {
		Session session = sessionFactory.getCurrentSession();

		return (Publisher) session.load(Publisher.class, publishID);
	}
}
