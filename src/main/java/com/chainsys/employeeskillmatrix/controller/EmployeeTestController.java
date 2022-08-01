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

import com.chainsys.employeeskillmatrix.model.EmployeeTest;
import com.chainsys.employeeskillmatrix.service.EmployeeTestService;

@Controller
@RequestMapping("/emptest")
public class EmployeeTestController {
	@Autowired
	private EmployeeTestService testservice;
	@GetMapping("/gettestbyid")
	public String gettestdetails(@RequestParam("id") int id, Model model) {
		EmployeeTest test = testservice.findByid(id);
		model.addAttribute("gettest",test);
		return "find-test-by-id";
	}
	@GetMapping("/addtest")
	public String showForm(Model model) {
		EmployeeTest test = new EmployeeTest();
		model.addAttribute("addemptest", test);
		return "add-test-form";
	}
	@PostMapping("/add")
	public String addNewTest(@ModelAttribute("addemptest")EmployeeTest test) {
	    testservice.save(test);
		return "redirect:/emptest/testlist";
	}
	@GetMapping("/updatetest")
	public String showUpdateTestForm(@RequestParam("id") int id,Model model) {
		EmployeeTest test = testservice.findByid(id);
		model.addAttribute("updatetest",test);
		return "update-test-form";
	}
	@PostMapping("/update")
	public String updateTest(@ModelAttribute("updatetest")EmployeeTest test) {
		testservice.save(test);
		return "redirect:/emptest/testlist";
	}
	@GetMapping("deletetest")
	public String deleteTest(@RequestParam("id") int id) {
        testservice.deleteById(id);
		return "redirect:/emptest/testlist";
		}
	@GetMapping("/testlist")
	public String getAllTest(Model model) {
		List<EmployeeTest> test = testservice.getEmployeeTest();
		model.addAttribute("alltest",test);
		return "list-test";
	}


}
