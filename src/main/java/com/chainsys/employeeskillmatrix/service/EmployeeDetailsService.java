package com.chainsys.employeeskillmatrix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.model.EmployeeDetails;
import com.chainsys.employeeskillmatrix.repository.EmployeeDetailsRepository;

@Service
public class EmployeeDetailsService {
	@Autowired
	private EmployeeDetailsRepository employeeDetailsRepository;
	public List<EmployeeDetails> getEmployeeDetails(){
		List<EmployeeDetails> emplist = employeeDetailsRepository.findAll();
		return emplist;
	}
	public EmployeeDetails save(EmployeeDetails empdetails) {
		return employeeDetailsRepository.save(empdetails);
	}
	public EmployeeDetails findByid(int id) {
		return employeeDetailsRepository.findById(id);
	}
	public void deleteById(int emp_id) {
		employeeDetailsRepository.deleteById(emp_id);
	}

}
