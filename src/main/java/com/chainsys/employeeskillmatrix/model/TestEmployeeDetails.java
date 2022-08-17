package com.chainsys.employeeskillmatrix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.chainsys.employeeskillmatrix.compositekey.TestEmployeeDetailsCompositeKey;

@Entity
@Table(name="testemployeedetails")
@IdClass(TestEmployeeDetailsCompositeKey.class)
public class TestEmployeeDetails {
	@Id
	@Column(name="EXAM_ID")
	private int examId;
	@Id
	@Column(name="EMPLOYEE_ID")
	private int employeeId;
	@Column(name="STATUS")
	private String status;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXAM_ID",nullable = false, insertable = false, updatable = false)
	private ExamDetails examDetails;
	
	public ExamDetails getExamdetails() {
		return examDetails;
	}
	public void setExamdetails(ExamDetails examdetails) {
		this.examDetails = examdetails;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMPLOYEE_ID",nullable = false, insertable = false, updatable = false)
	public EmployeeDetails employeedetails;
	
	public EmployeeDetails getEmployeedetails() {
		return employeedetails;
	}
	public void setEmployeedetails(EmployeeDetails employeedetails) {
		this.employeedetails = employeedetails;
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

