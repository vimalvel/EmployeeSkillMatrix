package com.chainsys.employeeskillmatrix.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.employeeskillmatrix.model.EmployeeSkillDetails;
import com.chainsys.employeeskillmatrix.model.ExamDetails;

public class ExamDetailsAndEmployeeSkillDetailsDTO {
	private ExamDetails examdetails;
	private List<EmployeeSkillDetails> employeeskilldetails=new ArrayList<EmployeeSkillDetails>();
	public ExamDetails getExamdetails() {
		return examdetails;
	}
	public void setExamdetails(ExamDetails examdetails) {
		this.examdetails = examdetails;
	}
	public List<EmployeeSkillDetails> getEmployeeskilldetails() {
		return employeeskilldetails;
	}
	public void addEmployeeSkillDetails(EmployeeSkillDetails employeeSkillDetails) {
		employeeskilldetails.add(employeeSkillDetails);
	}
}
