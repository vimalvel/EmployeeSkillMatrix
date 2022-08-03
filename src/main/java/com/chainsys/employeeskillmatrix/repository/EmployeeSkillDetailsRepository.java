package com.chainsys.employeeskillmatrix.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.employeeskillmatrix.model.EmployeeSkillDetails;

public interface EmployeeSkillDetailsRepository extends CrudRepository<EmployeeSkillDetails,Integer> {
	EmployeeSkillDetails findById(int id);
	EmployeeSkillDetails save(EmployeeSkillDetails empskill);
	void deleteById(int id);
	List<EmployeeSkillDetails> findAll();
	
	List<EmployeeSkillDetails> findByEmployeeDetailsEmployeeId(int id);
	List<EmployeeSkillDetails> findBySkillsSkillId(int id);

}
