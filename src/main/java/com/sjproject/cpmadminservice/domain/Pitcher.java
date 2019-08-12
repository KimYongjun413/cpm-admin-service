package com.sjproject.cpmadminservice.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pitcher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String team;
    private String grade;
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
    private String createdBy;
    private LocalDateTime createdAt;
    private String updatedBy;
    private LocalDateTime updatedAt;

    public Pitcher(Long id, String name, String team, String grade, Long overall, Long year, String createdBy, LocalDateTime createdAt) {
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
