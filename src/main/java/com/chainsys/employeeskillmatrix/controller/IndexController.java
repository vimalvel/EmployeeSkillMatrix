package com.chainsys.employeeskillmatrix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/")
	private String indexPage() {
		return "index";
	}
	@GetMapping("/index")
	private String homepage() {
		return "index";
	}
	@GetMapping("/home")
	private String homePage() {
		return "Home";
	}
	@GetMapping("/demos")
	private String demoPage() {
		return "demo";
	}
}
