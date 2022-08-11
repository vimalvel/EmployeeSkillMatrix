package com.chainsys.employeeskillmatrix.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;

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
	
	@OneToMany(mappedBy="skills",fetch=FetchType.LAZY)
	private List<EmployeeSkillDetails> employeeskilldetails;
	public List<EmployeeSkillDetails> getEmployeeskilldetails() {
		return employeeskilldetails;
	}
	public void setEmployeeskilldetails(List<EmployeeSkillDetails> employeeskilldetails) {
		this.employeeskilldetails = employeeskilldetails;
	}
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
	
	

}

