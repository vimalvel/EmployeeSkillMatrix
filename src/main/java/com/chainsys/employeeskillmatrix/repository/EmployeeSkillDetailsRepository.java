package com.chainsys.employeeskillmatrix.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.employeeskillmatrix.compositekey.EmployeeSkillDetailsCompositeKey;
import com.chainsys.employeeskillmatrix.model.EmployeeSkillDetails;

public interface EmployeeSkillDetailsRepository
		extends CrudRepository<EmployeeSkillDetails, EmployeeSkillDetailsCompositeKey> {
	Optional<EmployeeSkillDetails> findById(EmployeeSkillDetailsCompositeKey id);

	EmployeeSkillDetails save(EmployeeSkillDetails empskill);

	void deleteById(EmployeeSkillDetailsCompositeKey id);

	List<EmployeeSkillDetails> findAll();

	List<EmployeeSkillDetails> findByEmployeeDetailsEmployeeId(int id);

	List<EmployeeSkillDetails> findBySkillsSkillId(int id);

	List<EmployeeSkillDetails> findByExamdetailsExamId(int id);

}
