package com.capgemini.appl.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


@Entity(name="Users")
@Table(name="Users")
public class Users {

	String loginId;
	String password;
	String role;

	public Users() {
		super();
	}

	
	@Id
	@Column(name="login_id")
	@Size(min=1, max=4, message="Id must be of size 1 to 4.")
	public String getLoginId() {
		return loginId;
	}


	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}


	
	@NotEmpty(message="Password is required.")
	@Size(min=1, max=8, message="Password must be of size 1 to 8.")
	@Column(name="password")
	public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="role")
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Users [loginId=" + loginId + ", password=" + password
				+ ", role=" + role + "]";
	}

	
	}
