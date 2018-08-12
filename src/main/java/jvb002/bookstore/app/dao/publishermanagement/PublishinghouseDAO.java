package jvb002.bookstore.app.dao.publishermanagement;

import java.util.List;

import jvb002.bookstore.app.model.publishermanagement.Publisher;

public interface PublishinghouseDAO {
	public List<Publisher> getList();
	public List<Publisher> getDetail();
	public void delete(Publisher publisher);
	public void create();
	public void update();
}
