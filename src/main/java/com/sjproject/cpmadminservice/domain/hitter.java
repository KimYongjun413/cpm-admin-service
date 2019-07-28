package com.sjproject.cpmadminservice.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class hitter {
    @Id
    private String id;
    private String name;
    private String team;
    private String player_grade;
    private Long overall;
    private Long year;
    private Long strike;
    private Long pitch;
    private Long preliminaries;
    private Long defensive;
    private String position;
    private String hand_type;
    private String preferred_batting;
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
}
