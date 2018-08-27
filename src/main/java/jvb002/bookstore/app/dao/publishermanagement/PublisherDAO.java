package jvb002.bookstore.app.dao.publishermanagement;

/**
 * PUBLISHER DAO
 * NHA - QUAN
 */
import java.util.List;

import jvb002.bookstore.app.dto.PublisherVO;
import jvb002.bookstore.app.model.publishermanagement.Publisher;

public interface PublisherDAO {
	public Publisher getPublisherByID(long publishID);

	public List<Publisher> getDetail();

	public void delete(long publishID);

	public void create(Publisher publisher);

	public void update(Publisher publisher);

	public PublisherVO getPublisher(int id);
}
