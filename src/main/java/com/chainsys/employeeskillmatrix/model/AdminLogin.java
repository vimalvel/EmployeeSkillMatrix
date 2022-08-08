package com.chainsys.employeeskillmatrix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.lang.NonNull;

@Entity
@Table(name="adminlogin")
public class AdminLogin {
	@Id
	@Column(name="ADMIN_ID")
	@Range(min=1,message="*value should greater than 0")
	private int adminId;
	
	@Column(name="ADMIN_EMAIL")
	@Email(message="*example@45gmail.com")
	@NotEmpty(message ="fill the email")
	private String adminEmail;
	
	@Column(name="PASSWORD")
	@Pattern(regexp="^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$",message="please enter the correct format *Welcomee@13")
	@NotEmpty(message = "fill the password")
	private String password;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	

}

