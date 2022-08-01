package com.chainsys.employeeskillmatrix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.pojo.EmployeeDetails;
import com.chainsys.employeeskillmatrix.repository.EmployeeDetailsRepository;

@Service
public class EmployeeDetailsService {
	@Autowired
	private EmployeeDetailsRepository repo;
	public List<EmployeeDetails> getEmployeeDetails(){
		List<EmployeeDetails> emplist = repo.findAll();
		return emplist;
	}
	public EmployeeDetails save(EmployeeDetails empdetails) {
		return repo.save(empdetails);
	}
	public EmployeeDetails findByid(int id) {
		return repo.findById(id);
	}
	public void deleteById(int emp_id) {
		repo.deleteById(emp_id);
	}

}
