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

import com.chainsys.employeeskillmatrix.model.TestEmployeeDetails;
import com.chainsys.employeeskillmatrix.service.TestEmployeeDetailsService;

@Controller
@RequestMapping("/testemployeedetails")
public class TestEmployeeDetailsController {
	@Autowired
	private TestEmployeeDetailsService testEmployeeDetailsService;
	@GetMapping("/getemployeebyid")
	public String getTestEmployeedetails(@RequestParam("id") int id, Model model) {
		TestEmployeeDetails testemployeedetails = testEmployeeDetailsService.findByid(id);
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
	public String addNewTestEmployeeDetails(@ModelAttribute("addtestemployeedetails")TestEmployeeDetails testemployeedetails) {
		testEmployeeDetailsService.save(testemployeedetails);
		return "redirect:/testemployeedetails/testemployeedetailslist";
	}
	@GetMapping("/updatenewtestemployeedetails")
	public String updateTestEmployeeForm(@RequestParam("id") int id,Model model) {
		TestEmployeeDetails testemployeedetails = testEmployeeDetailsService.findByid(id);
		model.addAttribute("updatetestemployeedetails",testemployeedetails);
		return "update-test-employee-details";
	}
	@PostMapping("/updatenewtestemployeedetails")
	public String updateTestEmployeeDetails(@ModelAttribute("updatetestemployeedetails")TestEmployeeDetails testemployeedetails) {
		testEmployeeDetailsService.save(testemployeedetails);
		return "redirect:/testemployeedetails/testemployeedetailslist";
	}
	@GetMapping("deletetestemployeedetails")
	public String deleteTestEmployeeDetails(@RequestParam("id") int id) {
		testEmployeeDetailsService.deleteById(id);
		return "redirect:/testemployeedetails/testemployeedetailslist";
		}
	@GetMapping("/testemployeedetailslist")
	public String getAllTestEmployeeDetails(Model model) {
		List<TestEmployeeDetails> testemployeedetails = testEmployeeDetailsService.getEmpTestetails();
		model.addAttribute("alltestemployeedetails",testemployeedetails);
		return "list-testemployee-details";
	}


}