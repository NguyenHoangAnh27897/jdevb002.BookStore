package jvb002.bookstore.app.service.classification;


import java.util.List;

import jvb002.bookstore.app.dto.CategoryVO;

public interface ClassificationService {
	public void save(CategoryVO c);
	public void update(CategoryVO c);
	public void delete(int id);
	public CategoryVO getOne(int id);
	public List<CategoryVO> getAll();
	
}
