package br.com.computocell.firstspringboot.firstspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstSpringBootController {

    @RequestMapping("/")
    public String index() {
        return "Page index";
    }

    @RequestMapping("/showtext")
    public String showText() {
        return "Hello first spring-boot- projrect";
    }
}
