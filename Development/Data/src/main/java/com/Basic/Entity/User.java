package com.Basic.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="User")
public class User {
     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="loginid")
	private String loginid;
	
	
	@Column(name="username")
	private String userName;
	
	
	@Column(name="password")
	private String password;
	
	
	@Column(name="email")
	private String email;
	
	@Column(name="privilage")
	private String privilage;

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrivilage() {
		return privilage;
	}

	public void setPrivilage(String privilage) {
		this.privilage = privilage;
	}

	public User(String loginid, String userName, String password, String email, String privilage) {
		super();
		this.loginid = loginid;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.privilage = privilage;
	}
	
	
}
