package jvb002.bookstore.app.dto;

import java.sql.Date;

public class PublisherVO {
	private long publishID;

	private String name;

	private String description;

	private int createdUserID;

	private Date createdDate;

	public long getPublishID() {
		return publishID;
	}

	public void setPublishID(long publishID) {
		this.publishID = publishID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCreatedUserID() {
		return createdUserID;
	}

	public void setCreatedUserID(int createdUserID) {
		this.createdUserID = createdUserID;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}