package com.sjproject.cpmadminservice.controller;

import com.sjproject.cpmadminservice.domain.Pitcher;
import com.sjproject.cpmadminservice.domain.PitcherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PitcherController {


    @Autowired
    PitcherRepository pitcherRepository;

    @GetMapping("/pitchers")
    public List<Pitcher> list() {

        List<Pitcher> pitchers = pitcherRepository.getPitchers();

        return pitchers;
    }

    @GetMapping("/pitchers/{name}")
    public Pitcher detail(@PathVariable("name") String name) {
        Pitcher pitcher = pitcherRepository.getPitcher(name);
        return pitcher;

    }
}
