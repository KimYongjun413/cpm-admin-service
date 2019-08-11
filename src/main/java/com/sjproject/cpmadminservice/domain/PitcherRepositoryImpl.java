package com.sjproject.cpmadminservice.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PitcherRepositoryImpl implements PitcherRepository {

    private List<Pitcher> pitchers = new ArrayList<>();

    public PitcherRepositoryImpl() {
        pitchers.add(new Pitcher(1L, "가내영", "SK", "노말", 54L, 2000L));
        pitchers.add(new Pitcher(2L, "가득염", "롯데", "노말", 64L, 2000L));
    }

    @Override
    public List<Pitcher> getPitchers() {
        return pitchers;
    }

    @Override
    public Pitcher getPitcher(String name) {
        Pitcher pitcher = pitchers.stream()
                .filter(r -> r.getName().equals(name))
                .findFirst()
                .orElse(null);
        return pitcher;
    }
}
