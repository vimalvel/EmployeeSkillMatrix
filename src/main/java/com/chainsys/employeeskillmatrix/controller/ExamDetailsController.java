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

import com.chainsys.employeeskillmatrix.model.ExamDetails;
import com.chainsys.employeeskillmatrix.service.ExamDetailsService;

@Controller
@RequestMapping("/examdetails")
public class ExamDetailsController {
	@Autowired ExamDetailsService exservice;
	@GetMapping("/getexambyid")
	public String getexamdetails(@RequestParam("id") int id, Model model) {
		ExamDetails ex = exservice.findByid(id);
		model.addAttribute("getexam",ex);
		return "find-exam-by-id";
	}
	@GetMapping("/addexdetails")
	public String showForm(Model model) {
		ExamDetails ex = new ExamDetails();
		model.addAttribute("addexamdetails", ex);
		return "add-examdetails-form";
	}
	@PostMapping("/addexam")
	public String addNewExamDetails(@ModelAttribute("addexamdetails")ExamDetails ex) {
		exservice.save(ex);
		return "redirect:/examdetails/examlist";
	}
	@GetMapping("/updateexdetails")
	public String showUpdateExamForm(@RequestParam("id") int id,Model model) {
		ExamDetails ex = exservice.findByid(id);
		model.addAttribute("updateexamdetails",ex);
		return "update-examdetails-form";
	}
	@PostMapping("/updateexam")
	public String updateExamDetails(@ModelAttribute("updateexamdetails")ExamDetails ex) {
		exservice.save(ex);
		return "redirect:/examdetails/examlist";
	}
	@GetMapping("deleteexam")
	public String deleteExamDetails(@RequestParam("id") int id) {
		exservice.deleteById(id);
		return "redirect:/examdetails/examlist";
		}
	@GetMapping("/examlist")
	public String getAllExamDetails(Model model) {
		List<ExamDetails> ex = exservice.getExamDetails();
		model.addAttribute("allexam",ex);
		return "list-examdetails";
	}


}
