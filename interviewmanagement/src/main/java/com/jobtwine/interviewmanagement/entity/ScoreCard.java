package com.jobtwine.interviewmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Map;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScoreCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scoreCardId;
    private String description;

    @ElementCollection
    private Map<String, Integer> scoringParameters;

}
