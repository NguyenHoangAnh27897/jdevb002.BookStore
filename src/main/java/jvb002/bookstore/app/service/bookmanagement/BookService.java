package jvb002.bookstore.app.service.bookmanagement;

import java.util.List;

import jvb002.bookstore.app.model.bookmanagement.Book;
import jvb002.bookstore.app.model.classification.Category;
import jvb002.bookstore.app.model.publishermanagement.Publisher;

public interface BookService {
	public void create(Book book);
	public void update(Book book);
	public void delete(Book book);
	public Book getDetail(int id);
	public List<Category> getCategory();
	public List<Publisher> getPublisher();
	public List<Book> getBook();
}
