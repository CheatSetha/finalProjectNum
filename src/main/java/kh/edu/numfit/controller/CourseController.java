package kh.edu.numfit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {
	
	@GetMapping("/course")
	public String getCourse() {
		return "course/courselist";
	}
}
