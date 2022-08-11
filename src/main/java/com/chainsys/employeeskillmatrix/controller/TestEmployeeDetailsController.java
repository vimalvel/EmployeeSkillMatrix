package com.chainsys.employeeskillmatrix.controller;

import java.util.List;
import java.util.Optional;

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

import com.chainsys.employeeskillmatrix.compositekey.TestEmployeeDetailsCompositeKey;
import com.chainsys.employeeskillmatrix.model.TestEmployeeDetails;
import com.chainsys.employeeskillmatrix.service.TestEmployeeDetailsService;

@Controller
@RequestMapping("/testemployeedetails")
public class TestEmployeeDetailsController {
	@Autowired
	private TestEmployeeDetailsService testEmployeeDetailsService;
	@GetMapping("/getemployeebyid")
	public String getTestEmployeedetails(@RequestParam("examid") int examid,@RequestParam("employeeid") int employeeid, Model model) {
		TestEmployeeDetailsCompositeKey testEmployeeDetailsCompositeKey = new TestEmployeeDetailsCompositeKey(examid,employeeid);
		Optional<TestEmployeeDetails> testemployeedetails = testEmployeeDetailsService.findByid(testEmployeeDetailsCompositeKey);
		model.addAttribute("getemployeetestdetails",testemployeedetails);
		return "find-test-employee-details-id";
	}
	@GetMapping("/addemployeetestdetails")
	public String addEmployeeTestForm(Model model) {
		TestEmployeeDetails testemployeedetails = new TestEmployeeDetails();
		model.addAttribute("addtestemployeedetails", testemployeedetails);
		return "add-test-employee-details";
	}
	@PostMapping("/addnewtestemployeedetails")
	public String addNewTestEmployeeDetails(@Valid@ModelAttribute("addtestemployeedetails")TestEmployeeDetails testemployeedetails,Errors errors) {
		if(errors.hasErrors()) {
			return "add-test-employee-details";
		}
		else {
		testEmployeeDetailsService.save(testemployeedetails);
		return "redirect:/testemployeedetails/testemployeedetailslist";}
	}
	@GetMapping("/updatetestemployeedetailsform")
	public String updateTestEmployeeForm(@RequestParam("examid") int examid,@RequestParam("employeeid") int employeeid,Model model) {
		TestEmployeeDetailsCompositeKey testEmployeeDetailsCompositeKey = new TestEmployeeDetailsCompositeKey(examid,employeeid);
		Optional<TestEmployeeDetails> testemployeedetails = testEmployeeDetailsService.findByid(testEmployeeDetailsCompositeKey);
		model.addAttribute("updatetestemployeedetails",testemployeedetails);
		return "update-test-employee-details";
	}
	@PostMapping("/updatenewtestemployeedetails")
	public String updateTestEmployeeDetails(@Valid@ModelAttribute("updatetestemployeedetails")TestEmployeeDetails testemployeedetails,Errors errors) {
		if(errors.hasErrors()) {
			return "update-test-employee-details";
		}
		else {
		testEmployeeDetailsService.save(testemployeedetails);
		return "redirect:/testemployeedetails/testemployeedetailslist";}
	}
	@GetMapping("deletetestemployeedetails")
	public String deleteTestEmployeeDetails(@RequestParam("examid") int examid,@RequestParam("employeeid") int employeeid) {
		TestEmployeeDetailsCompositeKey testEmployeeDetailsCompositeKey = new TestEmployeeDetailsCompositeKey(examid,employeeid);
		testEmployeeDetailsService.deleteById(testEmployeeDetailsCompositeKey);
		return "redirect:/testemployeedetails/testemployeedetailslist";
		}
	@GetMapping("/testemployeedetailslist")
	public String getAllTestEmployeeDetails(Model model) {
		List<TestEmployeeDetails> testemployeedetails = testEmployeeDetailsService.getEmpTestetails();
		model.addAttribute("alltestemployeedetails",testemployeedetails);
		return "list-testemployee-details";
	}


}
