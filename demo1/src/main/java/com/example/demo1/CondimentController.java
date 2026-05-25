package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CondimentController {

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/save")
    public String save(
            @RequestParam(value = "condiment", required = false)
            String[] condiment,
            Model model) {

        model.addAttribute("condiments", condiment);

        return "result";
    }
}