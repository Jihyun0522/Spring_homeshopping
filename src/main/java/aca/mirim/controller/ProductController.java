package aca.mirim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aca.mirim.domain.Criteria;
import aca.mirim.domain.ProductVO;
import aca.mirim.service.ProductService;

@Controller
@RequestMapping("/product/*")
public class ProductController {
	@Autowired
	ProductService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		System.out.println("list get");
		List<ProductVO> list = service.getList();
		model.addAttribute("list", list);
	}
	
	@PostMapping("/list")
	public void listPost(Criteria cri, Model model) {
		System.out.println("searcg");
		List<ProductVO> searchList = service.getSearch(cri);
		model.addAttribute("list",searchList);
	}
	
	@GetMapping("/get")
	public void get(@RequestParam("proname") String proname, Model model) {
		System.out.println("get get");
		ProductVO product = service.read(proname);
		model.addAttribute("product", product);
	}
	
	@GetMapping("/register")
	public void register() {
		System.out.println("register get");
	}
	
	@PostMapping("/register")
	public String register(ProductVO product) {
		System.out.println("register post");
		service.insert(product);
		return "redirect:/product/list";
	}
	
	@GetMapping("/remove")
	public String remove(@RequestParam("proname") String proname) {
		System.out.println("remove get...");
		service.remove(proname);
		return "redirect:/product/list";
	}
	
	@GetMapping("/buy")
	public String buy(@RequestParam("proname") String proname) {
		System.out.println("buy get...");
		service.buy(proname);
		return "redirect:/product/list";
	}
}
