package jvb002.bookstore.app.dao.publishermanagement;

import java.util.List;

import jvb002.bookstore.app.dto.PublisherVO;
import jvb002.bookstore.app.model.publishermanagement.Publisher;

public interface PublisherDAO {
	public List<Publisher> getList();
	public List<Publisher> getDetail();
	public void delete(Publisher publisher);
	public void create(PublisherVO publisherVO);
	public void update(PublisherVO publisherVO);
}
