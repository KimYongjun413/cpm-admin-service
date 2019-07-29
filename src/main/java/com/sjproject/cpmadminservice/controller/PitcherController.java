package com.sjproject.cpmadminservice.controller;

import com.sjproject.cpmadminservice.application.PlayerService;
import com.sjproject.cpmadminservice.domain.Pitcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PitcherController {

    @Autowired
    PlayerService playerService;

    @GetMapping("/pitchers")
    public List<Pitcher> list() {
        List<Pitcher> pitchers = playerService.getPitchers();
        return pitchers;
    }

    @GetMapping("/pitchers/{name}")
    public Pitcher detail(@PathVariable("name") String name) {
        Pitcher pitcher = playerService.getPitcher(name);
        return pitcher;

    }
}
