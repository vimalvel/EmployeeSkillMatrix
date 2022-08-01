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

import com.chainsys.employeeskillmatrix.pojo.EmployeeSkillDetails;
import com.chainsys.employeeskillmatrix.service.EmployeeSkillDetailsService;

@Controller
@RequestMapping("/employeeskilldetails")
public class EmployeeSkillDetailsController {
	@Autowired
	private EmployeeSkillDetailsService empskillservice;
	@GetMapping("/getempskillbyid")
	public String getempskilldetails(@RequestParam("id") int id, Model model) {
		EmployeeSkillDetails emp = empskillservice.findByid(id);
		model.addAttribute("getempskill", emp);
		return "find-emp-skill-id";
	}
	@GetMapping("/addskilldetails")
	public String showForm(Model model) {
		EmployeeSkillDetails emp = new EmployeeSkillDetails();
		model.addAttribute("addempskilldetails", emp);
		return "add-skilldetails-form";
	}
	@PostMapping("/addskill")
	public String addSkillDetails(@ModelAttribute("addempskilldetails")EmployeeSkillDetails emp) {
		empskillservice.save(emp);
		return "redirect:/employeeskillmatrix/skilllist";
	}
	@GetMapping("/updateskilldetails")
	public String showUpdateSkillForm(@RequestParam("id") int id,Model model) {
		EmployeeSkillDetails emp = empskillservice.findByid(id);
		model.addAttribute("updateempskilldetails",emp);
		return "update-skilldetails-form";
	}
	@PostMapping("/updateskill")
	public String updateSkillDetails(@ModelAttribute("updateempskilldetails")EmployeeSkillDetails emp) {
		empskillservice.save(emp);
		return "redirect:/employeeskillmatrix/skilllist";
	}
	@GetMapping("deleteemp")
	public String deleteSkillDetails(@RequestParam("id") int id) {
		empskillservice.deleteById(id);
		return "redirect:/employeeskillmatrix/skilllist";
		}
	@GetMapping("/skilllist")
	public String getAllSkillDetails(Model model) {
		List<EmployeeSkillDetails> emp = empskillservice.getEmployeeSkill();
		model.addAttribute("allskill",emp);
		return "list-skilldetails";
	}


}
