package com.shoesstore.shoesstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {
    @RequestMapping("/contact")
    public String contactView() {
        return "/Page/Views/Contact/contact";
    }
}
