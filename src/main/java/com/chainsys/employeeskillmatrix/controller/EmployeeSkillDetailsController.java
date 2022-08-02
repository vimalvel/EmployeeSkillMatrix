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

import com.chainsys.employeeskillmatrix.model.EmployeeSkillDetails;
import com.chainsys.employeeskillmatrix.service.EmployeeSkillDetailsService;

@Controller
@RequestMapping("/employeeskilldetails")
public class EmployeeSkillDetailsController {
	@Autowired
	private EmployeeSkillDetailsService employeeSkillDetailsService;
	@GetMapping("/getemployeeskillbyid")
	public String getEmployeeSkillDetails(@RequestParam("id") int id, Model model) {
		EmployeeSkillDetails employeeskilldetails = employeeSkillDetailsService.findByid(id);
		model.addAttribute("getemployeeskilldetails", employeeskilldetails);
		return "find-employee-skill-details-id";
	}
	@GetMapping("/addemployeeskilldetailsform")
	public String addEmployeeSkillDetailsForm(Model model) {
		EmployeeSkillDetails employeeskilldetails = new EmployeeSkillDetails();
		model.addAttribute("addemployeeskilldetails", employeeskilldetails);
		return "add-employee-skill-details-form";
	}
	@PostMapping("/addnewemployeeskilldetails")
	public String addNewEmployeeSkillDetails(@ModelAttribute("addemployeeskilldetails")EmployeeSkillDetails employeeskilldetails) {
		employeeSkillDetailsService.save(employeeskilldetails);
		return "redirect:/employeeskilldetails/employeeskilldetailslist";
	}
	@GetMapping("/updateemployeeskilldetailsform")
	public String updateEmployeeSkillDetailsForm(@RequestParam("id") int id,Model model) {
		EmployeeSkillDetails employeeskilldetails = employeeSkillDetailsService.findByid(id);
		model.addAttribute("updateemployeeskilldetails",employeeskilldetails);
		return "update-employee-skill-details-form";
	}
	@PostMapping("/updatenewemployeeskilldetails")
	public String updateNewEmployeeSkillDetails(@ModelAttribute("updateemployeeskilldetails")EmployeeSkillDetails employeeskilldetails) {
		employeeSkillDetailsService.save(employeeskilldetails);
		return "redirect:/employeeskilldetails/employeeskilldetailslist";
	}
	@GetMapping("deleteemployeeskilldetails")
	public String deleteEmployeeSkillDetails(@RequestParam("id") int id) {
		employeeSkillDetailsService.deleteById(id);
		return "redirect:/employeeskilldetails/employeeskilldetailslist";
		}
	@GetMapping("/employeeskilldetailslist")
	public String getAllEmployeeSkillDetails(Model model) {
		List<EmployeeSkillDetails> employeeskilldetailslist = employeeSkillDetailsService.getEmployeeSkill();
		model.addAttribute("allemployeeskilldetails",employeeskilldetailslist);
		return "list-employee-skill-details";
	}


}
