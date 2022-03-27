package com.onlineSeat.Model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="USERID")
	private int userId;
	@Column(name="USERNAME")
	private String userName;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="EMAILID")
	private String emailId;
	
	@OneToOne(cascade = CascadeType.ALL , mappedBy = "user")
	
	private Booking booking;

	
	
	
	  public User(int userId, String userName, String password, String emailId) {
	  super(); 
	  this.userId = userId;
	  this.userName = userName;
	  this.password =password;
	  this.emailId = emailId;
	  
	  }
	 
	 

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", emailId=" + emailId
				+ ", booking=" + booking + "]";
	}
	
	

	

}