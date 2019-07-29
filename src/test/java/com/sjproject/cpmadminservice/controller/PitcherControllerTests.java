package com.sjproject.cpmadminservice.controller;

import com.sjproject.cpmadminservice.domain.Pitcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PitcherController.class)
public class PitcherControllerTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void list() throws Exception {

        mvc.perform(get("/pitchers"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                        containsString("\"id\":\"P0001\"")
                ))
                .andExpect(content().string(
                        containsString("\"name\":\"강규철\"")
                ))
                .andExpect(content().string(
                        containsString("\"team\":\"두산\"")
                ))
                .andExpect(content().string(
                        containsString("\"player_grade\":\"노말\"")
                ))
                .andExpect(content().string(
                        containsString("\"overall\":47")
                ))
                .andExpect(content().string(
                        containsString("\"year\":2000")
                ));
    }

    @Test
    public void detail() throws Exception {

        mvc.perform(get("/pitchers/강규철")
                .contentType(MediaType.APPLICATION_JSON)
                .characterEncoding("utf-8"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                        containsString("\"id\":\"P0001\"")
                ))
                .andExpect(content().string(
                        containsString("\"name\":\"강규철\"")
                ))
                .andExpect(content().string(
                        containsString("\"team\":\"두산\"")
                ))
                .andExpect(content().string(
                        containsString("\"player_grade\":\"노말\"")
                ))
                .andExpect(content().string(
                        containsString("\"overall\":47")
                ))
                .andExpect(content().string(
                        containsString("\"year\":2000")
                ));
    }
}