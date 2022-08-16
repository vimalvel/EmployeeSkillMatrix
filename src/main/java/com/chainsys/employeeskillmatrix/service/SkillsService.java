package com.chainsys.employeeskillmatrix.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.dto.SkillsAndEmployeeSkillDetailsDTO;
import com.chainsys.employeeskillmatrix.model.EmployeeSkillDetails;
import com.chainsys.employeeskillmatrix.model.Skills;
import com.chainsys.employeeskillmatrix.repository.EmployeeSkillDetailsRepository;
import com.chainsys.employeeskillmatrix.repository.SkillsRepository;

@Service
public class SkillsService {
	@Autowired
	private SkillsRepository skillsRepository;
	@Autowired 
	private EmployeeSkillDetailsRepository employeeskilldetailsrepository;
	public List<Skills> getSkills(){
		return skillsRepository.findAll();
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
	public SkillsAndEmployeeSkillDetailsDTO getSkillsAndEmployeeSkillDetails(int id) {
		Skills skills = skillsRepository.findById(id);
		SkillsAndEmployeeSkillDetailsDTO dto = new SkillsAndEmployeeSkillDetailsDTO();
		dto.setSkills(skills);
		List<EmployeeSkillDetails> employeeskilldetails = employeeskilldetailsrepository.findBySkillsSkillId(id);
		Iterator<EmployeeSkillDetails> itr = employeeskilldetails.iterator();
		while (itr.hasNext()) {
			dto.addEmployeeSkillIdDetails((EmployeeSkillDetails) itr.next());
		}
		return dto;
		
	}

}
