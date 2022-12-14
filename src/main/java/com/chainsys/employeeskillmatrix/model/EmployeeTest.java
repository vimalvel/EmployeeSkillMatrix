package com.chainsys.employeeskillmatrix.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "employee_test")
public class EmployeeTest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "TEST_ID")
	@SequenceGenerator(name = "TEST_ID", sequenceName = "TEST_ID", allocationSize = 1)
	@Column(name = "TEST_ID")
	private int testId;
	@Column(name = "TEST_NAME")
	private String testName;
	@Column(name = "MAX_MARK")
	private int maxMark;
	@Column(name = "PASSMARK")
	private int passMark;

	@OneToMany(mappedBy = "test", fetch = FetchType.LAZY)
	private List<ExamDetails> examDetails;

	public List<ExamDetails> getExamDetails() {
		return examDetails;
	}

	public void setExamDetails(List<ExamDetails> examDetails) {
		this.examDetails = examDetails;
	}

	@OneToMany(mappedBy = "employeeTest", fetch = FetchType.LAZY)
	private List<Skills> skills;

	public List<Skills> getSkills() {
		return skills;
	}

	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public int getMaxMark() {
		return maxMark;
	}

	public void setMaxMark(int maxMark) {
		this.maxMark = maxMark;
	}

	public int getPassMark() {
		return passMark;
	}

	public void setPassMark(int passMark) {
		this.passMark = passMark;
	}

}
