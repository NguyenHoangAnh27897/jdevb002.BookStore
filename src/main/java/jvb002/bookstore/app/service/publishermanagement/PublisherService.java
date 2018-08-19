package jvb002.bookstore.app.service.publishermanagement;

import java.util.List;

import jvb002.bookstore.app.dto.PublisherVO;
import jvb002.bookstore.app.model.publishermanagement.Publisher;

public interface PublisherService {
	public Publisher getPublisherByID(long publishID);
	//public List<Publisher> getList();
	public List<Publisher> getDetail();
	public void delete(long publishID);
	public void create(PublisherVO publisherVO);
	public void update(PublisherVO publisherVO);
}
