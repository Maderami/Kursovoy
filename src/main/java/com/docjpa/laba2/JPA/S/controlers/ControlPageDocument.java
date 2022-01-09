package com.docjpa.laba2.JPA.S.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ControlPageDocument {

    @GetMapping("/ord-control")
    public String documentORD(Model model){
        model.addAttribute("title", "Main console and control pages");
        return "/PagesGen/ord-control";
    }

    @GetMapping("/hr-docs")
    public String documenHR(Model model){
        model.addAttribute("title", "Main console and control pages");
        return "/PagesGen/HRDocuments";
    }

    @GetMapping("/th-docs")
    public String documenTH(Model model){
        model.addAttribute("title", "Main console and control pages");
        return "/PagesGen/TechDocs";
    }

    @GetMapping("/plans-docs")
    public String documenPlD(Model model){
        model.addAttribute("title", "Main console and control pages");
        return "/PagesGen/plansPages";
    }
    @GetMapping("/all-docs")
    public String documenAllD(Model model){
        model.addAttribute("title", "Main console and control pages");
        return "/PagesGen/AllDocuments";
    }
    @GetMapping("/gen-repository")
    public String documenGR(Model model){
        model.addAttribute("title", "Main console and control pages");
        return "/PagesGen/GeneralRepository";
    }
    @GetMapping("/info-docs")
    public String documenInDs(Model model){
        model.addAttribute("title", "Main console and control pages");
        return "/PagesGen/Informations";
    }
    @GetMapping("/lows-docs")
    public String documenLD(Model model){
        model.addAttribute("title", "Main console and control pages");
        return "/PagesGen/LowsDocuments";
    }
    @GetMapping("/menag-docs")
    public String documenMD(Model model){
        model.addAttribute("title", "Main console and control pages");
        return "/PagesGen/MenegmentsDocuments";
    }
    @GetMapping("/engen-docs")
    public String documenED(Model model){
        model.addAttribute("title", "Main console and control pages");
        return "/PagesGen/EngeniringDocuments";
    }

}
