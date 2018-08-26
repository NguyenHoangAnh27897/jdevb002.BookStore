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
	@Column(name="PublishID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long publishID;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Created_UserID")
	private int createdUserID;
	
	@Column(name="Created_Date")
	private Date createdDate;
<<<<<<< HEAD

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

=======
	
	public Publisher() {
	}
	public Publisher(long publishID, String name, String description, int createdUserID, Date createdDate) {
		this.publishID = publishID;
		this.name = name;
		this.description = description;
		this.createdUserID = createdUserID;
		this.createdDate = createdDate;
	}
>>>>>>> parent of 3cb1416... [Nhã] Model + PublisherVO + ConvertUtils + Controller
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

<<<<<<< HEAD

=======

	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
>>>>>>> parent of 3cb1416... [Nhã] Model + PublisherVO + ConvertUtils + Controller

}
