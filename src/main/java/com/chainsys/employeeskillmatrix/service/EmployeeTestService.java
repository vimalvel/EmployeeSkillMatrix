package com.chainsys.employeeskillmatrix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.model.EmployeeTest;
import com.chainsys.employeeskillmatrix.repository.EmployeeTestRepository;

@Service
public class EmployeeTestService {
	@Autowired
	private EmployeeTestRepository employeeTestRepository;
	public List<EmployeeTest> getEmployeeTest(){
		List<EmployeeTest> emptest = employeeTestRepository.findAll();
		return emptest;
	}
	public EmployeeTest save(EmployeeTest emptest) {
		return employeeTestRepository.save(emptest);
	}
	public EmployeeTest findByid(int id) {
		return employeeTestRepository.findById(id);
	}
	public void deleteById(int id) {
		employeeTestRepository.deleteById(id);
	}

}
