package de.ronasoft.springboot.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import de.ronasoft.springboot.mysql.domain.Product;
import de.ronasoft.springboot.mysql.service.ProductService;

@Controller
public class AppController {

	@Autowired
	private ProductService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
	    List<Product> listProducts = service.listAll();
	    model.addAttribute("listProducts", listProducts);
	     
	    return "index";
	}
}
