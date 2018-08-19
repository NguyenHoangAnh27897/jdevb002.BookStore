package jvb002.bookstore.app.model.classification;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import jvb002.bookstore.app.model.bookmanagement.Book;

@Entity
@Table(name = "category")
public class Category {
	@Id
	@Column(name = "categoryID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryID;
	
	@Column(name="name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "category_parentID")
	private int category_parentID;
	
	@Column(name = "created_userID")
	private int created_userID;
	
	@Column(name = "created_date")
	private Date created_date;
	
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "book_category",
			   joinColumns = { @JoinColumn(name = "bookID") }, 
			   inverseJoinColumns = {@JoinColumn(name = "categoryID") })
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
		return "Category [categoryID=" + categoryID + ", description=" + description + ", category_parentID="
				+ category_parentID + ", created_userID=" + created_userID + ", created_date=" + created_date + "]";
	}

}
