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
	public void setTEST_ID(int testId) {
		TEST_ID = testId;
	}
	public String getTEST_NAME() {
		return TEST_NAME;
	}
	public void setTEST_NAME(String testName) {
		TEST_NAME = testName;
	}
	public int getMAX_MARK() {
		return MAX_MARK;
	}
	public void setMAX_MARK(int maxMark) {
		MAX_MARK = maxMark;
	}
	public int getPASSMARK() {
		return PASSMARK;
	}
	public void setPASSMARK(int passMark) {
		PASSMARK = passMark;
	}
	public String getSUBJECT() {
		return SUBJECT;
	}
	public void setSUBJECT(String subject) {
		SUBJECT = subject;
	}
	
}

