package aca.mirim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
