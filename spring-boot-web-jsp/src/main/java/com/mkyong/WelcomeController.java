package com.mkyong;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="/")
	public String welcome(@RequestParam(value="name",required=false,defaultValue="HH")  String message,Model model ) {
		model.addAttribute("message", message);
		return "welcome";
	}

}