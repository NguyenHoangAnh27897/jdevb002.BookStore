package jvb002.bookstore.app.dto;

import java.util.Date;
import java.util.List;
import java.util.Set;

import jvb002.bookstore.app.model.publishermanagement.Publisher;
import jvb002.bookstore.app.model.usermanagement.User;

public class BookVO {
	
	private int bookID;
	
	private String title;
	
	private String description;
	
	private String year_Publisher;
	
	private int view;
	
	private int download;
	
	private String author;
	
	private String Language;
	
	private String image;
	
	private int publishID;
	
	private String[] categoryId; 
	
	public List<CategoryVO> listCategory;
	
	public List<PublisherVO> publish;
	
	public Date Create_Date;
	
	public User userId;

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
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

	public String getYear_Publisher() {
		return year_Publisher;
	}

	public void setYear_Publisher(String year_Publisher) {
		this.year_Publisher = year_Publisher;
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
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getPublishID() {
		return publishID;
	}

	public void setPublishID(int publishID) {
		this.publishID = publishID;
	}

	public String[] getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String[] categoryId) {
		this.categoryId = categoryId;
	}

	public List<CategoryVO> getListCategory() {
		return listCategory;
	}

	public void setListCategory(List<CategoryVO> listCategory) {
		this.listCategory = listCategory;
	}

	public List<PublisherVO> getPublish() {
		return publish;
	}

	public void setPublish(List<PublisherVO> publish) {
		this.publish = publish;
	}

	public Date getCreate_Date() {
		return Create_Date;
	}

	public void setCreate_Date(Date create_Date) {
		Create_Date = create_Date;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}
	
	
}
