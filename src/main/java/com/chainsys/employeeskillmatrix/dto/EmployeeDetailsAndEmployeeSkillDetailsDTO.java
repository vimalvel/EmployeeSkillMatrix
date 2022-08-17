package com.chainsys.employeeskillmatrix.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.employeeskillmatrix.model.EmployeeDetails;
import com.chainsys.employeeskillmatrix.model.EmployeeSkillDetails;

public class EmployeeDetailsAndEmployeeSkillDetailsDTO {
	private EmployeeDetails employeedetails;
	private List<EmployeeSkillDetails> employeeskilldetail = new ArrayList<>();
	public EmployeeDetails getEmployeedetails() {
		return employeedetails;
	}
	public void setEmployeedetails(EmployeeDetails employeedetails) {
		this.employeedetails = employeedetails;
	}
	public List<EmployeeSkillDetails> getEmployeeskilldetail() {
		return employeeskilldetail;
	}
	public void addEmployeeSkillDetails(EmployeeSkillDetails employeeSkillDetails) {
		employeeskilldetail.add(employeeSkillDetails);
	}
}
