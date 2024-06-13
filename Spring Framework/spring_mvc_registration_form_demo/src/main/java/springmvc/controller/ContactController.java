package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {

	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header","Welcome User ");
		model.addAttribute("Desc", "User Information");
		System.out.println("Adding common data to model");
	}
	
	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("Creating form");
		return "contact";
	}
	
/*	//fatch data using @RequestParam anotation
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handlerForm(@RequestParam("email") String email,
			@RequestParam("userName") String name,
			@RequestParam("userPassword") String password , Model model) {
			
			System.out.println("user email is "+email);
			System.out.println("user name is "+name);
			System.out.println("user password is "+password);
			
			//process
			model.addAttribute("name", name);
			model.addAttribute("email",email);
			model.addAttribute("password",password);
		
		   return "success" ;
	}
	*/
	
	//fatch data using @ModelAttribute
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handlerForm(@ModelAttribute User user , Model model) {
		   System.out.println(user);
		   return "success" ;
	}
	
	
}
 