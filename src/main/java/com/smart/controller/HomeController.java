package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.dao.UserRepository;
import com.smart.entities.User;

@Controller
public class HomeController {

	/*
	 * @Autowired private UserRepository userRepository;
	 */
	
	
	@RequestMapping("/base")
	public String base() {
		return "base";
	}
	
	
	@RequestMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("title", "Home - SMC");
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		
		model.addAttribute("title", "About - SMC");
		return "about";
	}
	
	
	/*
	 * @GetMapping("/test")
	 * 
	 * @ResponseBody public String test() {
	 * 
	 * User user = new User(); user.setName("John Doe");
	 * user.setEmail("seconedemaiol@email.com");
	 * 
	 * userRepository.save(user);
	 * 
	 * return "Working... !! " ; }
	 */
	
}
