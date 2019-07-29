package com.sjproject.cpmadminservice.controller;

import com.sjproject.cpmadminservice.domain.Pitcher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PitcherController {


    private List<Pitcher> pitchers = new ArrayList<>();

    public PitcherController() {
        pitchers.add(new Pitcher("P0001", "강규철", "두산", "노말", 47L, 2000L));
        pitchers.add(new Pitcher("P0002", "강동우", "삼성", "노말", 49L, 2000L));
    }

    @GetMapping("/pitchers")
    public List<Pitcher> list() {

        return pitchers;
    }

    @GetMapping("/pitchers/{name}")
    public Pitcher detail(@PathVariable("name") String name) {
        Pitcher pitcher = pitchers.stream()
                .filter(r -> r.getName().equals(name))
                .findFirst()
                .orElse(null);
        return pitcher;

    }
}
