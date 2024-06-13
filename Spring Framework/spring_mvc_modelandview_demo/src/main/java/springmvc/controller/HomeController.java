package springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		
		//Creating model and view object
		ModelAndView modelAndView=new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name","Nandni Patel");
		modelAndView.addObject("address","Arud");
//		LocalDateTime now=LocalDateTime.now();
//		modelAndView.addObject("time", now);
		
		//setting the view name 
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
