package jvb002.bookstore.app.service.classification;


import java.util.List;

import jvb002.bookstore.app.model.classification.Category;

public interface ClassificationService {
	public void save(Category c);
	public void update(Category c);
	public void delete(int id);
	public Category getOne(int id);
	public List<Category> getAll();
	
}
