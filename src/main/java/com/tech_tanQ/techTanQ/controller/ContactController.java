package com.tech_tanQ.techTanQ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

	@PostMapping("/contact/send")
    public String submitForm() {
        // DB保存

        return "thankyou"; // thankyou.htmlに遷移
    }
}