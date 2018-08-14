package jvb002.bookstore.app.dao.classification;

import jvb002.bookstore.app.model.classification.Category;

public interface ClassificationDAO {
	public void addCategory(Category c);

	public void updateCategory(Category c);
}
