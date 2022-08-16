package com.chainsys.employeeskillmatrix.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.dto.ExamDetailsAndEmployeeSkillDetailsDTO;
import com.chainsys.employeeskillmatrix.dto.ExamDetailsAndTestEmployeeDetailsDTO;
import com.chainsys.employeeskillmatrix.model.EmployeeSkillDetails;
import com.chainsys.employeeskillmatrix.model.ExamDetails;
import com.chainsys.employeeskillmatrix.model.TestEmployeeDetails;
import com.chainsys.employeeskillmatrix.repository.EmployeeSkillDetailsRepository;
import com.chainsys.employeeskillmatrix.repository.ExamDetailsRepository;
import com.chainsys.employeeskillmatrix.repository.TestEmployeeDetailsRepository;

@Service
public class ExamDetailsService {
	@Autowired
	private ExamDetailsRepository examDetailsRepository;
	@Autowired
	private EmployeeSkillDetailsRepository employeeSkillDetailsRepository;
	@Autowired
	private TestEmployeeDetailsRepository testEmployeeDetailsRepository;
	public List<ExamDetails> getExamDetails(){
		return examDetailsRepository.findAll();
	}
	public ExamDetails save(ExamDetails exdetails) {
		return examDetailsRepository.save(exdetails);
	}
	public ExamDetails findById(int id) {
		return examDetailsRepository.findById(id);
	}
	public void deleteById(int id) {
		examDetailsRepository.deleteById(id);
	}
	public ExamDetailsAndEmployeeSkillDetailsDTO getExamDetailsAndEmpSkillDetails(int id) {
		ExamDetails examdetails = examDetailsRepository.findById(id);
		ExamDetailsAndEmployeeSkillDetailsDTO dto = new ExamDetailsAndEmployeeSkillDetailsDTO();
		dto.setExamdetails(examdetails);
		List<EmployeeSkillDetails> employeeskilldetails = employeeSkillDetailsRepository.findByExamdetailsExamId(id);
		Iterator<EmployeeSkillDetails> itr = employeeskilldetails.iterator();
		while(itr.hasNext()) {
			dto.addEmployeeSkillDetails((EmployeeSkillDetails) itr.next());
			
		}
		return dto;
		
	}
	public ExamDetailsAndTestEmployeeDetailsDTO getExamDetailsAndTestEmployeeDetailsDTO(int id) {
		ExamDetails examdetail = examDetailsRepository.findById(id);
		ExamDetailsAndTestEmployeeDetailsDTO dto1 = new ExamDetailsAndTestEmployeeDetailsDTO();
		dto1.setExamdetails(examdetail);
		List<TestEmployeeDetails> testEmployeeDetails = testEmployeeDetailsRepository.findByExamId(id);
		Iterator<TestEmployeeDetails> itr = testEmployeeDetails.iterator();
		while(itr.hasNext()) {
			dto1.addTestEmployeeDetails((TestEmployeeDetails) itr.next());
		}
		return dto1;
	}

}
