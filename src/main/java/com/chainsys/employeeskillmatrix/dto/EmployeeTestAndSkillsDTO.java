package com.chainsys.employeeskillmatrix.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.employeeskillmatrix.model.EmployeeTest;
import com.chainsys.employeeskillmatrix.model.Skills;

public class EmployeeTestAndSkillsDTO {
	private EmployeeTest employeetest;
	private List<Skills> skills = new ArrayList<Skills>();
	public EmployeeTest getEmployeetest() {
		return employeetest;
	}
	public void setEmployeetest(EmployeeTest employeetest) {
		this.employeetest = employeetest;
	}
	public List<Skills> getSkills() {
		return skills;
	}
	public void addSkills(Skills skill) {
		skills.add(skill);
	}

}
