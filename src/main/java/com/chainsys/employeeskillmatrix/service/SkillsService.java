package com.chainsys.employeeskillmatrix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.model.Skills;
import com.chainsys.employeeskillmatrix.repository.SkillsRepository;

@Service
public class SkillsService {
	@Autowired
	private SkillsRepository skillsRepository;
	public List<Skills> getSkills(){
		List<Skills> skill = skillsRepository.findAll();
		return skill;
	}
	public Skills save(Skills sk) {
		return skillsRepository.save(sk);
	}
	public Skills findByid(int id) {
		return skillsRepository.findById(id);
	}
	public void deleteById(int id) {
		skillsRepository.deleteById(id);
	}

}
