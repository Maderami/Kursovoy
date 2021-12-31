package com.docjpa.laba2.JPA.S.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ControlPageDocument {

    @GetMapping("/ord-control")
    public String documentConsole(Model model){
        model.addAttribute("title", "Main console and control pages");
        return "ord-control";
    }
}
