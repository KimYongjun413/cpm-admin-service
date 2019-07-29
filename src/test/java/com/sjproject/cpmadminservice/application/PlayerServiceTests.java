package com.sjproject.cpmadminservice.application;

import com.sjproject.cpmadminservice.domain.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PlayerServiceTests {

    private PlayerService playerService;

    @Before
    public void setUp() {
        HitterRepository hitterRepository = new HitterRepositoryImpl();
        PitcherRepository pitcherRepository = new PitcherRepositoryImpl();
        playerService = new PlayerService(hitterRepository, pitcherRepository);

    }

    @Test
    public void getHitter() {
        Hitter hitter = playerService.getHitter("강동우");
        assertThat(hitter.getName(), is("강동우"));
    }

    @Test
    public void getHitters() {
        List<Hitter> hitters = playerService.getHitters();
        assertThat(hitters.get(1).getName(), is("강동우"));
    }

    @Test
    public void getPitcher() {
        Pitcher pitcher = playerService.getPitcher("가득염");
        assertThat(pitcher.getName(), is("가득염"));
    }

    @Test
    public void getPitchers() {
        List<Pitcher> pitchers = playerService.getPitchers();
        assertThat(pitchers.get(1).getName(), is("가득염"));
    }
}