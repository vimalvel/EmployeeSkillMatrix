package com.chainsys.employeeskillmatrix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="testemployeedetails")
public class TestEmployeeDetails {
	@Id
	@Column(name="EXAM_ID")
	private int examId;
	@Column(name="EMPLOYEE_ID")
	private int employeeId;
	@Column(name="STATUS")
	private String status;
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

