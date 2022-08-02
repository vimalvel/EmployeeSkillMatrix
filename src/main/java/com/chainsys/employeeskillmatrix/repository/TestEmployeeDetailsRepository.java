package com.chainsys.employeeskillmatrix.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.employeeskillmatrix.model.TestEmployeeDetails;

public interface TestEmployeeDetailsRepository extends CrudRepository <TestEmployeeDetails,Integer> {
	TestEmployeeDetails findById(int id);
	TestEmployeeDetails save(TestEmployeeDetails testdetails);
	void deleteById(int id);
	List<TestEmployeeDetails> findAll();

}
