package com.chainsys.employeeskillmatrix.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Skills {
	@Id
	private int SKILL_ID;
	private String SKILL_NAME;
	private String SKILL_TYPE;
    private String PREREQUEST;
    private int TEST_ID;
    private int PASSMARK;
    private int EMPLOYEE_LEVEL;
	public int getSKILL_ID() {
		return SKILL_ID;
	}
	public void setSKILL_ID(int skillId) {
		SKILL_ID = skillId;
	}
	public String getSKILL_NAME() {
		return SKILL_NAME;
	}
	public void setSKILL_NAME(String skillName) {
		SKILL_NAME = skillName;
	}
	public String getSKILL_TYPE() {
		return SKILL_TYPE;
	}
	public void setSKILL_TYPE(String skillType) {
		SKILL_TYPE = skillType;
	}
	public String getPREREQUEST() {
		return PREREQUEST;
	}
	public void setPREREQUEST(String prerequest) {
		PREREQUEST = prerequest;
	}
	public int getTEST_ID() {
		return TEST_ID;
	}
	public void setTEST_ID(int testId) {
		TEST_ID = testId;
	}
	public int getPASSMARK() {
		return PASSMARK;
	}
	public void setPASSMARK(int passMark) {
		PASSMARK = passMark;
	}
	public int getEMPLOYEE_LEVEL() {
		return EMPLOYEE_LEVEL;
	}
	public void setEMPLOYEE_LEVEL(int employeeLevel) {
		EMPLOYEE_LEVEL = employeeLevel;
	}
	

}

