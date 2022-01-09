package com.docjpa.laba2.JPA.S.controlers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ordcontroller {

    @GetMapping("/ord-control")
    public String documentORD(Model model){
        model.addAttribute("title", "Main console and control pages");
        return "/PagesGen/ord-control";
    }
}
