package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Product;
import com.app.service.IProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private IProductService service;
	
	//1. To show Register page
	@RequestMapping("/register")
	public String showRegPage(ModelMap map) {
		map.addAttribute("product", new Product());
		return "ProductRegister";
	}
	

	//2. to save data in DB
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveData(@ModelAttribute Product product,ModelMap map) {
		Integer id=service.saveProduct(product);
		map.addAttribute("message", "saved with Id:"+id);
		//clean form
		map.addAttribute("product", new Product());
		return "ProductRegister";
	}
	
	//3. display all records in DB at UI
	@RequestMapping("/all")
	public String showAll(ModelMap map) {
		List<Product> prods=service.getAllProducts();
		map.addAttribute("list", prods);
		return "ProductData";
	}
	
	//4. delete data
	@RequestMapping("/delete")
	public String deleteData(@RequestParam Integer id,ModelMap map) {
		service.deleteProduct(id);
		//get All new records
		List<Product> prods=service.getAllProducts();
		map.addAttribute("list", prods);
		map.addAttribute("message", id+" Deleted");
		return "ProductData";
	}
	
	
	
}


