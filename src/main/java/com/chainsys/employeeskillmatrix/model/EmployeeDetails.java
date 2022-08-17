package com.chainsys.employeeskillmatrix.model;

import java.sql.Date;
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
@Table(name = "employeedetails")
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "Employee_Id")
    @SequenceGenerator(name = "Employee_Id", sequenceName = "Employee_Id",  allocationSize = 1)
	@Column(name = "EMPLOYEE_ID")
	private int employeeId;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "ADDRESS ")
	private String address;
	@Column(name = "PHONE_NUMBER")
	private long phoneNumber;
	@Column(name = "DESIGNATION")
	private String designation;
	@Column(name = "EMPLOYEE_MANAGER ")
	private String employeeManager;
	@Column(name = "SALARY")
	private float salary;
	@Column(name = "PASSWORD")
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
