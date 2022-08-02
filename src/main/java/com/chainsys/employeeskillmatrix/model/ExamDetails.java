package com.chainsys.employeeskillmatrix.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="examdetails")
public class ExamDetails {
	@Id
	@Column(name="EXAM_ID")
	private int examId;
	@Column(name="EXAM_DATE")
	private Date examDate;
	@Column(name="TEST_ID")
	private int testId;
	@Column(name="START_TIME")
	private Timestamp startTime;
	@Column(name="END_TIME")
	private Timestamp endTime;
	@Column(name="EXAM_MODE")
	private String examMode;
	@Column(name="TOTAL_PARTICIPATION")
	private int totalParticipation;
	@Column(name="SUPERVICER")
	private String supervicer;
	@Column(name="NUMBER_OF_PASSED")
	private int numberOfPassed; 
	
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
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
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
