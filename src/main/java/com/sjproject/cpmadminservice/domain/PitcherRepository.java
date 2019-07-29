package com.sjproject.cpmadminservice.domain;

import java.util.List;

public interface PitcherRepository {

    List<Pitcher> getPitchers();

    Pitcher getPitcher(String name);


}
