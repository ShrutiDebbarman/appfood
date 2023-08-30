package org.foodapp.item.controller;

import org.foodapp.category.model.Category;
import org.foodapp.item.model.Item;
import org.foodapp.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/additem")
	public String addItem(Model model) {
		Item item = new Item();
		model.addAttribute("item", item);
		return "item/additem";
	}
	
	@PostMapping("/additemprocess")
	public String addItemProcess(@ModelAttribute("item") Item item) {
		Item im = itemService.addItem(item);
		if(im==null) {
			return "item/itemaddunsuccess";
		}
		else {
			return "item/itemaddsuccess";
		}
	}
//	
//	@GetMapping("/modifyitem")
//	public String modifyItem(Model model) {
//		Item item = new Item();
//		model.addAttribute("item", item);
//		return "item/modifyitem";
//	}
//	
//	

}




