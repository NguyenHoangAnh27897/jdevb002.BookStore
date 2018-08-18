/**
 * 
 */
package jvb002.bookstore.app.dao.bookmanagement;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import jvb002.bookstore.app.model.bookmanagement.Book;
import jvb002.bookstore.app.model.classification.Category;
import jvb002.bookstore.app.model.publishermanagement.Publisher;

/**
 * @author GIT
 *
 */
public class BookDAOImpl extends HibernateDaoSupport implements BookDAO {

	/* (non-Javadoc)
	 * @see jvb002.bookstore.app.dao.bookmanagement.BookDAO#create(jvb002.bookstore.app.model.bookmanagement.Book)
	 */
	@Override
	public void create(Book book) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(book);
	}

	/* (non-Javadoc)
	 * @see jvb002.bookstore.app.dao.bookmanagement.BookDAO#update(jvb002.bookstore.app.model.bookmanagement.Book)
	 */
	@Override
	public void update(Book book) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(book);
	}

	/* (non-Javadoc)
	 * @see jvb002.bookstore.app.dao.bookmanagement.BookDAO#getCategory()
	 */
	@Override
	public List<Category> getCategory() {
		// TODO Auto-generated method stub
		List<Category> cateList =  (List<Category>) getHibernateTemplate().find("from Category");
		return cateList.size() > 0 ? cateList : null;
	}

	/* (non-Javadoc)
	 * @see jvb002.bookstore.app.dao.bookmanagement.BookDAO#getPublisher()
	 */
	@Override
	public List<Publisher> getPublisher() {
		// TODO Auto-generated method stub
		List<Publisher> publisherList =  (List<Publisher>) getHibernateTemplate().find("from Publisher");
		return publisherList.size() > 0 ? publisherList : null;
	}

	@Override
	public void delete(Book book) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(book);
	}

	@Override
	public List<Book> getBook() {
		// TODO Auto-generated method stub
		List<Book> bookList =  (List<Book>) getHibernateTemplate().find("from Book");
		return bookList.size() > 0 ? bookList : null;
	}

	@Override
	public List<Book> getDetail() {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(Publisher.class);
		return (List<Book>) getHibernateTemplate().findByCriteria(criteria);
	}

}
