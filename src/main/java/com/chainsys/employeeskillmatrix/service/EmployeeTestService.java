package com.chainsys.employeeskillmatrix.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.dto.EmployeeTestAndSkillsDTO;
import com.chainsys.employeeskillmatrix.model.EmployeeTest;
import com.chainsys.employeeskillmatrix.model.Skills;
import com.chainsys.employeeskillmatrix.repository.EmployeeTestRepository;
import com.chainsys.employeeskillmatrix.repository.SkillsRepository;

@Service
public class EmployeeTestService {
	@Autowired
	private EmployeeTestRepository employeeTestRepository;
	@Autowired
	private SkillsRepository skillsrepository;
	public List<EmployeeTest> getEmployeeTest(){
		List<EmployeeTest> emptest = employeeTestRepository.findAll();
		return emptest;
	}
	public EmployeeTest save(EmployeeTest emptest) {
		return employeeTestRepository.save(emptest);
	}
	public EmployeeTest findByid(int id) {
		return employeeTestRepository.findById(id);
	}
	public void deleteById(int id) {
		employeeTestRepository.deleteById(id);
	}
	public EmployeeTestAndSkillsDTO getEmployeeTestAndSkillsDTO(int id) {
		EmployeeTest employeetest = employeeTestRepository.findById(id);
		EmployeeTestAndSkillsDTO dto = new EmployeeTestAndSkillsDTO();
		dto.setEmployeetest(employeetest);
		List<Skills> skills = skillsrepository.findByTestId(id);
		Iterator<Skills> itr = skills.iterator();
		while (itr.hasNext()) {
			dto.addSkills((Skills) itr.next());
			}
		return dto;
	}

}
