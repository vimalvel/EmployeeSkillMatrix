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

import com.chainsys.employeeskillmatrix.model.AdminLogin;
import com.chainsys.employeeskillmatrix.service.AdminLoginService;

@Controller
@RequestMapping("/adminlogins")
public class AdminLoginController {
	@Autowired
	private AdminLoginService adminLoginService;
	@GetMapping("/getadminloginbyid")
	public String getAdminLoginId(@RequestParam("adminid") int adminid, Model model) {
		AdminLogin adminlogin = adminLoginService.findById(adminid);
		model.addAttribute("getadminlogin",adminlogin);
		return "find-admin-login-by-id";
	}
	@GetMapping("/addadminloginform")
	public String showAdminLoginForm(Model model) {
		AdminLogin adminlogin = new AdminLogin();
		model.addAttribute("addadminlogin", adminlogin);
		return "add-admin-login-form";
	}
	@PostMapping("/addnewadminlogin")
	public String addNewAdminLogin(@Valid@ModelAttribute("addadminlogin")AdminLogin adminlogin, Errors errors) {
		if(errors.hasErrors()) {
			return "add-admin-login-form";
		}
		else {
		adminLoginService.save(adminlogin);
		return "redirect:/adminlogins/adminlist";
		}
	}
	@GetMapping("/updateadminloginform")
	public String showUpdateAdminLoginForm(@RequestParam("adminid") int adminid,Model model) {
		AdminLogin adminlogin = adminLoginService.findById(adminid);
		model.addAttribute("updateadminlogin",adminlogin);
		return "update-admin-login-form";
	}
	@PostMapping("/updatenewadminlogin")
	public String updateNewAdminLogin(@Valid@ModelAttribute("updateadminlogin")AdminLogin adminlogin,Errors errors) {
		if(errors.hasErrors()) {
			return "update-admin-login-form";
		}
		else {
		adminLoginService.save(adminlogin);
		return "redirect:/adminlogins/adminlist";}
	}
	@GetMapping("deleteadminlogin")
	public String deleteAdminLogin(@RequestParam("adminid") int adminid) {
		adminLoginService.deleteById(adminid);
		return "redirect:/adminlogins/adminlist";
		}
	@GetMapping("/adminlist")
	public String getAllAdminLogin(Model model) {
		List<AdminLogin> adminlogin = adminLoginService.getAdminLogin();
		model.addAttribute("alladmin",adminlogin);
		return "list-admin-login";
	}
	@GetMapping("/adminloginform")
	public String adminLoginForm(Model model) {
		AdminLogin adminlogin = new AdminLogin();
		model.addAttribute("adminlogin", adminlogin);
		return "admin-login-form";
	}
	@PostMapping("/checkadminloginform")
	public String checkingAccess(@ModelAttribute("adminlogin") AdminLogin adminlogin) {
		AdminLogin adminLogin = adminLoginService.getAdminByIdAndPassword(adminlogin.getAdminId(), adminlogin.getPassword());
		if(adminLogin!=null) {
			return "redirect:/adminlogins/adminindex";
		}
		else
			return "redirect-adminloginpage";
		
	}
	@GetMapping("/adminindex")
	public String skills() {
		return "skill-page";
	}
	
}
