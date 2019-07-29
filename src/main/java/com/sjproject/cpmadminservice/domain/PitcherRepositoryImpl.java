package com.sjproject.cpmadminservice.domain;

import java.util.ArrayList;
import java.util.List;

public class PitcherRepositoryImpl implements PitcherRepository {

    private List<Pitcher> pitchers = new ArrayList<>();

    public PitcherRepositoryImpl() {
        pitchers.add(new Pitcher("P0001", "강규철", "두산", "노말", 47L, 2000L));
        pitchers.add(new Pitcher("P0002", "강동우", "삼성", "노말", 49L, 2000L));
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
