package jvb002.bookstore.app.service.bookmanagement;

import java.util.List;

import jvb002.bookstore.app.dao.bookmanagement.BookDAO;
import jvb002.bookstore.app.model.bookmanagement.Book;
import jvb002.bookstore.app.model.classification.Category;
import jvb002.bookstore.app.model.publishermanagement.Publisher;

public class BookServiceImpl implements BookService {
	
	private BookDAO bookDAO;

	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	@Override
	public void create(Book book) {
		// TODO Auto-generated method stub
		bookDAO.create(book);
	}

	@Override
	public void update(Book book) {
		// TODO Auto-generated method stub
		bookDAO.update(book);
	}

	@Override
	public void delete(Book book) {
		// TODO Auto-generated method stub
		bookDAO.delete(book);
	}

	@Override
	public Book getDetail(int id) {
		// TODO Auto-generated method stub
		return bookDAO.getDetail(id);
	}

	@Override
	public List<Category> getCategory() {
		// TODO Auto-generated method stub
		return bookDAO.getCategory();
	}

	@Override
	public List<Publisher> getPublisher() {
		// TODO Auto-generated method stub
		return bookDAO.getPublisher();
	}

	@Override
	public List<Book> getBook() {
		// TODO Auto-generated method stub
		return bookDAO.getBook();
	}
	
}
