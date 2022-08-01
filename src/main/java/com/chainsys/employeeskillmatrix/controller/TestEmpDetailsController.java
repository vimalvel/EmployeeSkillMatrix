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
import com.chainsys.employeeskillmatrix.service.TestEmpDetailsService;

@Controller
@RequestMapping("/testempdetails")
public class TestEmpDetailsController {
	@Autowired
	private TestEmpDetailsService testservice;
	@GetMapping("/getempbyid")
	public String gettestempdetails(@RequestParam("id") int id, Model model) {
		TestEmployeeDetails test = testservice.findByid(id);
		model.addAttribute("gettestemp",test);
		return "find-test-emp-id";
	}
	@GetMapping("/addtest")
	public String showForm(Model model) {
		TestEmployeeDetails test = new TestEmployeeDetails();
		model.addAttribute("addtestempdetails", test);
		return "add-test-emp-details";
	}
	@PostMapping("/addtestdetails")
	public String addNewTestDetails(@ModelAttribute("addtestempdetails")TestEmployeeDetails test) {
		testservice.save(test);
		return "redirect:/testempdetails/testemplist";
	}
	@GetMapping("/updatetest")
	public String showUpdateTestForm(@RequestParam("id") int id,Model model) {
		TestEmployeeDetails test = testservice.findByid(id);
		model.addAttribute("updatetestempdetails",test);
		return "update-test-emp-details";
	}
	@PostMapping("/updatetestdetails")
	public String updateTestDetails(@ModelAttribute("updatetestempdetails")TestEmployeeDetails test) {
		testservice.save(test);
		return "redirect:/testempdetails/testemplist";
	}
	@GetMapping("deletetest")
	public String deleteTestDetails(@RequestParam("id") int id) {
		testservice.deleteById(id);
		return "redirect:/testempdetails/testemplist";
		}
	@GetMapping("/testemplist")
	public String getAllTestDetails(Model model) {
		List<TestEmployeeDetails> test = testservice.getEmpTestetails();
		model.addAttribute("alltest",test);
		return "list-testdetails";
	}


}
