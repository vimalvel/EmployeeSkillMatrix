package com.chainsys.employeeskillmatrix.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.employeeskillmatrix.model.EmployeeSkillDetails;
import com.chainsys.employeeskillmatrix.model.Skills;

public class SkillsAndEmployeeSkillDetailsDTO {
	private Skills skills;
	private List<EmployeeSkillDetails> employeeskilldetails=new ArrayList<>();
	public Skills getSkills() {
		return skills;
	}
	public void setSkills(Skills skills) {
		this.skills = skills;
	}
	public List<EmployeeSkillDetails> getEmployeeskilldetails() {
		return employeeskilldetails;
	}
	public void addEmployeeSkillIdDetails(EmployeeSkillDetails employeeSkillDetails) {
		employeeskilldetails.add(employeeSkillDetails);
	}
	

}
