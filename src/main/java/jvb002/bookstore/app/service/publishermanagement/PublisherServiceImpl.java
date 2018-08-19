package jvb002.bookstore.app.service.publishermanagement;

import java.util.List;

import jvb002.bookstore.app.dao.publishermanagement.PublisherDAO;
import jvb002.bookstore.app.dto.PublisherVO;
import jvb002.bookstore.app.model.publishermanagement.Publisher;

public class PublisherServiceImpl implements PublisherService {

	private PublisherDAO publisherDAO;

//	@Override
//	public List<Publisher> getList() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<Publisher> getDetail() {
		// TODO Auto-generated method stub
		return publisherDAO.getDetail();
	}

	@Override
	public void delete(long publishID) {
		publisherDAO.delete(publishID);

	}

	@Override
	public void create(PublisherVO publisherVO) {
		publisherDAO.create(publisherVO);
	}

	@Override
	public void update(PublisherVO publisherVO) {
		publisherDAO.update(publisherVO);
	}

	public void setPublisherDAO(PublisherDAO publisherDAO) {
		this.publisherDAO = publisherDAO;
	}

	@Override
	public Publisher getPublisherByID(long publishID) {
		// TODO Auto-generated method stub
		return publisherDAO.getPublisherByID(publishID);
	}
}
