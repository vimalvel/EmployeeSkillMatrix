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

import com.chainsys.employeeskillmatrix.compositekey.TestEmployeeDetailsCompositeKey;
import com.chainsys.employeeskillmatrix.model.TestEmployeeDetails;
import com.chainsys.employeeskillmatrix.service.TestEmployeeDetailsService;

@Controller
@RequestMapping("/testemployeedetails")
public class TestEmployeeDetailsController {
	@Autowired
	private TestEmployeeDetailsService testEmployeeDetailsService;
	private static final String ADDTESTEMPLOYEEDETAILS="add-test-employee-details";
	private static final String TESTEMPLOYEEDETAILSLIST="redirect:/testemployeedetails/testemployeedetailslist";
	private static final String UPDATETESTEMPLOYEEDETAILS="update-test-employee-details";
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
		return ADDTESTEMPLOYEEDETAILS;
	}
	@PostMapping("/addnewtestemployeedetails")
	public String addNewTestEmployeeDetails(@ModelAttribute("addtestemployeedetails")TestEmployeeDetails testemployeedetails) {
		testEmployeeDetailsService.save(testemployeedetails);
		return TESTEMPLOYEEDETAILSLIST;
	}
	@GetMapping("/updatetestemployeedetailsform")
	public String updateTestEmployeeForm(@RequestParam("examid") int examid,@RequestParam("employeeid") int employeeid,Model model) {
		TestEmployeeDetailsCompositeKey testEmployeeDetailsCompositeKey = new TestEmployeeDetailsCompositeKey(examid,employeeid);
		Optional<TestEmployeeDetails> testemployeedetails = testEmployeeDetailsService.findByid(testEmployeeDetailsCompositeKey);
		model.addAttribute("updatetestemployeedetails",testemployeedetails);
		return UPDATETESTEMPLOYEEDETAILS;
	}
	@PostMapping("/updatenewtestemployeedetails")
	public String updateTestEmployeeDetails(@ModelAttribute("updatetestemployeedetails")TestEmployeeDetails testemployeedetails) {
		testEmployeeDetailsService.save(testemployeedetails);
		return TESTEMPLOYEEDETAILSLIST;
	}
	@GetMapping("deletetestemployeedetails")
	public String deleteTestEmployeeDetails(@RequestParam("examid") int examid,@RequestParam("employeeid") int employeeid) {
		TestEmployeeDetailsCompositeKey testEmployeeDetailsCompositeKey = new TestEmployeeDetailsCompositeKey(examid,employeeid);
		testEmployeeDetailsService.deleteById(testEmployeeDetailsCompositeKey);
		return TESTEMPLOYEEDETAILSLIST;
		}
	@GetMapping("/testemployeedetailslist")
	public String getAllTestEmployeeDetails(Model model) {
		List<TestEmployeeDetails> testemployeedetails = testEmployeeDetailsService.getEmpTestetails();
		model.addAttribute("alltestemployeedetails",testemployeedetails);
		return "list-testemployee-details";
	}


}
