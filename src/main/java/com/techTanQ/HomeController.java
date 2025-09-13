package com.techTanQ;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";  // home.html を返す
    }
    
    @GetMapping("/about")
    public String about() {
    	return "about";
    }
    
    @GetMapping("/contact") 
    	public String contact() {
    		return "contact";
    	}
    
    @GetMapping("/article1") 
	public String article1() {
		return "article1";
    }
}