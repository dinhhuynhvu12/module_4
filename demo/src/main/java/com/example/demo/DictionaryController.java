package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {

    private static  Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("book", "quyển sách");
        dictionary.put("computer", "máy tính");
        dictionary.put("student", "sinh viên");
        dictionary.put("teacher", "giáo viên");
    }

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/search")
    public String search(@RequestParam("word") String word, Model model) {
        String result = dictionary.get(word.toLowerCase());

        if (result != null) {
            model.addAttribute("word", word);
            model.addAttribute("result", result);
        } else {
            model.addAttribute("word", word);
            model.addAttribute("result", "Không tìm thấy từ này.");
        }

        return "result";
    }
}