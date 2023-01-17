package kh.edu.numfit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("")
	public String home() {
		return "index";
	}
	@GetMapping("/login")
	public String getLogin() {
		return "loginform/login";
	}
	@GetMapping("/login?logout")
	public String getLogout() {
		return "redirect:/course";
	}
	
}
