package jvb002.bookstore.app.service.classification;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jvb002.bookstore.app.dao.classification.ClassificationDAO;
import jvb002.bookstore.app.model.classification.Category;

@Service
public class ClassificationServiceImpl implements ClassificationService {

	private ClassificationDAO classificationDAO;

	public ClassificationDAO getClassificationDAO() {
		return classificationDAO;
	}

	public void setClassificationDAO(ClassificationDAO classificationDAO) {
		this.classificationDAO = classificationDAO;
	}

	@Override
	@Transactional
	public void addCategory(Category c) {
		// TODO Auto-generated method stub
		this.classificationDAO.addCategory(c);
	}

	@Override
	@Transactional
	public void updateCategory(Category c) {
		// TODO Auto-generated method stub
		this.classificationDAO.updateCategory(c);
	}

}
