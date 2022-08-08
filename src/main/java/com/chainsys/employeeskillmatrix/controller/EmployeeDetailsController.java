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
		return "add-employee-details-form";
	}
	@PostMapping("/addnewemployeedetails")
	public String addNewEmployeeDetails(@ModelAttribute("addemployeedetails")EmployeeDetails emp) {
		employeeDetailsService.save(emp);
		return "redirect:/employeedetails/employeelist";
	}
	@GetMapping("/updateemployeedetailsform")
	public String showUpdateEmployeeDetailsForm(@RequestParam("employeeid") int id,Model model) {
		EmployeeDetails employeedetails = employeeDetailsService.findById(id);
		model.addAttribute("updateemployeedetails",employeedetails);
		return "update-employee-details-form";
	}
	@PostMapping("/updatenewemployeedetails")
	public String updateEmployeeDetails(@ModelAttribute("updateemployeedetails")EmployeeDetails employee) {
		employeeDetailsService.save(employee);
		return "redirect:/employeedetails/employeelist";
	}
	@GetMapping("deleteemployeedetails")
	public String deleteEmployeeDetails(@RequestParam("employeeid") int id) {
		employeeDetailsService.deleteById(id);
		return "redirect:/employeedetails/employeelist";
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
		model.addAttribute("employeeidlist", dto.getEmployeeskilldetail());
		return "employeedetails-employeeskilldetails";
	}
	@GetMapping("/getemployeeidtestdetails")
	public String getEmployeeDetailsAndTestEmployeeDetails(@RequestParam("id") int id,Model model) {
		EmployeeDetailsAndTestEmployeeDetailsDTO dto1 = employeeDetailsService.getEmployeeDetailsAndTestEmployeeDetailsDTO(id);
		model.addAttribute("getemployeesid",dto1.getEmployeedetails());
		model.addAttribute("employeesidlist",dto1.getTestemployeedetails());
		return "employeedetails-testemployeedetails";
	}
	@GetMapping("/employeeloginform")
	public String employeeLoginForm(Model model) {
		EmployeeDetails employeedetails = new EmployeeDetails();
		model.addAttribute("employeelogin", employeedetails);
		return "employee-login-form";
	}
	@PostMapping("/checkemployeeloginform")
	public String checkingAccess(@ModelAttribute("employeelogin") EmployeeDetails employeedetail) {
		EmployeeDetails employeedetails = employeeDetailsService.getEmployeeByIdAndEmailAndPassword(employeedetail.getEmployeeId(),employeedetail.getEmail(),employeedetail.getPassword());
		if (employeedetails!=null) {
			return "redirect:/employeedetails/employeelist";
		}
		else
			return "redirect-employeeloginpage";
		
	}

}
