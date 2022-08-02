package com.chainsys.employeeskillmatrix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.model.TestEmployeeDetails;
import com.chainsys.employeeskillmatrix.repository.TestEmployeeDetailsRepository;

@Service
public class TestEmployeeDetailsService {
	@Autowired
	private TestEmployeeDetailsRepository testEmpDetailsRepository;
	public List<TestEmployeeDetails> getEmpTestetails(){
		List<TestEmployeeDetails> tests = testEmpDetailsRepository.findAll();
		return tests;
	}
	public TestEmployeeDetails save(TestEmployeeDetails testdetails) {
		return testEmpDetailsRepository.save(testdetails);
	}
	public TestEmployeeDetails findByid(int id) {
		return testEmpDetailsRepository.findById(id);
	}
	public void deleteById(int id) {
		testEmpDetailsRepository.deleteById(id);
	}


}
