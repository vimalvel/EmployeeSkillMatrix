package com.chainsys.employeeskillmatrix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeeskilldetails")
public class EmployeeSkillDetails {
	@Id
	@Column(name="EMPLOYEE_ID")
	private int employeeId;
	@Column(name="SKILL_ID")
	private int skillId;
	@Column(name="EXAM_ID")
	private int examId;
	@Column(name="MARK_SCORED")
	private int markScore;
	@Column(name="GRADE")
	private String grade;
	
	

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
	public int getMarkScore() {
		return markScore;
	}
	public void setMarkScore(int markScore) {
		this.markScore = markScore;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
