package com.sjproject.cpmadminservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PitcherController {

    @GetMapping("/pitchers")
    public String findAll() {
        return "Hello World!!";
    }
}
