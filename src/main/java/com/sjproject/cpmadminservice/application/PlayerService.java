package com.sjproject.cpmadminservice.application;

import com.sjproject.cpmadminservice.domain.Hitter;
import com.sjproject.cpmadminservice.domain.HitterRepository;
import com.sjproject.cpmadminservice.domain.Pitcher;
import com.sjproject.cpmadminservice.domain.PitcherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    HitterRepository hitterRepository;

    @Autowired
    PitcherRepository pitcherRepository;

    public PlayerService(HitterRepository hitterRepository, PitcherRepository pitcherRepository) {
        this.hitterRepository = hitterRepository;
        this.pitcherRepository = pitcherRepository;
    }

    public Hitter getHitter(String name) {
        Hitter hitter = hitterRepository.getHitter(name);
        return hitter;
    }

    public List<Hitter> getHitters() {
        List<Hitter> hitters = hitterRepository.getHitters();
        return hitters;
    }

    public Pitcher getPitcher(String name) {
        Pitcher pitcher = pitcherRepository.getPitcher(name);
        return pitcher;
    }

    public List<Pitcher> getPitchers() {
        List<Pitcher> pitchers = pitcherRepository.getPitchers();
        return pitchers;
    }
}
