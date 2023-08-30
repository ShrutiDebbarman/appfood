package org.foodapp.controller;

import java.util.List;

import org.foodapp.model.Category;
import org.foodapp.model.Item;
import org.foodapp.service.CategoryService;
import org.foodapp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ItemService itemService;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Category> list = categoryService.viewAllCategory();
		model.addAttribute("categories",list);
		List<Item> itemlist = itemService.viewAllItems();
		model.addAttribute("items",itemlist);
		return "index";
	}
	
	@GetMapping("/index")
	public String indexClick(Model model) {
		List<Category> list = categoryService.viewAllCategory();
		model.addAttribute("categories",list);
		List<Item> itemlist = itemService.viewAllItems();
		model.addAttribute("items",itemlist);
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
