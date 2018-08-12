package jvb002.bookstore.app.service.publishermanagement;

import java.util.List;

import jvb002.bookstore.app.model.publishermanagement.Publisher;

public interface PublishinghouseService {
	public List<Publisher> getList();
	public List<Publisher> getDetail();
	public void delete(Publisher publisher);
	public void create();
	public void update();
}
