package com.chainsys.employeeskillmatrix.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.dto.ExamDetailsAndEmployeeTestDTO;
import com.chainsys.employeeskillmatrix.model.EmployeeTest;
import com.chainsys.employeeskillmatrix.model.ExamDetails;
import com.chainsys.employeeskillmatrix.model.TestEmployeeDetails;
import com.chainsys.employeeskillmatrix.repository.EmployeeTestRepository;
import com.chainsys.employeeskillmatrix.repository.ExamDetailsRepository;
import com.chainsys.employeeskillmatrix.repository.SkillsRepository;

@Service
public class EmployeeTestService {
	@Autowired
	private EmployeeTestRepository employeeTestRepository;
	@Autowired
	private ExamDetailsRepository examDetailsRepository;
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
	public ExamDetailsAndEmployeeTestDTO getExamDetailsAndEmployeeTestDTO(int id) {
	    EmployeeTest employeeTest = employeeTestRepository.findById(id);
	    ExamDetailsAndEmployeeTestDTO dto1 = new ExamDetailsAndEmployeeTestDTO();
		dto1.setEmployeetest(employeeTest);
		List<ExamDetails> examDetails = examDetailsRepository.findByTestId(id);
		Iterator<ExamDetails> itr = examDetails.iterator();
		while (itr.hasNext()) {
			dto1.addExamDetails((ExamDetails) itr.next());
		}
		return dto1;
	}
	

}
