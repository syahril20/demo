package com.latihan.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perpus")
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Yaudaaahh,, Boleeeh!";
    }
}