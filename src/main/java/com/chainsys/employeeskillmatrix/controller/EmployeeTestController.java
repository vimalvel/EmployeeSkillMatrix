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

import com.chainsys.employeeskillmatrix.dto.ExamDetailsAndEmployeeTestDTO;
import com.chainsys.employeeskillmatrix.model.EmployeeTest;
import com.chainsys.employeeskillmatrix.service.EmployeeTestService;

@Controller
@RequestMapping("/employeetest")
public class EmployeeTestController {
	@Autowired
	private EmployeeTestService employeetestservice;
	private static final String ADDEMPLOYEETESTFORM="add-employee-test-form";
	private static final String EMPLOYEETESTLIST="redirect:/employeetest/employeetestlist";
	private static final String UPDATEEMPLOYEETESTFORM= "update-employee-test-form";
	@GetMapping("/getemployeetestbyid")
	public String getEmployeetestdetails(@RequestParam("id") int id, Model model) {
		EmployeeTest employeetest = employeetestservice.findByid(id);
		model.addAttribute("getemployeetest",employeetest);
		return "find-employee-test-by-id";
	}
	@GetMapping("/addemployeetestform")
	public String addEmployeeTestForm(Model model) {
		EmployeeTest employeetest = new EmployeeTest();
		model.addAttribute("addemployeetest", employeetest);
		return ADDEMPLOYEETESTFORM;
	}
	@PostMapping("/addnewemployeetest")
	public String addNewEmployeeTest(@ModelAttribute("addemployeetest")EmployeeTest employeetest) {
	    employeetestservice.save(employeetest);
		return EMPLOYEETESTLIST;
	}
	@GetMapping("/updateemployeetestform")
	public String UpdateEmployeeTestForm(@RequestParam("id") int id,Model model) {
		EmployeeTest employeetest = employeetestservice.findByid(id);
		model.addAttribute("updateemployeetest",employeetest);
		return UPDATEEMPLOYEETESTFORM;
	}
	@PostMapping("/updatenewemployeetest")
	public String updateNewEmployeeTest(@Valid@ModelAttribute("updateemployeetest")EmployeeTest employeetest,Errors errors) {
		employeetestservice.save(employeetest);
		return EMPLOYEETESTLIST;
	}
	@GetMapping("deleteemployeetest")
	public String deleteEmployeeTest(@RequestParam("id") int id) {
        employeetestservice.deleteById(id);
		return EMPLOYEETESTLIST;
		}
	@GetMapping("/employeetestlist")
	public String getAllEmployeeTest(Model model) {
		List<EmployeeTest> employeetest = employeetestservice.getEmployeeTest();
		model.addAttribute("allemployeetest",employeetest);
		return "list-employee-test";
	}
	@GetMapping("/getexamdetails")
	public String getExamDetailsAndEmployeeTestDTO(@RequestParam("id") int id, Model model) {
		ExamDetailsAndEmployeeTestDTO dto = employeetestservice.getExamDetailsAndEmployeeTestDTO(id);
		model.addAttribute("gettestid",dto.getEmployeetest());
		model.addAttribute("testidlist", dto.getExamDetails());
		return "examdetails-employeetest";
	}
	


}
