package aca.mirim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aca.mirim.domain.UserVO;

@Controller
@RequestMapping("/user/*")
public class UserController {
	@GetMapping("/register")
	public void register() {
		System.out.println("register get");
	}
	
	@PostMapping("/register")
	public String register(UserVO user) {
		System.out.println("register post");
		return "redirect:/user/login";
	}
	
	@GetMapping("/remove")
	public String remove(String id) {
		System.out.println("remove get");
		return "redirect:/";
	}
	
	@GetMapping("/myPage")
	public void myPage() {
		System.out.println("myPage get");
	}
}
