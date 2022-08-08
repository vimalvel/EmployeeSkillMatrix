package com.chainsys.employeeskillmatrix.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "employeedetails")
public class EmployeeDetails {
	@Id
	@Column(name = "EMPLOYEE_ID")
	@Range(min=1,message="*value should greater than 0")
	@NotEmpty(message="*Fill the Employee Id")
	private int employeeId;
	@Column(name = "FIRST_NAME")
	@Size(min=3,max=15,message="*it must be in alpabet")
	@NotEmpty(message="*Fill the first name")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "GENDER")
	@NotEmpty(message="*")
	private String gender;
	@Column(name = "DOB")
	@Pattern(regexp="^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$")
	@NotEmpty(message="*")
	private Date dob;
	@Column(name = "EMAIL")
	@Email
	@NotEmpty
	private String email;
	@Column(name = "ADDRESS ")
	@NotEmpty
	private String address;
	@Column(name = "PHONE_NUMBER")
	@Pattern(regexp="^[0-9]{10}$")
	@NotEmpty(message="*")
	private long phoneNumber;
	@Column(name = "DESIGNATION")
	@NotEmpty(message="*")
	@Size(min=3,max=15,message="*it must be in alpabet")
	private String designation;
	@Column(name = "EMPLOYEE_MANAGER ")
	@NotEmpty(message="*")
	@Size(min=3,max=15,message="*it must be in alpabet")
	private String employeeManager;
	@Column(name = "SALARY")
	private float salary;
	@Column(name = "PASSWORD")
	@Pattern(regexp="^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$",message="please enter the correct format *Welcomee@13")
	private String password;
	@OneToMany(mappedBy="employeeDetails",fetch=FetchType.LAZY)
	private List<EmployeeSkillDetails> employeeSkillDetails;
	
	
	public List<EmployeeSkillDetails> getEmployeeSkillDetails() {
		return employeeSkillDetails;
	}
	public void setEmployeeSkillDetails(List<EmployeeSkillDetails> employeeSkillDetails) {
		this.employeeSkillDetails = employeeSkillDetails;
	}
	@OneToMany(mappedBy="employeedetails",fetch=FetchType.LAZY)
	private List<TestEmployeeDetails> testEmployeeDetails;
	
	public List<TestEmployeeDetails> getTestEmployeeDetails() {
		return testEmployeeDetails;
	}
	public void setTestEmployeeDetails(List<TestEmployeeDetails> testEmployeeDetails) {
		this.testEmployeeDetails = testEmployeeDetails;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmployeeManager() {
		return employeeManager;
	}
	public void setEmployeeManager(String employeeManager) {
		this.employeeManager = employeeManager;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
