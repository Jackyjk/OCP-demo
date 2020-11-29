package com.isoftstone.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    @RequestMapping("/submit")
    public String submit() {
        return "submit";
    }
}
