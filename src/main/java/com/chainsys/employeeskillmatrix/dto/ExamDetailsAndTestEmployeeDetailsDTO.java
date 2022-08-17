package com.chainsys.employeeskillmatrix.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.employeeskillmatrix.model.ExamDetails;
import com.chainsys.employeeskillmatrix.model.TestEmployeeDetails;

public class ExamDetailsAndTestEmployeeDetailsDTO {
	private ExamDetails examdetails;
	private List<TestEmployeeDetails> testemployeedetails = new ArrayList<>();
	public ExamDetails getExamdetails() {
		return examdetails;
	}
	public void setExamdetails(ExamDetails examdetails) {
		this.examdetails = examdetails;
	}
	public List<TestEmployeeDetails> getTestemployeedetails() {
		return testemployeedetails;
	}
	public void addTestEmployeeDetails(TestEmployeeDetails testEmployeeDetails) {
		testemployeedetails.add(testEmployeeDetails);
	}

}
