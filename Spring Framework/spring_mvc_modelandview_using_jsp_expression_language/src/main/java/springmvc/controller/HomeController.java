package springmvc.controller;
import java.util.*;
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

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		
		//Creating model and view object
		ModelAndView modelAndView=new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name","Nandni Patel");
		modelAndView.addObject("address","Arud");
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		//marks
		List<Integer> list=new ArrayList<Integer>();
		list.add(89);
		list.add(81);
		list.add(94);
		list.add(96);
		
		modelAndView.addObject("marks",list);
		
		//setting the view name 
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
