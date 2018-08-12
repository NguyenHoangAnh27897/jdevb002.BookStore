package jvb002.bookstore.app.model.bookmanagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
	@Column(name = "UserID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Title")
	private String title;
	
	@Column(name = "Description")
	private String description;
	
	@Column(name = "Year_Publishing")
	private String yearPublishing;
	
	@Column(name = "View")
	private int view;
	
	@Column(name = "Download")
	private int download;
	
	@Column(name = "Author")
	private String author;
	
	@Column(name = "Language")
	private String language;
	
	@Column(name = "Image")
	private String image;
	
	@Column(name = "Type")
	private String type;
	
	@Column(name = "PublishID")
	private int publishID;
	
	@Column(name = "Created_Date")
	private String createdDate;
	
	@Column(name = "Created_UserID")
	private int createUserID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getYearPublishing() {
		return yearPublishing;
	}

	public void setYearPublishing(String yearPublishing) {
		this.yearPublishing = yearPublishing;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public int getDownload() {
		return download;
	}

	public void setDownload(int download) {
		this.download = download;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPublishID() {
		return publishID;
	}

	public void setPublishID(int publishID) {
		this.publishID = publishID;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public int getCreateUserID() {
		return createUserID;
	}

	public void setCreateUserID(int createUserID) {
		this.createUserID = createUserID;
	}
	
}
