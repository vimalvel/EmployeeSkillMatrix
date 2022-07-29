package com.chainsys.employeeskillmatrix.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
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
	public void setEMPLOYEE_ID(int eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	public int getSKILL_ID() {
		return SKILL_ID;
	}
	public void setSKILL_ID(int sKILL_ID) {
		SKILL_ID = sKILL_ID;
	}
	public int getEXAM_ID() {
		return EXAM_ID;
	}
	public void setEXAM_ID(int eXAM_ID) {
		EXAM_ID = eXAM_ID;
	}
	public int getMARK_SCORED() {
		return MARK_SCORED;
	}
	public void setMARK_SCORED(int mARK_SCORED) {
		MARK_SCORED = mARK_SCORED;
	}
	public String getGRADE() {
		return GRADE;
	}
	public void setGRADE(String gRADE) {
		GRADE = gRADE;
	}
	

}
