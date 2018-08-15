package jvb002.bookstore.app.model.publishermanagement;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publishinghouse")
public class Publisher {
	@Id
	@Column(name = "PublishID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long publishID;

	@Column(name = "Name")
	private String name;

	@Column(name = "Description")
	private String description;

	@Column(name = "Created_UserID")
	private int createdUserID;

	@Column(name = "Created_Date")
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
