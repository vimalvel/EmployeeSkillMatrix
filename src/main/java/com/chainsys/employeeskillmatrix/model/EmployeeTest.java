package com.chainsys.employeeskillmatrix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeetest")
public class EmployeeTest {
	@Id
	@Column(name = "TEST_ID")
	private int testId;
	@Column(name = "TEST_NAME")
	private String testName;
	@Column(name = "MAX_MARK")
	private int maxMark;
	@Column(name = "PASSMARK")
	private int passMark;
	@Column(name="SUBJECT")
    private String subject;
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public int getMaxMark() {
		return maxMark;
	}
	public void setMaxMark(int maxMark) {
		this.maxMark = maxMark;
	}
	public int getPassMark() {
		return passMark;
	}
	public void setPassMark(int passMark) {
		this.passMark = passMark;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	

}
