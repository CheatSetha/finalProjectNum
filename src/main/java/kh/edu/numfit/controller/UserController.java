package kh.edu.numfit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kh.edu.numfit.model.UserModel;
import kh.edu.numfit.repository.UserRepository;
import kh.edu.numfit.service.UserServiceImp;

@Controller
public class UserController {
	@Autowired
	private UserServiceImp userService;

	@GetMapping("/admin/users")
	public String getUsers(Model model) {
		try {
			List<UserModel> list = new ArrayList<>();
			list = userService.getUsers();
			model.addAttribute("USER_LIST", list);
			
		} catch (Exception e) {
			model.addAttribute("message",e.getMessage());
		}
		return "user/userlist";
//		int roleNum = userService.getCountRole("Admin");
//		System.out.println("total role admin are "+roleNum);
//		return findPaginated(1, model);
	}
	@GetMapping("/admin/new")
	public String newUser(Model model) {
		UserModel newUser = new UserModel();
		model.addAttribute("NEW_USER",newUser);
		return "user/newuser";
	}
	@PostMapping("/admin/save")
	public String saveUser(@RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam("selectedrole") String role) {
		UserModel newUser = new UserModel(username,password,role);
		userService.updateorSaveUser(newUser);
		return "redirect:/admin/users";
	}
	@GetMapping("/admin/edit/{id}")
	public ModelAndView editUser(@PathVariable("id") Integer id) {
		System.out.println("edit user by id "+id);
		UserModel editUser = userService.getUserById(id);
		ModelAndView mv = new ModelAndView("/user/edituser");
		mv.addObject("EDIT_USER", editUser);
		return mv;
	}
	@PostMapping("/admin/update")
	public String updateUser(@ModelAttribute UserModel user) {
//		System.out.println("user update is "+user);
		userService.updateorSaveUser(user);
		return "redirect:/admin/users";
	}
	@GetMapping("/admin/delete/{id}")
	public String deleteUser(@PathVariable("id")Integer id) {
		userService.deleteUserById(id);
		return "redirect:/admin/users";
	}
//	@GetMapping("/page/{pageNo}")
//	public String findPaginated(@PathVariable("pageNo")Integer pageNo, Model model) {
//		int pageSize = 4;
//		Page<UserModel> page = userService.findPaginated(pageNo, pageSize);
//		List<UserModel> usersList = page.getContent(); 
//		model.addAttribute("currentPage",pageNo);
//		model.addAttribute("totalPages",page.getTotalPages());
//		model.addAttribute("totalItems",page.getTotalElements());
//		model.addAttribute("USER_LIST",usersList);
//		return "user/userlist";
//	}
//	@GetMapping("/search")
//	public ModelAndView searchUsername(@Param("keyword")String keyword, Model model) {
//	
//		ModelAndView mv = new ModelAndView("/user/userlist");
//		
//			List<UserModel> list = userService.searchUser(keyword);
//			mv.addObject("USER_LIST", list);
//		
//		
//		return mv;
//		
//	}
}
