package com.chainsys.employeeskillmatrix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.model.EmployeeTest;
import com.chainsys.employeeskillmatrix.repository.EmployeeTestRepository;

@Service
public class EmployeeTestService {
	@Autowired
	private EmployeeTestRepository repo;
	public List<EmployeeTest> getEmployeeTest(){
		List<EmployeeTest> emptest = repo.findAll();
		return emptest;
	}
	public EmployeeTest save(EmployeeTest emptest) {
		return repo.save(emptest);
	}
	public EmployeeTest findByid(int id) {
		return repo.findById(id);
	}
	public void deleteById(int id) {
		repo.deleteById(id);
	}

}
