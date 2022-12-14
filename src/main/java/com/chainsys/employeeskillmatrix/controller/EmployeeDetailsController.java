package com.chainsys.employeeskillmatrix.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.employeeskillmatrix.dto.EmployeeDetailsAndEmployeeSkillDetailsDTO;
import com.chainsys.employeeskillmatrix.dto.EmployeeDetailsAndTestEmployeeDetailsDTO;
import com.chainsys.employeeskillmatrix.model.EmployeeDetails;
import com.chainsys.employeeskillmatrix.service.EmployeeDetailsService;


@Controller
@RequestMapping("/employeedetails")
public class EmployeeDetailsController {
	@Autowired 
	private EmployeeDetailsService employeeDetailsService;
	private static final String ADDEMPLOYEEFORM  ="add-employee-details-form";
	private static final String EMPLOYEELIST="redirect:/employeedetails/employeelist";
	private static final String EMPLOYEELOGIN="employee-login-form";
	private static final String UPDATEEMPLOYEEFORM="update-employee-details-form";
	@GetMapping("/getemployeebyid")
	public String getEmployeeDetails(@RequestParam("employeeid") int id, Model model) {
		EmployeeDetails employeedetails = employeeDetailsService.findById(id);
		model.addAttribute("getemployeedetails",employeedetails);
		return "find-employee-details-by-id";
	}
	@GetMapping("/addemployeedetailsform")
	public String showEmployeeDetailsForm(Model model) {
		EmployeeDetails employeedetails = new EmployeeDetails();
		model.addAttribute("addemployeedetails", employeedetails);
		return ADDEMPLOYEEFORM;
	}
	@PostMapping("/addnewemployeedetails")
	public String addNewEmployeeDetails(@ModelAttribute("addemployeedetails")EmployeeDetails emp) {
		employeeDetailsService.save(emp);
		return "redirect:/employeedetails/getemployeebyid?employeeid="+ emp.getEmployeeId();
		
	}
	@GetMapping("/updateemployeedetailsform")
	public String showUpdateEmployeeDetailsForm(@RequestParam("employeeid") int id,Model model) {
		EmployeeDetails employeedetails = employeeDetailsService.findById(id);
		model.addAttribute("updateemployeedetails",employeedetails);
		return UPDATEEMPLOYEEFORM;
	}
	@PostMapping("/updatenewemployeedetails")
	public String updateEmployeeDetails(@ModelAttribute("updateemployeedetails")EmployeeDetails employee) {
		employeeDetailsService.save(employee);
		return EMPLOYEELIST;
	}
	@GetMapping("deleteemployeedetails")
	public String deleteEmployeeDetails(@RequestParam("employeeid") int id) {
		employeeDetailsService.deleteById(id);
		return EMPLOYEELIST;
		}
	@GetMapping("/employeelist")
	public String getAllEmployeeDetails(Model model) {
		List<EmployeeDetails> employeedetails = employeeDetailsService.getEmployeeDetails();
		model.addAttribute("allemployee",employeedetails);
		return "list-employee-details";
	}
	@GetMapping("/getemployeeiddetails")
	public String getEmployeeDetailsAndEmpSkillDetails(@RequestParam("id") int id, Model model) {
		EmployeeDetailsAndEmployeeSkillDetailsDTO dto = employeeDetailsService.getEmpDetailsAndEmpSkillDetails(id);
		model.addAttribute("getemployeeid",dto.getEmployeedetails());
		return "employeedetails-employeeskilldetails";
	}
	@GetMapping("/getemployeeidtestdetails")
	public String getEmployeeDetailsAndTestEmployeeDetails(@RequestParam("id") int id,Model model) {
		EmployeeDetailsAndTestEmployeeDetailsDTO dto1 = employeeDetailsService.getEmployeeDetailsAndTestEmployeeDetailsDTO(id);
		model.addAttribute("getemployeesid",dto1.getEmployeedetails());
		return "employeedetails-testemployeedetails";
	}
	@GetMapping("/employeeloginform")
	public String employeeLoginForm(Model model) {
		EmployeeDetails employeedetails = new EmployeeDetails();
		model.addAttribute("employeelogin", employeedetails);
		return EMPLOYEELOGIN;
	}
	@PostMapping("/checkemployeeloginform")
	public String checkingAccess(@ModelAttribute("employeelogin") EmployeeDetails employeedetail,Model model) {
		EmployeeDetails employeedetails = employeeDetailsService.getEmployeeByIdAndPassword(employeedetail.getEmployeeId(),employeedetail.getPassword());
		if (employeedetails!=null) {
			model.addAttribute("employeeid",employeedetails.getEmployeeId());
			return "employee-page";
		}
		else
			model.addAttribute("result", "Invalid Username And Password");
			return EMPLOYEELOGIN;
		
	}

}
