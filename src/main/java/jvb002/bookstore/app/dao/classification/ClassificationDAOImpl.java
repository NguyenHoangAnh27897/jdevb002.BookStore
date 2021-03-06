package jvb002.bookstore.app.dao.classification;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import jvb002.bookstore.app.model.classification.Category;

//@Repository
public class ClassificationDAOImpl extends HibernateDaoSupport implements ClassificationDAO {
	
	
	@Override
	public void save(Category c) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(c);
	}

	@Override
	public void update(Category c) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(c);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(id);
	}

	
	@Override
	public Category getOne(int id) {
		// TODO Auto-generated method stub
		String sqlQuery = "from Category where categoryID=:id";
		Category cate  = (Category)getHibernateTemplate().find(sqlQuery,new Integer(id));
		return cate !=null ? cate : null;
	
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		List<Category> cateList =  (List<Category>) getHibernateTemplate().find("from Category");
		return cateList.size() > 0 ? cateList : null;
	}
	
}
