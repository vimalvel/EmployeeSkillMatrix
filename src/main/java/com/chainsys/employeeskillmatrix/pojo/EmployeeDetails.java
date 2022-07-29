package com.chainsys.employeeskillmatrix.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
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
	private float SALARY ;
	private String PASSWORD ;
	public int getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(int eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public long getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}
	public void setPHONE_NUMBER(long pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}
	public String getDESIGNATION() {
		return DESIGNATION;
	}
	public void setDESIGNATION(String dESIGNATION) {
		DESIGNATION = dESIGNATION;
	}
	public String getEMPLOYEE_MANAGER() {
		return EMPLOYEE_MANAGER;
	}
	public void setEMPLOYEE_MANAGER(String eMPLOYEE_MANAGER) {
		EMPLOYEE_MANAGER = eMPLOYEE_MANAGER;
	}
	public float getSALARY() {
		return SALARY;
	}
	public void setSALARY(float sALARY) {
		SALARY = sALARY;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	
	

}
