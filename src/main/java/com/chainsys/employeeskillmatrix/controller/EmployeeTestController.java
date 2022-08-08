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

import com.chainsys.employeeskillmatrix.dto.EmployeeTestAndSkillsDTO;
import com.chainsys.employeeskillmatrix.model.EmployeeTest;
import com.chainsys.employeeskillmatrix.service.EmployeeTestService;

@Controller
@RequestMapping("/employeetest")
public class EmployeeTestController {
	@Autowired
	private EmployeeTestService employeetestservice;
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
		return "add-employee-test-form";
	}
	@PostMapping("/addnewemployeetest")
	public String addNewEmployeeTest(@ModelAttribute("addemployeetest")EmployeeTest employeetest) {
	    employeetestservice.save(employeetest);
		return "redirect:/employeetest/employeetestlist";
	}
	@GetMapping("/updateemployeetestform")
	public String UpdateEmployeeTestForm(@RequestParam("id") int id,Model model) {
		EmployeeTest employeetest = employeetestservice.findByid(id);
		model.addAttribute("updateemployeetest",employeetest);
		return "update-employee-test-form";
	}
	@PostMapping("/updatenewemployeetest")
	public String updateNewEmployeeTest(@ModelAttribute("updateemployeetest")EmployeeTest employeetest) {
		employeetestservice.save(employeetest);
		return "redirect:/employeetest/employeetestlist";
	}
	@GetMapping("deleteemployeetest")
	public String deleteEmployeeTest(@RequestParam("id") int id) {
        employeetestservice.deleteById(id);
		return "redirect:/employeetest/employeetestlist";
		}
	@GetMapping("/employeetestlist")
	public String getAllEmployeeTest(Model model) {
		List<EmployeeTest> employeetest = employeetestservice.getEmployeeTest();
		model.addAttribute("allemployeetest",employeetest);
		return "list-employee-test";
	}
	@GetMapping("gettestidbyskills")
	public String getEmployeeTestAndSkills(@RequestParam("id") int id,Model model) {
		EmployeeTestAndSkillsDTO dto = employeetestservice.getEmployeeTestAndSkillsDTO(id);
		model.addAttribute("gettestid", dto.getEmployeetest());
		model.addAttribute("gettestlist", dto.getSkills());
		return "employeetest-skills";
	}


}
