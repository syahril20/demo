package com.latihan.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Yaudaaahh,, Boleeeh!";
    }
    @GetMapping("/kipak")
    public String yahu() {
        return "AhMeme sia Mah!";
    }

}