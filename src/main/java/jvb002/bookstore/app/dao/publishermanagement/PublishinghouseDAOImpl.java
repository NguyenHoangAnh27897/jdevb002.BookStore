package jvb002.bookstore.app.dao.publishermanagement;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import jvb002.bookstore.app.model.publishermanagement.Publisher;

public class PublishinghouseDAOImpl  extends HibernateDaoSupport implements PublishinghouseDAO{

	@Override
	public List<Publisher> getList() {
		DetachedCriteria criteria= DetachedCriteria.forClass(Publisher.class);
		return (List<Publisher>) getHibernateTemplate().find("select publishID,"
				+ "name, createdUserID, createdDate from publishinghouse");
	}

	@Override
	public List<Publisher> getDetail() {
		DetachedCriteria criteria= DetachedCriteria.forClass(Publisher.class);
		return (List<Publisher>) getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public void delete(Publisher publisher) {
		getHibernateTemplate().delete(publisher);
		
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
