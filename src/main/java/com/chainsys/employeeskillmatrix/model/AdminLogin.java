package com.chainsys.employeeskillmatrix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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

