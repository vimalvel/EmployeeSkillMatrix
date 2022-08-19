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

import com.chainsys.employeeskillmatrix.model.AdminLogin;
import com.chainsys.employeeskillmatrix.service.AdminLoginService;

@Controller
@RequestMapping("/adminlogins")
public class AdminLoginController {
	@Autowired
	private AdminLoginService adminLoginService;
	private static final String ADDADMINFORM  ="add-admin-login-form";
	private static final String ADMINLISTFORM  ="redirect:/adminlogins/adminlist";
	private static final String UPDATEADMINFORM  ="update-admin-login-form";
	private static final String ADMINLOGINFORM = "admin-login-form";

	@GetMapping("/getadminloginbyid")
	public String getAdminLoginId(@RequestParam("adminid") int adminid, Model model) {
		AdminLogin adminlogin = adminLoginService.findById(adminid);
		model.addAttribute("getadminlogin", adminlogin);
		return "find-admin-login-by-id";
	}

	@GetMapping("/addadminloginform")
	public String showAdminLoginForm(Model model) {
		AdminLogin adminlogin = new AdminLogin();
		model.addAttribute("addadminlogin", adminlogin);
		return ADDADMINFORM ;
	}

	@PostMapping("/addnewadminlogin")
	public String addNewAdminLogin(@ModelAttribute("addadminlogin") AdminLogin adminlogin) {
		adminLoginService.save(adminlogin);
		return ADMINLISTFORM ;

	}

	@GetMapping("/updateadminloginform")
	public String showUpdateAdminLoginForm(@RequestParam("adminid") int adminid, Model model) {
		AdminLogin adminlogin = adminLoginService.findById(adminid);
		model.addAttribute("updateadminlogin", adminlogin);
		return UPDATEADMINFORM;
	}

	@PostMapping("/updatenewadminlogin")
	public String updateNewAdminLogin(@ModelAttribute("updateadminlogin") AdminLogin adminlogin) {

		adminLoginService.save(adminlogin);
		return ADMINLISTFORM;
	}

	@GetMapping("deleteadminlogin")
	public String deleteAdminLogin(@RequestParam("adminid") int adminid) {
		adminLoginService.deleteById(adminid);
		return ADMINLISTFORM;
	}

	@GetMapping("/adminlist")
	public String getAllAdminLogin(Model model) {
		List<AdminLogin> adminlogin = adminLoginService.getAdminLogin();
		model.addAttribute("alladmin", adminlogin);
		return "list-admin-login";
	}

	@GetMapping("/adminloginform")
	public String adminLoginForm(Model model) {
		AdminLogin adminlogin = new AdminLogin();
		model.addAttribute("adminlogin", adminlogin);
		return ADMINLOGINFORM;
	}

	@PostMapping("/checkadminloginform")
	public String checkingAccess(@ModelAttribute("adminlogin") AdminLogin adminlogin,Model model) {
		AdminLogin adminLogin = adminLoginService.getAdminByIdAndPassword(adminlogin.getAdminId(),
				adminlogin.getPassword());
		if (adminLogin != null) {
			return "redirect:/adminlogins/adminindex";
		} else
			model.addAttribute("result","Invalid Username and Password");
			return ADMINLOGINFORM;

	}

	@GetMapping("/adminindex")
	public String skills() {
		return "skill-page";
	}

}
