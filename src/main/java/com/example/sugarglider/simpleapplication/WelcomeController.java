package com.example.sugarglider.simpleapplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@Value("${welcome.message}")
	private String message;
	
	@GetMapping("/")
	public String helloWorld(Model model) {
		model.addAttribute("message", message);
		return "welcome";
	}
}
