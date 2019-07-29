package com.sjproject.cpmadminservice.controller;

import com.sjproject.cpmadminservice.domain.Pitcher;
import com.sjproject.cpmadminservice.domain.PitcherRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PitcherController.class)
public class PitcherControllerTests {

    @MockBean
    PitcherRepository pitcherRepository;

    @Autowired
    private MockMvc mvc;

    @Test
    public void list() throws Exception {

        List<Pitcher> pitchers = new ArrayList<>();
        pitchers.add(new Pitcher("P0001", "가내영", "SK", "노말", 54L, 2000L));
        pitchers.add(new Pitcher("P0002", "가득염", "롯데", "노말", 64L, 2000L));
        given(pitcherRepository.getPitchers()).willReturn(pitchers);

        mvc.perform(get("/pitchers"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                        containsString("\"id\":\"P0001\"")
                ))
                .andExpect(content().string(
                        containsString("\"name\":\"가내영\"")
                ))
                .andExpect(content().string(
                        containsString("\"team\":\"SK\"")
                ))
                .andExpect(content().string(
                        containsString("\"grade\":\"노말\"")
                ))
                .andExpect(content().string(
                        containsString("\"overall\":54")
                ))
                .andExpect(content().string(
                        containsString("\"year\":2000")
                ));
    }

    @Test
    public void detail() throws Exception {

        Pitcher pitcher = new Pitcher("P0999", "손호준", "LG", "몬스터", 99L, 2019L);
        given(pitcherRepository.getPitcher("손호준")).willReturn(pitcher);

        mvc.perform(get("/pitchers/손호준")
                .contentType(MediaType.APPLICATION_JSON)
                .characterEncoding("utf-8"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                        containsString("\"id\":\"P0999\"")
                ))
                .andExpect(content().string(
                        containsString("\"name\":\"손호준\"")
                ))
                .andExpect(content().string(
                        containsString("\"team\":\"LG\"")
                ))
                .andExpect(content().string(
                        containsString("\"grade\":\"몬스터\"")
                ))
                .andExpect(content().string(
                        containsString("\"overall\":99")
                ))
                .andExpect(content().string(
                        containsString("\"year\":2019")
                ));
    }
}