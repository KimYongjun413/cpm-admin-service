package com.sjproject.cpmadminservice.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hitter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String team;
    private String grade;
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
    private String createdBy;
    private LocalDateTime createdAt;
    private String updatedBy;
    private LocalDateTime updatedAt;

    public Hitter(Long id, String name, String team, String grade, Long overall, Long year, String createdBy, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.grade = grade;
        this.overall = overall;
        this.year = year;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
    }
}
