package jvb002.bookstore.app.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


import jvb002.bookstore.app.model.bookmanagement.Book;

public class CategoryVO {

		
		private int categoryID;


		private String name;

	
		private String description;

		
		private int category_parentID;

		
		private int created_userID;

		
		private Date created_date;

		private Set<Book> book = new HashSet<Book>();

		public Set<Book> getBook() {
			return book;
		}

		public void setBook(Set<Book> book) {
			this.book = book;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

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
			return "Category [categoryID=" + categoryID + ", name=" + name + ", description=" + description
					+ ", category_parentID=" + category_parentID + ", created_userID=" + created_userID + ", created_date="
					+ created_date + ", book=" + book + "]";
		}
}
