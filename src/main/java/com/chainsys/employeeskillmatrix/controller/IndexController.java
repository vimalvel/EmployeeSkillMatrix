package com.chainsys.employeeskillmatrix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/")
	private String indexPage() {
		return "index";
	}

}
