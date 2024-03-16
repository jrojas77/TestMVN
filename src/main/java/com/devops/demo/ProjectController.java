package com.devops.demo;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectController {
	//mapping with index.jsp
	@RequestMapping("/")
	public String index(Model model){
		String message;
		LocalTime current = LocalTime.now();
        
		if (current.isBefore(LocalTime.NOON)) {
            message = "Good morning";
        } else if (current.isBefore(LocalTime.of(18, 0))) {
            message = "Good afternoon";
        } else {
            message = "Good evening";
        }
		
        model.addAttribute("message", message);
        
		return "index"; 
	}
}
