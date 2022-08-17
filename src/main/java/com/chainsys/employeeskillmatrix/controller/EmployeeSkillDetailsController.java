package com.chainsys.employeeskillmatrix.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.employeeskillmatrix.compositekey.EmployeeSkillDetailsCompositeKey;
import com.chainsys.employeeskillmatrix.model.EmployeeSkillDetails;
import com.chainsys.employeeskillmatrix.service.EmployeeSkillDetailsService;
import com.chainsys.employeeskillmatrix.service.SkillsService;

@Controller
@RequestMapping("/employeeskilldetails")
public class EmployeeSkillDetailsController {
	@Autowired
	private EmployeeSkillDetailsService employeeSkillDetailsService;
	private static final String ADDEMPLOYEESKILLFORM = "add-employee-skill-details-form";
	private static final String EMPLOYEESKILLLIST ="redirect:/employeeskilldetails/employeeskilldetailslist";
	private static final String UPDATEEMPLOYEESKILLFORM="update-employee-skill-details-form";
	@Autowired
	private SkillsService skillsServices;
	@GetMapping("/getemployeeskillbyid")
	public String getEmployeeSkillDetails(@RequestParam("id") int id, @RequestParam("sid") int sid,@RequestParam("eid") int eid,Model model) {
		EmployeeSkillDetailsCompositeKey skillIdCompositeKey =new EmployeeSkillDetailsCompositeKey(id,sid,eid);
		Optional<EmployeeSkillDetails> employeeskilldetails = employeeSkillDetailsService.findByid(skillIdCompositeKey);
		model.addAttribute("getemployeeskilldetails", employeeskilldetails);
		return "find-employee-skill-details-id";
	}
	@GetMapping("/addemployeeskilldetailsform")
	public String addEmployeeSkillDetailsForm(Model model) {
	
		EmployeeSkillDetails employeeskilldetails = new EmployeeSkillDetails();
		model.addAttribute("addemployeeskilldetails", employeeskilldetails);
		model.addAttribute("skills",skillsServices.getSkills());
		return ADDEMPLOYEESKILLFORM;
	}
	@PostMapping("/addnewemployeeskilldetails")
	public String addNewEmployeeSkillDetails(@ModelAttribute("addemployeeskilldetails")EmployeeSkillDetails employeeskilldetails ) {
		
		employeeSkillDetailsService.save(employeeskilldetails);
		return EMPLOYEESKILLLIST;
		
	}
	@GetMapping("/updateemployeeskilldetailsform")
	public String updateEmployeeSkillDetailsForm(@RequestParam("id") int id,@RequestParam("sid") int sid,@RequestParam("eid") int eid,Model model) {
		EmployeeSkillDetailsCompositeKey skillIdCompositeKey =new EmployeeSkillDetailsCompositeKey(id,sid,eid);
		Optional<EmployeeSkillDetails> employeeskilldetails = employeeSkillDetailsService.findByid(skillIdCompositeKey);
		model.addAttribute("updateemployeeskilldetails",employeeskilldetails);
		model.addAttribute("skills",skillsServices.getSkills());
		return UPDATEEMPLOYEESKILLFORM;
	}
	@PostMapping("/updatenewemployeeskilldetails")
	public String updateNewEmployeeSkillDetails(@ModelAttribute("updateemployeeskilldetails")EmployeeSkillDetails employeeskilldetails) {
		employeeSkillDetailsService.save(employeeskilldetails);
		return EMPLOYEESKILLLIST;
	}
	@GetMapping("deleteemployeeskilldetails")
	public String deleteEmployeeSkillDetails(@RequestParam("id") int id,@RequestParam("sid") int sid,@RequestParam("eid") int eid) {
		EmployeeSkillDetailsCompositeKey skillIdCompositeKey =new EmployeeSkillDetailsCompositeKey(id,sid,eid);
		employeeSkillDetailsService.deleteById(skillIdCompositeKey);
		return EMPLOYEESKILLLIST;
		}
	@GetMapping("/employeeskilldetailslist")
	public String getAllEmployeeSkillDetails(Model model) {
		List<EmployeeSkillDetails> employeeskilldetailslist = employeeSkillDetailsService.getEmployeeSkill();
		model.addAttribute("allemployeeskilldetails",employeeskilldetailslist);
		return "list-employee-skill-details";
	}
	

}
