package com.sunsw.dbquerier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
	@Value("${spring.application.name}")
	String appName;
	
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("appName", appName);
		return "home";
	}
	
	@GetMapping("/home")
	public String homePage1(Model model) {
		model.addAttribute("appName", appName);
		return "home";
	}
	
	@GetMapping("/hello")
	public String helloPage(Model model) {
		model.addAttribute("appName", appName);
		return "hello";
	}
	
	@GetMapping("/login")
	public String loginPage(Model model) {
		model.addAttribute("appName", appName);
		return "login";
	}
}
