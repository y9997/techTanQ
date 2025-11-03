package com.tech_tanQ.techTanQ.controller;

import com.tech_tanQ.techTanQ.entity.Contact;
import com.tech_tanQ.techTanQ.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/contact")
    public String showForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact";
    }

    @PostMapping("/contact/send")
    public String sendForm(@ModelAttribute Contact contact) {
        contactRepository.save(contact);
        return "contact_success";
    }
}
