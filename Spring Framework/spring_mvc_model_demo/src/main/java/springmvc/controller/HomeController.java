package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		
		System.out.println("hello i am home page");
		model.addAttribute("name","Nandni Patel");
		model.addAttribute("id",12345);
		
		return "index";
	}


	@RequestMapping("/about")
	public String about() {
		System.out.println("hello i am about page");
		return "about";
	}
}
