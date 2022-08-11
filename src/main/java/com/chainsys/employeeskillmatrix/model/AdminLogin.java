package com.chainsys.employeeskillmatrix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
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
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "admin_id")
    @SequenceGenerator(name = "admin_id", sequenceName = "admin_id",  allocationSize = 1)
	@Column(name="ADMIN_ID")
	private int adminId;
	@Column(name="PASSWORD")
	private String password;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	

}

