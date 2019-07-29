package com.sjproject.cpmadminservice.controller;

import com.sjproject.cpmadminservice.application.PlayerService;
import com.sjproject.cpmadminservice.domain.Hitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HitterController {

    @Autowired
    PlayerService playerService;

    @GetMapping("/hitters")
    public List<Hitter> list() {
        List<Hitter> hitters = playerService.getHitters();
        return hitters;
    }

    @GetMapping("/hitters/{name}")
    public Hitter detail(@PathVariable("name") String name) {
        Hitter hitter = playerService.getHitter(name);
        return hitter;
    }

}
