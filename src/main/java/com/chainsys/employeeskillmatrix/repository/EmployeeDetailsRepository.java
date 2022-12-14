package com.chainsys.employeeskillmatrix.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.employeeskillmatrix.model.EmployeeDetails;

public interface EmployeeDetailsRepository extends CrudRepository<EmployeeDetails,Integer> {
	EmployeeDetails findById(int id);
	EmployeeDetails save(EmployeeDetails empdetails);
	void deleteById(int empid);
	List<EmployeeDetails> findAll();
	EmployeeDetails findByEmployeeIdAndPassword(int id,String password);
       
}
