package com.sjproject.cpmadminservice.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HitterRepositoryImpl implements HitterRepository {

    private List<Hitter> hitters = new ArrayList<>();

    public HitterRepositoryImpl() {
        hitters.add(new Hitter(1L, "강규철", "두산", "노말", 47L, 2000L));
        hitters.add(new Hitter(2L, "강동우", "삼성", "노말", 49L, 2000L));
    }

    @Override
    public List<Hitter> getHitters() {
        return hitters;
    }

    @Override
    public Hitter getHitter(String name) {
        Hitter hitter = hitters.stream()
                .filter(r -> r.getName().equals(name))
                .findFirst()
                .orElse(null);
        return hitter;
    }
}
