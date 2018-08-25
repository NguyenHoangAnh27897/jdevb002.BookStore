package jvb002.bookstore.app.service.classification;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import jvb002.bookstore.app.dao.classification.ClassificationDAO;
import jvb002.bookstore.app.dto.CategoryVO;
import jvb002.bookstore.app.model.classification.Category;
import jvb002.bookstore.app.util.ConvertUtils;

@Service
public class ClassificationServiceImpl implements ClassificationService {

	private ClassificationDAO classificationDAO;

	public void setClassificationDAO(ClassificationDAO classificationDAO) {
		this.classificationDAO = classificationDAO;
	}

	@Override
	@Transactional
	public void save(CategoryVO c) {
		// TODO Auto-generated method stub
		classificationDAO.save(ConvertUtils.convertCategoryVOToCategory(c));
	}

	@Override
	@Transactional
	public void update(CategoryVO c) {
		// TODO Auto-generated method stub
		classificationDAO.update(ConvertUtils.convertCategoryVOToCategory(c));
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		classificationDAO.delete(id);
	}

	@Override
	@Transactional
	public CategoryVO getOne(int id) {
		// TODO Auto-generated method stub
		return ConvertUtils.convertCategoryToCategoryVO((classificationDAO.getOne(id)));
	}

	@Override
	@Transactional
	public List<CategoryVO> getAll() {
		// TODO Auto-generated method stub
		return ConvertUtils.ListCategoryVO(classificationDAO.getAll());
		
	}


}
