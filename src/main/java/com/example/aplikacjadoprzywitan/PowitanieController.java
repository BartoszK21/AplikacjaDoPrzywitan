package com.example.aplikacjadoprzywitan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PowitanieController {

    @GetMapping("/")
    public String powitanie() {
        return "index";
    }

    @PostMapping("/powitanie")
    @ResponseBody
    public String powitajUzytkownika(@RequestParam String imie, @RequestParam String nazwisko) {
        // Powitanie użytkownika po wprowadzeniu imienia i nazwiska
        return "Cześć " + imie + " " + nazwisko;
    }
}
