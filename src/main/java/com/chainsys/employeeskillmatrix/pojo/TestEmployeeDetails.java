package com.chainsys.employeeskillmatrix.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TestEmployeeDetails {
	@Id
	private int EXAM_ID;
	private int EMPLOYEE_ID;
	private String STATUS;

	public int getEXAM_ID() {
		return EXAM_ID;
	}
	public void setEXAM_ID(int eXAM_ID) {
		EXAM_ID = eXAM_ID;
	}
	public int getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(int eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	
}

