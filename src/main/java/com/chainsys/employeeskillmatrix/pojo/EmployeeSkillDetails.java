package com.chainsys.employeeskillmatrix.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeeskilldetails")
public class EmployeeSkillDetails {
	@Id
	private int EMPLOYEE_ID;
	private int SKILL_ID;
	private int EXAM_ID  ;
	private int MARK_SCORED;
	private String GRADE;
	public int getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(int empId) {
		EMPLOYEE_ID = empId;
	}
	public int getSKILL_ID() {
		return SKILL_ID;
	}
	public void setSKILL_ID(int skillId) {
		SKILL_ID = skillId;
	}
	public int getEXAM_ID() {
		return EXAM_ID;
	}
	public void setEXAM_ID(int examId) {
		EXAM_ID = examId;
	}
	public int getMARK_SCORED() {
		return MARK_SCORED;
	}
	public void setMARK_SCORED(int markScore) {
		MARK_SCORED = markScore;
	}
	public String getGRADE() {
		return GRADE;
	}
	public void setGRADE(String grade) {
		GRADE = grade;
	}
	

}
