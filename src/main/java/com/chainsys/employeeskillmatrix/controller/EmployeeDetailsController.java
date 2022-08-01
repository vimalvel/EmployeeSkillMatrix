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

import com.chainsys.employeeskillmatrix.model.EmployeeDetails;
import com.chainsys.employeeskillmatrix.service.EmployeeDetailsService;


@Controller
@RequestMapping("/employeeskillmatrix")
public class EmployeeDetailsController {
	@Autowired 
	private EmployeeDetailsService empservice;
	@GetMapping("/getempbyid")
	public String getempdetails(@RequestParam("id") int id, Model model) {
		EmployeeDetails emp = empservice.findByid(id);
		model.addAttribute("getemp",emp);
		return "find-emp-id";
	}
	@GetMapping("/addempdetails")
	public String showForm(Model model) {
		EmployeeDetails emp = new EmployeeDetails();
		model.addAttribute("addempdetails", emp);
		return "add-empdetails-form";
	}
	@PostMapping("/addemp")
	public String addNewEmployeeDetails(@ModelAttribute("addempdetails")EmployeeDetails emp) {
		empservice.save(emp);
		return "redirect:/employeeskillmatrix/emplist";
	}
	@GetMapping("/updateempdetails")
	public String showUpdateempForm(@RequestParam("empid") int id,Model model) {
		EmployeeDetails emp = empservice.findByid(id);
		model.addAttribute("updateempdetails",emp);
		return "update-empdetails-form";
	}
	@PostMapping("/updateemp")
	public String updateEmpDetails(@ModelAttribute("updateempdetails")EmployeeDetails emp) {
		empservice.save(emp);
		return "redirect:/employeeskillmatrix/emplist";
	}
	@GetMapping("deleteemp")
	public String deleteEmployeeDetails(@RequestParam("empid") int id) {
		empservice.deleteById(id);
		return "redirect:/employeeskillmatrix/emplist";
		}
	@GetMapping("/emplist")
	public String getAllEmployeeDetails(Model model) {
		List<EmployeeDetails> emp = empservice.getEmployeeDetails();
		model.addAttribute("allemp",emp);
		return "list-empdetails";
	}

}
