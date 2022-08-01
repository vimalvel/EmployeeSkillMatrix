package com.chainsys.employeeskillmatrix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skills")
public class Skills {
	@Id
	@Column(name="SKILL_ID")
	private int skillId;
	@Column(name="SKILL_NAME")
	private String skillName;
	@Column(name="SKILL_TYPE")
	private String skillType;
	@Column(name="PREREQUEST")
    private String prerequest ;
	@Column(name="TEST_ID")
    private int testId;
	@Column(name="PASSMARK")
    private int passMark;
	@Column(name="EMPLOYEE_LEVEL")
    private int employeeLevel;
	
	
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getSkillType() {
		return skillType;
	}
	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}
	public String getPrerequest() {
		return prerequest;
	}
	public void setPrerequest(String prerequest) {
		this.prerequest = prerequest;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public int getPassMark() {
		return passMark;
	}
	public void setPassMark(int passMark) {
		this.passMark = passMark;
	}
	public int getEmployeeLevel() {
		return employeeLevel;
	}
	public void setEmployeeLevel(int employeeLevel) {
		this.employeeLevel = employeeLevel;
	}
	

}

