package de.ronasoft.springboot.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import de.ronasoft.springboot.mysql.domain.Auto;
import de.ronasoft.springboot.mysql.service.AutoService;

@Controller
public class AutoController {

	@Autowired
	private AutoService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
	    List<Auto> listAutos = service.listAll();
	    model.addAttribute("listAutos", listAutos);
	     
	    return "index";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
	    Auto auto = new Auto();
	    model.addAttribute("auto", auto);
	     
	    return "new_auto";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("auto") Auto auto) {
	    service.save(auto);
	     
	    return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("edit_auto");
	    Auto auto = service.get(id);
	    mav.addObject("product", auto);
	     
	    return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
	    service.delete(id);
	    return "redirect:/";       
	}
}
