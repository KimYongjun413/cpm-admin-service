package com.sjproject.cpmadminservice.controller;

import com.sjproject.cpmadminservice.domain.Hitter;
import com.sjproject.cpmadminservice.domain.HitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HitterController {

    @Autowired
    HitterRepository hitterRepository;

    @GetMapping("/hitters")
    public List<Hitter> list() {

        List<Hitter> hitters = hitterRepository.getHitters();

        return hitters;
    }

    @GetMapping("/hitters/{name}")
    public Hitter detail(@PathVariable("name") String name) {

        Hitter hitter = hitterRepository.getHitter(name);

        return hitter;
    }

}
