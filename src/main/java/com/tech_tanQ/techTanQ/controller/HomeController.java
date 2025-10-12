package com.tech_tanQ.techTanQ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
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

    @GetMapping("/article2")
    public String article2() {
        return "article2";
    }

    @GetMapping("/article3")
    public String article3() {
        return "article3";
    }
}