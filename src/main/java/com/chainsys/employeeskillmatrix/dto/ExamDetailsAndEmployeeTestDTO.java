package com.chainsys.employeeskillmatrix.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.employeeskillmatrix.model.EmployeeTest;
import com.chainsys.employeeskillmatrix.model.ExamDetails;

public class ExamDetailsAndEmployeeTestDTO {
	private EmployeeTest employeetest;
	public List<ExamDetails> examDetails = new ArrayList<ExamDetails>();
	public EmployeeTest getEmployeetest() {
		return employeetest;
	}
	public void setEmployeetest(EmployeeTest employeetest) {
		this.employeetest = employeetest;
	}
	public List<ExamDetails> getExamDetails() {
		return examDetails;
	}
	public void addExamDetails(ExamDetails examDetail) {
		examDetails.add(examDetail);
	}

}
