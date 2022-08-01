package com.chainsys.employeeskillmatrix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.model.TestEmployeeDetails;
import com.chainsys.employeeskillmatrix.repository.TestEmpDetailsRepository;

@Service
public class TestEmpDetailsService {
	@Autowired
	private TestEmpDetailsRepository repo;
	public List<TestEmployeeDetails> getEmpTestetails(){
		List<TestEmployeeDetails> tests = repo.findAll();
		return tests;
	}
	public TestEmployeeDetails save(TestEmployeeDetails testdetails) {
		return repo.save(testdetails);
	}
	public TestEmployeeDetails findByid(int id) {
		return repo.findById(id);
	}
	public void deleteById(int id) {
		repo.deleteById(id);
	}


}
