package com.chainsys.employeeskillmatrix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.pojo.Skills;
import com.chainsys.employeeskillmatrix.repository.SkillsRepository;

@Service
public class SkillsService {
	@Autowired
	private SkillsRepository repo;
	public List<Skills> getSkills(){
		List<Skills> skill = repo.findAll();
		return skill;
	}
	public Skills save(Skills sk) {
		return repo.save(sk);
	}
	public Skills findByid(int id) {
		return repo.findById(id);
	}
	public void deleteById(int id) {
		repo.deleteById(id);
	}

}
