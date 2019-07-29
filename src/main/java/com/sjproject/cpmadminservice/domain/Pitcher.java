package com.sjproject.cpmadminservice.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pitcher {
    @Id
    private String id;
    private String name;
    private String team;
    private String player_grade;
    private Long overall;
    private Long year;
    private Long change;
    private Long ninth;
    private Long pitch;
    private Long mental;
    private Long health;
    private String position;
    private String hand_type;
    private String pitch_type;
    private Long maximum_level;
    private String record1;
    private String record2;
    private String record3;
    private String record4;
    private String record5;
    private String record6;
    private String record7;
    private String record8;
    private String record9;
    private String record10;

    public Pitcher(String id, String name, String team, String player_grade, Long overall, Long year) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.player_grade = player_grade;
        this.overall = overall;
        this.year = year;
    }
}
