package com.chainsys.employeeskillmatrix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;

import com.chainsys.employeeskillmatrix.compositekey.EmployeeSkillDetailsCompositeKey;

@Entity
@Table(name = "employeeskilldetails")
@IdClass(EmployeeSkillDetailsCompositeKey.class)
public class EmployeeSkillDetails {
	@Id
	@Column(name = "EMPLOYEE_ID")
	@Range(min=1 ,message = "*value should greater than 0")
	@NotEmpty(message="*fill the employee id")
	private int employeeId;
	@Id
	@Column(name = "SKILL_ID")
	@Range(min=1 ,message = "*value should greater than 0")
	@NotEmpty(message="*fill the skill id")
	private int skillId;
	@Id
	@Column(name = "EXAM_ID")
	@Range(min=1 ,message = "*value should greater than 0")
	@NotEmpty(message="*fill the exam id")
	private int examId;
	@Column(name = "MARK_SCORED")
	private int markScore;
	@Column(name = "GRADE")
	private String grade;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYEE_ID", nullable = false, insertable = false, updatable = false)
	private EmployeeDetails employeeDetails;

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}
	
    public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}
    @ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="SKILL_ID",nullable = false, insertable = false,updatable=false)
	private Skills skills;

	public Skills getSkills() {
		return skills;
	}

	public void setSkills(Skills skills) {
		this.skills = skills;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EXAM_ID",nullable= false, insertable = false, updatable = false)
	private ExamDetails examdetails;
	

	public ExamDetails getExamdetails() {
		return examdetails;
	}

	public void setExamdetails(ExamDetails examdetails) {
		this.examdetails = examdetails;
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
