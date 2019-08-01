package aca.mirim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aca.mirim.domain.UserVO;
import aca.mirim.service.UserService;

@Controller
@RequestMapping("/user/*")
public class UserController {
	@Autowired
	UserService service;
	
	@GetMapping("/register")
	public void register() {
		System.out.println("register get");
	}
	
	@PostMapping("/register")
	public String register(UserVO user) {
		System.out.println("register post");
		service.insert(user);
		return "redirect:/user/login";
	}
	
	@GetMapping("/remove")
	public String remove(String id) {
		System.out.println("remove get");
		service.remove(id);
		return "redirect:/";
	}
	
	@GetMapping("/myPage")
	public void myPage(@RequestParam("id") String id, Model model) {
		System.out.println("myPage get");
		UserVO user = service.read(id);
		model.addAttribute("user", user);
	}
}
