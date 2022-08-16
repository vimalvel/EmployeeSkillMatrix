package com.chainsys.employeeskillmatrix.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.compositekey.EmployeeSkillDetailsCompositeKey;
import com.chainsys.employeeskillmatrix.model.EmployeeSkillDetails;
import com.chainsys.employeeskillmatrix.repository.EmployeeSkillDetailsRepository;

@Service
public class EmployeeSkillDetailsService {
	@Autowired
	private EmployeeSkillDetailsRepository employeeSkillDetailsRepository;
	public List<EmployeeSkillDetails> getEmployeeSkill(){
		return employeeSkillDetailsRepository.findAll();
	}
	public EmployeeSkillDetails save(EmployeeSkillDetails empskill) {
		return employeeSkillDetailsRepository.save(empskill);
	}
	public Optional<EmployeeSkillDetails> findByid(EmployeeSkillDetailsCompositeKey id) {
		return employeeSkillDetailsRepository.findById(id);
	}
	public void deleteById(EmployeeSkillDetailsCompositeKey id) {
		employeeSkillDetailsRepository.deleteById(id);
	}

}
