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

import com.chainsys.employeeskillmatrix.dto.SkillsAndEmployeeSkillDetailsDTO;
import com.chainsys.employeeskillmatrix.model.Skills;
import com.chainsys.employeeskillmatrix.service.EmployeeTestService;
import com.chainsys.employeeskillmatrix.service.SkillsService;

@Controller
@RequestMapping("/skills")
public class SkillsController {
	@Autowired
	private SkillsService skillsService;
	private static final String ADDSKILLSFORM="add-skill-form";
	private static final String SKILLLIST="redirect:/skills/skilllist";
	private static final String UPDATESKILLSFORM="update-skill-form";
	@Autowired
	private EmployeeTestService employeeTestService;
	@GetMapping("/getskillbyid")
	public String getSkilldetails(@RequestParam("id") int id, Model model) {
		Skills skill = skillsService.findByid(id);
		model.addAttribute("getskill",skill);
		return "find-skill-id";
	}
	@GetMapping("/addskillsform")
	public String addNewSkillForm(Model model) {
		Skills skill = new Skills();
		model.addAttribute("addskill", skill);
		model.addAttribute("employeetest", employeeTestService.getEmployeeTest());
		return ADDSKILLSFORM;
	}
	@PostMapping("/addnewskill")
	public String addNewSkill(@ModelAttribute("addskill")Skills skill) {
		skillsService.save(skill);
		return SKILLLIST;
		}
	@GetMapping("/updateskillsform")
	public String UpdateskillForm(@RequestParam("id") int id,Model model) {
		Skills skill = skillsService.findByid(id);
		model.addAttribute("updateskill",skill);
		model.addAttribute("employeetest", employeeTestService.getEmployeeTest());
		return UPDATESKILLSFORM;
	}
	@PostMapping("/updatenewskill")
	public String updateNewSkills(@ModelAttribute("updateskill")Skills skill) {
		skillsService.save(skill);
		return SKILLLIST;
		}
	@GetMapping("deleteskill")
	public String deleteSkills(@RequestParam("id") int id) {
		skillsService.deleteById(id);
		return SKILLLIST;
		}
	@GetMapping("/skilllist")
	public String getAllSkills(Model model) {
		List<Skills> skill = skillsService.getSkills();
		model.addAttribute("allskill",skill);
		return "list-skill";
	}
	@GetMapping("getskillid")
	public String getSkillsAndEmployeeSkillDetails(@RequestParam("id") int id, Model model) {
		SkillsAndEmployeeSkillDetailsDTO dto = skillsService.getSkillsAndEmployeeSkillDetails(id);
		model.addAttribute("getskillid",dto.getSkills());
		model.addAttribute("skillidlist",dto.getEmployeeskilldetails());
		return "skills-employeeskilldetails";

	}


}
