package com.chainsys.employeeskillmatrix.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.employeeskillmatrix.model.EmployeeTest;
public interface EmployeeTestRepository extends CrudRepository<EmployeeTest,Integer> {
	EmployeeTest findById(int id);
	EmployeeTest save(EmployeeTest emptest);
	void deleteById(int id);
	List<EmployeeTest> findAll();

}
