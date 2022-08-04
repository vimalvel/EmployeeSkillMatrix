package com.chainsys.employeeskillmatrix.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.employeeskillmatrix.model.EmployeeDetails;
import com.chainsys.employeeskillmatrix.model.TestEmployeeDetails;

public class EmployeeDetailsAndTestEmployeeDetailsDTO {
	private EmployeeDetails employeedetails;
	private List<TestEmployeeDetails> testemployeedetails = new ArrayList<TestEmployeeDetails>();
	public EmployeeDetails getEmployeedetails() {
		return employeedetails;
	}
	public void setEmployeedetails(EmployeeDetails employeedetails) {
		this.employeedetails = employeedetails;
	}
	public List<TestEmployeeDetails> getTestemployeedetails() {
		return testemployeedetails;
	}
	public void addTestEmployeeDetails(TestEmployeeDetails testEmployeeDetails) {
		testemployeedetails.add(testEmployeeDetails);
	}

}
