package com.chainsys.employeeskillmatrix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.model.EmployeeSkillDetails;
import com.chainsys.employeeskillmatrix.repository.EmployeeSkillDetailsRepository;

@Service
public class EmployeeSkillDetailsService {
	@Autowired
	private EmployeeSkillDetailsRepository repo;
	public List<EmployeeSkillDetails> getEmployeeSkill(){
		List<EmployeeSkillDetails> empskilllist = repo.findAll();
		return empskilllist;
	}
	public EmployeeSkillDetails save(EmployeeSkillDetails empskill) {
		return repo.save(empskill);
	}
	public EmployeeSkillDetails findByid(int id) {
		return repo.findById(id);
	}
	public void deleteById(int id) {
		repo.deleteById(id);
	}

}
