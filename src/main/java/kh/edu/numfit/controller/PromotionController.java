package kh.edu.numfit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PromotionController {
	@GetMapping("/promotion")
	public String getHome() {
		return "promotion/home";
	}
}
