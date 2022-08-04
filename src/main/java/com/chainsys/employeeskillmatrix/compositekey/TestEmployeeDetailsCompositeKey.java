package com.chainsys.employeeskillmatrix.compositekey;

import java.io.Serializable;

import javax.persistence.Column;

public class TestEmployeeDetailsCompositeKey implements Serializable {
	@Column(name="EXAM_ID")
	private int examId;
	@Column(name="EMPLOYEE_ID")
	private int employeeId;
	@Column(name="STATUS")
	private String status;
	TestEmployeeDetailsCompositeKey(){
		
	}
	public TestEmployeeDetailsCompositeKey(int examId,int employeeId) {
		this.employeeId=employeeId;
		this.examId=examId;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
