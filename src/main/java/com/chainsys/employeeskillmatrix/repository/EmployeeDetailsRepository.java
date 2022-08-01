package com.chainsys.employeeskillmatrix.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.employeeskillmatrix.pojo.EmployeeDetails;

public interface EmployeeDetailsRepository extends CrudRepository<EmployeeDetails,Integer> {
	EmployeeDetails findById(int id);
	EmployeeDetails save(EmployeeDetails empdetails);
	void deleteById(int emp_id);
	List<EmployeeDetails> findAll();
       
}
