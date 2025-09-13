package com.techTanQ;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

	@PostMapping("/contact/send")
    public String submitForm(@ModelAttribute ContactForm contactForm) {
        // contactForm.getName() などで取得できます！
        System.out.println("お名前: " + contactForm.getName());
        System.out.println("メール: " + contactForm.getEmail());
        System.out.println("内容: " + contactForm.getMessage());

        // ここでメール送信やDB保存などの処理も可能です！

        return "thankyou"; // thankyou.html に遷移
    }
}