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

import com.chainsys.employeeskillmatrix.pojo.Skills;
import com.chainsys.employeeskillmatrix.service.SkillsService;

@Controller
@RequestMapping("/skills")
public class SkillsController {
	@Autowired
	private SkillsService skillservice;
	@GetMapping("/getskillbyid")
	public String getempdetails(@RequestParam("id") int id, Model model) {
		Skills skill = skillservice.findByid(id);
		model.addAttribute("getskill",skill);
		return "find-skill-id";
	}
	@GetMapping("/addskills")
	public String showForm(Model model) {
		Skills skill = new Skills();
		model.addAttribute("addskill", skill);
		return "add-skill-form";
	}
	@PostMapping("/addsk")
	public String addSkill(@ModelAttribute("addskill")Skills skill) {
		skillservice.save(skill);
		return "redirect:/skills/slist";
	}
	@GetMapping("/updateskills")
	public String showUpdateskillForm(@RequestParam("id") int id,Model model) {
		Skills skill = skillservice.findByid(id);
		model.addAttribute("updateskill",skill);
		return "update-skill-form";
	}
	@PostMapping("/updatesk")
	public String updateSkills(@ModelAttribute("updateskill")Skills skill) {
		skillservice.save(skill);
		return "redirect:/skills/slist";
	}
	@GetMapping("deleteskill")
	public String deleteSkills(@RequestParam("id") int id) {
		skillservice.deleteById(id);
		return "redirect:/skills/slist";
		}
	@GetMapping("/slist")
	public String getAllSkills(Model model) {
		List<Skills> skill = skillservice.getSkills();
		model.addAttribute("allskill",skill);
		return "list-skill";
	}


}
