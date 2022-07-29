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
	public void setSKILL_ID(int sKILL_ID) {
		SKILL_ID = sKILL_ID;
	}
	public String getSKILL_NAME() {
		return SKILL_NAME;
	}
	public void setSKILL_NAME(String sKILL_NAME) {
		SKILL_NAME = sKILL_NAME;
	}
	public String getSKILL_TYPE() {
		return SKILL_TYPE;
	}
	public void setSKILL_TYPE(String sKILL_TYPE) {
		SKILL_TYPE = sKILL_TYPE;
	}
	public String getPREREQUEST() {
		return PREREQUEST;
	}
	public void setPREREQUEST(String pREREQUEST) {
		PREREQUEST = pREREQUEST;
	}
	public int getTEST_ID() {
		return TEST_ID;
	}
	public void setTEST_ID(int tEST_ID) {
		TEST_ID = tEST_ID;
	}
	public int getPASSMARK() {
		return PASSMARK;
	}
	public void setPASSMARK(int pASSMARK) {
		PASSMARK = pASSMARK;
	}
	public int getEMPLOYEE_LEVEL() {
		return EMPLOYEE_LEVEL;
	}
	public void setEMPLOYEE_LEVEL(int eMPLOYEE_LEVEL) {
		EMPLOYEE_LEVEL = eMPLOYEE_LEVEL;
	}
	

}

