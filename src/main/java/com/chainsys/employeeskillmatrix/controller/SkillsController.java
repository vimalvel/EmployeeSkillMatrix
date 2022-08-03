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
import com.chainsys.employeeskillmatrix.service.SkillsService;

@Controller
@RequestMapping("/skills")
public class SkillsController {
	@Autowired
	private SkillsService skillsService;
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
		return "add-skill-form";
	}
	@PostMapping("/addnewskill")
	public String addNewSkill(@ModelAttribute("addskill")Skills skill) {
		skillsService.save(skill);
		return "redirect:/skills/skilllist";
	}
	@GetMapping("/updateskillsform")
	public String UpdateskillForm(@RequestParam("id") int id,Model model) {
		Skills skill = skillsService.findByid(id);
		model.addAttribute("updateskill",skill);
		return "update-skill-form";
	}
	@PostMapping("/updatenewskill")
	public String updateNewSkills(@ModelAttribute("updateskill")Skills skill) {
		skillsService.save(skill);
		return "redirect:/skills/skilllist";
	}
	@GetMapping("deleteskill")
	public String deleteSkills(@RequestParam("id") int id) {
		skillsService.deleteById(id);
		return "redirect:/skills/skilllist";
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
