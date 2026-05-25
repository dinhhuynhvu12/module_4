package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam("num1") double num1,
                            @RequestParam("num2") double num2,
                            @RequestParam("operator") String operator,
                            Model model) {

        double result = 0;
        String label = "";

        if (operator.equals("add")) {
            result = num1 + num2;
            label = "Addition";
        } else if (operator.equals("sub")) {
            result = num1 - num2;
            label = "Subtraction";
        } else if (operator.equals("mul")) {
            result = num1 * num2;
            label = "Multiplication";
        } else if (operator.equals("div")) {
            result = num1 / num2;
            label = "Division";
        }

        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", result);
        model.addAttribute("label", label);

        return "index";
    }
}