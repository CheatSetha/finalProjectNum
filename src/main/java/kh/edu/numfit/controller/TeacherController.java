package kh.edu.numfit.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kh.edu.numfit.model.TeacherModel;
import kh.edu.numfit.model.UserModel;
import kh.edu.numfit.service.TeacherService;
import kh.edu.numfit.service.UserServiceImp;

@Controller
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	private List<String> gender;

	public TeacherController() {
		gender = new ArrayList<>();
		gender.add("Male");
		gender.add("Female");
	}
	
	
	@GetMapping("/admin/teachers")
	public String getTeachers(Model model) {
		return findPaginated(1, model);
	}
	@GetMapping("/admin/newteacher")
	public String newUser(Model model) {
		TeacherModel newTeacher = new TeacherModel();
		newTeacher.setGender("Male");
		model.addAttribute("NEW_TEACHER",newTeacher);
		return "teacher/newteacher";
	}
	@PostMapping("/admin/saveteacher")
	public String saveUser(@ModelAttribute("NEW_TEACHER") TeacherModel teacher) {
		System.out.println("new teacher is : "+teacher);
		teacherService.updateorSaveUser(teacher);
		return "redirect:/admin/teachers";
	}
	@GetMapping("/admin/editteacher/{id}")
	public ModelAndView editUser(@PathVariable("id") String id) {
		System.out.println("edit user by id "+id);
		TeacherModel editTeacher = teacherService.getTeacherById(id);
		ModelAndView mv = new ModelAndView("/teacher/editteacher");
		mv.addObject("EDIT_TEACHER", editTeacher);
		return mv;
	}
	@GetMapping("/admin/deleteteacher/{id}")
	public String deleteTeacher(@PathVariable("id")String id) {
		teacherService.deleteUserById(id);
		return "redirect:/admin/teachers";
	}
	
	@GetMapping("/search")
	public ModelAndView searchUsername(@Param("keyword")String keyword, Model model) {
	
		ModelAndView mv = new ModelAndView("/teacher/teacherlist");
		
			List<TeacherModel> list = teacherService.searchUser(keyword);
			mv.addObject("TEACHER_LIST", list);
		
		
		return mv;
		
	}
	
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable("pageNo")Integer pageNo, Model model) {
		int pageSize = 4;
		Page<TeacherModel> page = teacherService.findPaginated(pageNo, pageSize);
		List<TeacherModel> usersList = page.getContent(); 
		model.addAttribute("currentPage",pageNo);
		model.addAttribute("totalPages",page.getTotalPages());
		model.addAttribute("totalItems",page.getTotalElements());
		model.addAttribute("TEACHER_LIST",usersList);
		
		return "teacher/teacherlist";
	}
	
}
