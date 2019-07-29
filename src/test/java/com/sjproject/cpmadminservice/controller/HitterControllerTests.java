package com.sjproject.cpmadminservice.controller;

import com.sjproject.cpmadminservice.domain.Hitter;
import com.sjproject.cpmadminservice.domain.HitterRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
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
@WebMvcTest(HitterController.class)
public class HitterControllerTests {

    @MockBean
    HitterRepository hitterRepository;

    @Autowired
    private MockMvc mvc;

    @Test
    public void list() throws Exception {
        List<Hitter> hitters = new ArrayList<>();
        hitters.add(new Hitter("H0001", "강규철", "두산", "노말", 47L, 2000L));
        hitters.add(new Hitter("H0002", "강동우", "삼성", "노말", 49L, 2000L));
        given(hitterRepository.getHitters()).willReturn(hitters);

        mvc.perform(get("/hitters"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                        containsString("\"id\":\"H0001\"")
                ))
                .andExpect(content().string(
                        containsString("\"name\":\"강규철\"")
                ))
                .andExpect(content().string(
                        containsString("\"team\":\"두산\"")
                ))
                .andExpect(content().string(
                        containsString("\"grade\":\"노말\"")
                ))
                .andExpect(content().string(
                        containsString("\"overall\":47")
                ))
                .andExpect(content().string(
                        containsString("\"year\":2000")
                ));
    }

}