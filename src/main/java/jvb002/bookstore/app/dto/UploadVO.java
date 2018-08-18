package jvb002.bookstore.app.dto;

import javax.persistence.Column;

public class UploadVO {

	private int id;
	
	private String fileName;
	
	private String uploadFileName;
	
	private int bookId;
	
	private String createDate;
	
	private int createUserID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public int getCreateUserID() {
		return createUserID;
	}

	public void setCreateUserID(int createUserID) {
		this.createUserID = createUserID;
	}

	
}
