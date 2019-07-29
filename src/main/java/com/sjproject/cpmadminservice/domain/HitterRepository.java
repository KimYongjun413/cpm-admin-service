package com.sjproject.cpmadminservice.domain;

import java.util.List;

public interface HitterRepository {

    List<Hitter> getHitters();

    Hitter getHitter(String name);
}
