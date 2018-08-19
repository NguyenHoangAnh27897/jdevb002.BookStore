package jvb002.bookstore.app.dao.publishermanagement;

import java.util.List;

import jvb002.bookstore.app.dto.PublisherVO;
import jvb002.bookstore.app.model.publishermanagement.Publisher;

public interface PublisherDAO {
	public Publisher getPublisherByID(long publishID);
	public List<Publisher> getDetail();
	public void delete(long publishID);
	public void create(PublisherVO publisherVO);
	public void update(PublisherVO publisherVO);
}
