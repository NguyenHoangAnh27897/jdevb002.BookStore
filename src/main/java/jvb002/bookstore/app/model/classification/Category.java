package jvb002.bookstore.app.model.classification;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	@Id
	@Column(name="categoryID")
	int categoryID;
	String description;
	int category_parentID;
	int created_userID;
	Date created_date;
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCategory_parentID() {
		return category_parentID;
	}
	public void setCategory_parentID(int category_parentID) {
		this.category_parentID = category_parentID;
	}
	public int getCreated_userID() {
		return created_userID;
	}
	public void setCreated_userID(int created_userID) {
		this.created_userID = created_userID;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	@Override
	public String toString() {
		return "Category [categoryID=" + categoryID + ", description=" + description + ", category_parentID="
				+ category_parentID + ", created_userID=" + created_userID + ", created_date=" + created_date + "]";
	}
	
}
