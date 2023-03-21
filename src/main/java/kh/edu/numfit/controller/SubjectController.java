package kh.edu.numfit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SubjectController {
	@GetMapping("/subject")
	public String getHome() {
		return "subject/home";
	}
	@RequestMapping(value = "/edit")
	public String edit(){
		return "edit";
	}
}
