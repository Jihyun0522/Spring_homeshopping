package aca.mirim.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aca.mirim.domain.LoginDTO;
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
	public String remove(String id, HttpSession session) {
		System.out.println("remove get");
		service.remove(id);
		session.removeAttribute("login");
		session.invalidate();
		return "redirect:/product/list";
	}
	
	@GetMapping("/myPage")
	public void myPage(Model model) {
		System.out.println("myPage get");
	}
	
	@GetMapping("/login")
	public void login(@ModelAttribute("dto") LoginDTO dto) {
		System.out.println("login get");
	}
	
	@PostMapping("/loginPost")
	public String loginPost(LoginDTO dto, HttpSession session, Model model) {
		System.out.println("login Post" + dto);
		UserVO user = service.login(dto);
		if(user==null) {
			model.addAttribute("msg", "���̵� �Ǵ� ��й�ȣ�� ���� �ʽ��ϴ�.");
			return "/login";
		}
		model.addAttribute("user", user);
		return "/product/list";
	}
	
	@GetMapping("/adminPage")
	public void adminPage(Model model) {
		System.out.println("adminPage get");
		List<UserVO> list = service.getList();
		model.addAttribute("list", list);
	}
}
