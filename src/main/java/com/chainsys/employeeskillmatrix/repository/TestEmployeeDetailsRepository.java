package com.chainsys.employeeskillmatrix.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.employeeskillmatrix.compositekey.TestEmployeeDetailsCompositeKey;
import com.chainsys.employeeskillmatrix.model.TestEmployeeDetails;

public interface TestEmployeeDetailsRepository extends CrudRepository <TestEmployeeDetails,TestEmployeeDetailsCompositeKey> {
	Optional<TestEmployeeDetails> findById(TestEmployeeDetailsCompositeKey id);
	TestEmployeeDetails save(TestEmployeeDetails testdetails);
	void deleteById(TestEmployeeDetailsCompositeKey id);
	List<TestEmployeeDetails> findAll();
	
	List<TestEmployeeDetails> findByExamId(int id);
	List<TestEmployeeDetails> findByEmployeeId(int id);

}
