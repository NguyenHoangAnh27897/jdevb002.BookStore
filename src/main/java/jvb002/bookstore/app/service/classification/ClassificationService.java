package jvb002.bookstore.app.service.classification;


import java.util.List;

import jvb002.bookstore.app.dto.CategoryVO;
import jvb002.bookstore.app.model.classification.Category;

public interface ClassificationService {
	public void save(CategoryVO categoryVO);
	public void update(CategoryVO categoryVO);
	public void delete(int id);
	public Category getOne(int id);
	public List<Category> getAll();
	
}
