package com.app.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="usr_tab")
public class User {
	@Id
	@Column(name="u_id")
	@GeneratedValue(generator="ugen")
	@GenericGenerator(name="ugen",strategy="increment")
	private Integer userId;
	
	@Column(name="u_name")
	private String userName;
	@Column(name="u_email")
	private String userEmail;
	@Column(name="u_pwd")
	private String userPwd;
	
	@ElementCollection
	@CollectionTable(name="usr_roles_tab",
		joinColumns=@JoinColumn(name="u_id")
	)	
	@Column(name="role")
	private Set<String> userRoles;
	
	public User() {
		super();
	}
	public User(Integer userId) {
		super();
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPwd=" + userPwd
				+ ", userRoles=" + userRoles + "]";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public Set<String> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(Set<String> userRoles) {
		this.userRoles = userRoles;
	}
	
	
}
