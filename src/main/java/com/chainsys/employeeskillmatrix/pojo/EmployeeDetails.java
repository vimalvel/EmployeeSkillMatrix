package com.chainsys.employeeskillmatrix.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeedetails")
public class EmployeeDetails {
	@Id
	private int EMPLOYEE_ID ;
	private String FIRST_NAME;
	private String LAST_NAME  ;
	private String GENDER;
	private Date DOB ;
	private String EMAIL ;
	private String ADDRESS ;
	private long PHONE_NUMBER ;
	private String DESIGNATION ;
	private String EMPLOYEE_MANAGER ;
	private float SALARY;
	private String PASSWORD ;
	public int getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(int employeeId) {
		EMPLOYEE_ID = employeeId;
	}
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	public void setFIRST_NAME(String firstName) {
		FIRST_NAME = firstName;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String lastName) {
		LAST_NAME = lastName;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gender) {
		GENDER = gender;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dob) {
		DOB = dob;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String email) {
		EMAIL = email;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String address) {
		ADDRESS = address;
	}
	public long getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}
	public void setPHONE_NUMBER(long phoneNumer) {
		PHONE_NUMBER = phoneNumer;
	}
	public String getDESIGNATION() {
		return DESIGNATION;
	}
	public void setDESIGNATION(String designation) {
		DESIGNATION = designation;
	}
	public String getEMPLOYEE_MANAGER() {
		return EMPLOYEE_MANAGER;
	}
	public void setEMPLOYEE_MANAGER(String employeeManager) {
		EMPLOYEE_MANAGER = employeeManager;
	}
	public float getSALARY() {
		return SALARY;
	}
	public void setSALARY(float salary) {
		SALARY = salary;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String password) {
		PASSWORD = password;
	}
	
	

}
