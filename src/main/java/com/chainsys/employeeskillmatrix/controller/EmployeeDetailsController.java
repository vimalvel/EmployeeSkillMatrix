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

import com.chainsys.employeeskillmatrix.model.EmployeeDetails;
import com.chainsys.employeeskillmatrix.service.EmployeeDetailsService;


@Controller
@RequestMapping("/employeedetails")
public class EmployeeDetailsController {
	@Autowired 
	private EmployeeDetailsService employeeDetailsService;
	@GetMapping("/getemployeebyid")
	public String getEmployeeDetails(@RequestParam("employeeid") int id, Model model) {
		EmployeeDetails employeedetails = employeeDetailsService.findByid(id);
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
		EmployeeDetails employeedetails = employeeDetailsService.findByid(id);
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

}
