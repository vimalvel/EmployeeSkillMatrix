package com.chainsys.employeeskillmatrix.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.compositekey.TestEmployeeDetailsCompositeKey;
import com.chainsys.employeeskillmatrix.model.TestEmployeeDetails;
import com.chainsys.employeeskillmatrix.repository.TestEmployeeDetailsRepository;

@Service
public class TestEmployeeDetailsService {
	@Autowired
	private TestEmployeeDetailsRepository testEmpDetailsRepository;
	public List<TestEmployeeDetails> getEmpTestetails(){
		return testEmpDetailsRepository.findAll();
	}
	public TestEmployeeDetails save(TestEmployeeDetails testdetails) {
		return testEmpDetailsRepository.save(testdetails);
	}
	public Optional<TestEmployeeDetails> findByid(TestEmployeeDetailsCompositeKey id) {
		return testEmpDetailsRepository.findById(id);
	}
	public void deleteById(TestEmployeeDetailsCompositeKey id) {
		testEmpDetailsRepository.deleteById(id);
	}


}
