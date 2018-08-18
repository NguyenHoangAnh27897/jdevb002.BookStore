package jvb002.bookstore.app.service.classification;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import jvb002.bookstore.app.dao.classification.ClassificationDAO;
import jvb002.bookstore.app.model.classification.Category;

@Service
public class ClassificationServiceImpl implements ClassificationService {

	private ClassificationDAO classificationDAO;

	public void setClassificationDAO(ClassificationDAO classificationDAO) {
		this.classificationDAO = classificationDAO;
	}

	@Override
	@Transactional
	public void save(Category c) {
		// TODO Auto-generated method stub
		classificationDAO.save(c);
	}

	@Override
	@Transactional
	public void update(Category c) {
		// TODO Auto-generated method stub
		classificationDAO.update(c);
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		classificationDAO.delete(id);
	}

	@Override
	@Transactional
	public Category getOne(int id,Boolean parentID) {
		// TODO Auto-generated method stub
		return classificationDAO.getOne(id,parentID);
	}

	@Override
	@Transactional
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return  classificationDAO.getAll();
	}


}
