package com.chainsys.employeeskillmatrix.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.dto.EmployeeDetailsAndEmployeeSkillDetailsDTO;
import com.chainsys.employeeskillmatrix.model.EmployeeDetails;
import com.chainsys.employeeskillmatrix.model.EmployeeSkillDetails;
import com.chainsys.employeeskillmatrix.repository.EmployeeDetailsRepository;
import com.chainsys.employeeskillmatrix.repository.EmployeeSkillDetailsRepository;

@Service
public class EmployeeDetailsService {
	@Autowired
	private EmployeeDetailsRepository employeeDetailsRepository;
	@Autowired
	private EmployeeSkillDetailsRepository employeeskilldetailsrepository;

	public List<EmployeeDetails> getEmployeeDetails() {
		List<EmployeeDetails> emplist = employeeDetailsRepository.findAll();
		return emplist;
	}

	public EmployeeDetails save(EmployeeDetails empdetails) {
		return employeeDetailsRepository.save(empdetails);
	}

	public EmployeeDetails findById(int id) {
		return employeeDetailsRepository.findById(id);
	}

	public void deleteById(int emp_id) {
		employeeDetailsRepository.deleteById(emp_id);
	}

	public EmployeeDetailsAndEmployeeSkillDetailsDTO getEmpDetailsAndEmpSkillDetails(int id) {
		EmployeeDetails employeedetails = employeeDetailsRepository.findById(id);
		EmployeeDetailsAndEmployeeSkillDetailsDTO dto = new EmployeeDetailsAndEmployeeSkillDetailsDTO();
		dto.setEmployeedetails(employeedetails);
		List<EmployeeSkillDetails> employeeskilldetails = employeeskilldetailsrepository.findByEmployeeDetailsEmployeeId(id);
		Iterator<EmployeeSkillDetails> itr = employeeskilldetails.iterator();
		while (itr.hasNext()) {
			dto.addEmployeeSkillDetails((EmployeeSkillDetails) itr.next());
		}
		return dto;

	}

}
