package kh.edu.numfit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kh.edu.numfit.model.TeachScheduleModel;
import kh.edu.numfit.service.TeachScheduleService;

@Controller
public class TeachScheduleController {
	@Autowired
	private TeachScheduleService teachSchedulService;
	
	@GetMapping("/schedulehome")
	public String home() {
		List<TeachScheduleModel> list= new ArrayList<>();
		
		list = teachSchedulService.getTeachScheduleByTeacherCode("fit001");
		System.out.println("list of teach schedule service is "+list);
		return "schedule/schedulehome";
	}
}
