package com.chainsys.employeeskillmatrix.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.employeeskillmatrix.model.EmployeeTest;
import com.chainsys.employeeskillmatrix.model.Skills;


public interface EmployeeTestRepository extends CrudRepository<EmployeeTest,Integer> {
	EmployeeTest findById(int id);
	EmployeeTest save(EmployeeTest emptest);
	void deleteById(int id);
	List<EmployeeTest> findAll();

}
