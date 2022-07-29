package com.chainsys.employeeskillmatrix.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeTest {
	@Id
	private int TEST_ID;
	private String TEST_NAME;
	private int MAX_MARK;
	private int PASSMARK ;
	private String SUBJECT;
	public int getTEST_ID() {
		return TEST_ID;
	}
	public void setTEST_ID(int tEST_ID) {
		TEST_ID = tEST_ID;
	}
	public String getTEST_NAME() {
		return TEST_NAME;
	}
	public void setTEST_NAME(String tEST_NAME) {
		TEST_NAME = tEST_NAME;
	}
	public int getMAX_MARK() {
		return MAX_MARK;
	}
	public void setMAX_MARK(int mAX_MARK) {
		MAX_MARK = mAX_MARK;
	}
	public int getPASSMARK() {
		return PASSMARK;
	}
	public void setPASSMARK(int pASSMARK) {
		PASSMARK = pASSMARK;
	}
	public String getSUBJECT() {
		return SUBJECT;
	}
	public void setSUBJECT(String sUBJECT) {
		SUBJECT = sUBJECT;
	}
	
}

