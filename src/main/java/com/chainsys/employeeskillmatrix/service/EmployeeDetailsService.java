package com.chainsys.employeeskillmatrix.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.employeeskillmatrix.dto.EmployeeDetailsAndEmployeeSkillDetailsDTO;
import com.chainsys.employeeskillmatrix.dto.EmployeeDetailsAndTestEmployeeDetailsDTO;
import com.chainsys.employeeskillmatrix.model.EmployeeDetails;
import com.chainsys.employeeskillmatrix.model.EmployeeSkillDetails;
import com.chainsys.employeeskillmatrix.model.TestEmployeeDetails;
import com.chainsys.employeeskillmatrix.repository.EmployeeDetailsRepository;
import com.chainsys.employeeskillmatrix.repository.EmployeeSkillDetailsRepository;
import com.chainsys.employeeskillmatrix.repository.TestEmployeeDetailsRepository;

@Service
public class EmployeeDetailsService {
	@Autowired
	private EmployeeDetailsRepository employeeDetailsRepository;
	@Autowired
	private EmployeeSkillDetailsRepository employeeskilldetailsrepository;
	@Autowired
	private TestEmployeeDetailsRepository testemployeedetailsrepository;

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
	public EmployeeDetailsAndTestEmployeeDetailsDTO getEmployeeDetailsAndTestEmployeeDetailsDTO(int id) {
		EmployeeDetails employeedetail = employeeDetailsRepository.findById(id);
		EmployeeDetailsAndTestEmployeeDetailsDTO dto1 = new EmployeeDetailsAndTestEmployeeDetailsDTO();
		dto1.setEmployeedetails(employeedetail);
		List<TestEmployeeDetails> testemployeedetails = testemployeedetailsrepository.findByEmployeeId(id);
		Iterator<TestEmployeeDetails> itr = testemployeedetails.iterator();
		while (itr.hasNext()) {
			dto1.addTestEmployeeDetails((TestEmployeeDetails) itr.next());
		}
		return dto1;
	}
	public EmployeeDetails getEmployeeByIdAndEmailAndPassword(int id,String email,String password) {
		return employeeDetailsRepository.findByEmployeeIdAndEmailAndPassword(id, email, password);
	}

}
