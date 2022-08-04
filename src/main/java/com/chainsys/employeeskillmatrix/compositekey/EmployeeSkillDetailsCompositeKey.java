package com.chainsys.employeeskillmatrix.compositekey;

import java.io.Serializable;

import javax.persistence.Column;

public class EmployeeSkillDetailsCompositeKey implements Serializable {
	@Column(name="EMPLOYEE_ID")
	private int employeeId;
	@Column(name="SKILL_ID")
	private int skillId;
	@Column(name="EXAM_ID")
	private int examId;
	EmployeeSkillDetailsCompositeKey(){
		
	}
	public EmployeeSkillDetailsCompositeKey(int employeeId,int skillId,int examId) {
		this.employeeId=employeeId;
		this.skillId=skillId;
		this.examId=examId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}

}
