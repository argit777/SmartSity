package com.sity.smart_sity.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Главная страница");
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("name", "О городе");
        return "about";
    }
    @GetMapping("/lk")
    public String lk(Model model) {
        model.addAttribute("name", "Личный кабинет");
        return "lk";
    }

}