package com.chainsys.employeeskillmatrix.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="examdetails")
public class ExamDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "EXAM_ID")
    @SequenceGenerator(name = "EXAM_ID", sequenceName = "EXAM_ID",  allocationSize = 1)
	@Column(name="EXAM_ID")
	private int examId;
	@Column(name="EXAM_DATE")
	private Date examDate;
	@Column(name="TEST_ID")
	private int testId;
	@Column(name="START_TIME")
	private String startTime;
	@Column(name="END_TIME")
	private String endTime;
	@Column(name="EXAM_MODE")
	private String examMode;
	@Column(name="TOTAL_PARTICIPATION")
	private int totalParticipation;
	@Column(name="SUPERVICER")
	private String supervicer;
	@Column(name="NUMBER_OF_PASSED")
	private int numberOfPassed; 
	
	
	@OneToMany(mappedBy="examdetails",fetch=FetchType.LAZY)
	private List<EmployeeSkillDetails> employeeSkillDetails;
	
	public List<EmployeeSkillDetails> getEmployeeSkillDetails() {
		return employeeSkillDetails;
	}
	public void setEmployeeSkillDetails(List<EmployeeSkillDetails> employeeSkillDetails) {
		this.employeeSkillDetails = employeeSkillDetails;
	}
	@OneToMany(mappedBy="examDetails",fetch=FetchType.LAZY)
	private List<TestEmployeeDetails> testEmployeeDetails;
	
	public List<TestEmployeeDetails> getTestEmployeeDetails() {
		return testEmployeeDetails;
	}
	public void setTestEmployeeDetails(List<TestEmployeeDetails> testEmployeeDetails) {
		this.testEmployeeDetails = testEmployeeDetails;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="TEST_ID",nullable = false, insertable = false, updatable = false)
	private EmployeeTest test;
	
	public EmployeeTest getTest() {
		return test;
	}
	public void setTest(EmployeeTest test) {
		this.test = test;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public Date getExamDate() {
		return examDate;
	}
	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getExamMode() {
		return examMode;
	}
	public void setExamMode(String examMode) {
		this.examMode = examMode;
	}
	public int getTotalParticipation() {
		return totalParticipation;
	}
	public void setTotalParticipation(int totalParticipation) {
		this.totalParticipation = totalParticipation;
	}
	public String getSupervicer() {
		return supervicer;
	}
	public void setSupervicer(String supervicer) {
		this.supervicer = supervicer;
	}
	public int getNumberOfPassed() {
		return numberOfPassed;
	}
	public void setNumberOfPassed(int numberOfPassed) {
		this.numberOfPassed = numberOfPassed;
	}
	

}
