package com.chainsys.employeeskillmatrix.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.employeeskillmatrix.dto.ExamDetailsAndEmployeeSkillDetailsDTO;
import com.chainsys.employeeskillmatrix.dto.ExamDetailsAndTestEmployeeDetailsDTO;
import com.chainsys.employeeskillmatrix.model.ExamDetails;
import com.chainsys.employeeskillmatrix.service.ExamDetailsService;

@Controller
@RequestMapping("/examdetails")
public class ExamDetailsController {
	@Autowired 
	private ExamDetailsService examDetailsService;
	@GetMapping("/getexamdetailsbyid")
	public String getexamdetails(@RequestParam("id") int id, Model model) {
		ExamDetails examdetails = examDetailsService.findById(id);
		model.addAttribute("getexamdetails",examdetails);
		return "find-examdetails-by-id";
	}
	@GetMapping("/addexamdetailsform")
	public String addExamDetailsForm(Model model) {
		ExamDetails examdetails = new ExamDetails();
		model.addAttribute("addexamdetails", examdetails);
		return "add-examdetails-form";
	}
	@PostMapping("/addnewexamdetails")
	public String addNewExamDetails(@Valid@ModelAttribute("addexamdetails")ExamDetails examdetails,Errors errors) {
		if(errors.hasErrors()) {
			return "add-examdetails-form";	
		}
		else {
		examDetailsService.save(examdetails);
		return "redirect:/examdetails/examlist";
		}
	}
	@GetMapping("/updateexamdetailsform")
	public String UpdateExamDetailsForm(@RequestParam("id") int id,Model model) {
		ExamDetails examdetails = examDetailsService.findById(id);
		model.addAttribute("updateexamdetails",examdetails);
		return "update-examdetails-form";
	}
	@PostMapping("/updatenewexamdetails")
	public String updateNewExamDetails(@Valid@ModelAttribute("updateexamdetails")ExamDetails examdetails,Errors errors) {
		if(errors.hasErrors()) {
			return "update-examdetails-form";
		}
		else {
		examDetailsService.save(examdetails);
		return "redirect:/examdetails/examlist";
		}
	}
	@GetMapping("deleteexamdetails")
	public String deleteExamDetails(@RequestParam("id") int id) {
		examDetailsService.deleteById(id);
		return "redirect:/examdetails/examlist";
		}
	@GetMapping("/examlist")
	public String getAllExamDetails(Model model) {
		List<ExamDetails> examdetails = examDetailsService.getExamDetails();
		model.addAttribute("allexamdetails",examdetails);
		return "list-examdetails";
	}
	@GetMapping("/getexamiddetails")
	public String getExamDetailsAndEmpSkillDetails(@RequestParam("id") int id, Model model) {
		ExamDetailsAndEmployeeSkillDetailsDTO dto = examDetailsService.getExamDetailsAndEmpSkillDetails(id);
		model.addAttribute("getexamid",dto.getExamdetails());
		model.addAttribute("examidlist", dto.getEmployeeskilldetails());
		return "examdetails-employeeskilldetails";
	}
	@GetMapping("/getexamid")
	public String getExamDetailsAndTestEmployeeDetails(@RequestParam("id") int id,Model model) {
		ExamDetailsAndTestEmployeeDetailsDTO dto1 = examDetailsService.getExamDetailsAndTestEmployeeDetailsDTO(id);
		model.addAttribute("getexamsid", dto1.getExamdetails());
		model.addAttribute("examsidlist", dto1.getTestemployeedetails());
		return "examdetails-testemployeedetails";
	}



}
