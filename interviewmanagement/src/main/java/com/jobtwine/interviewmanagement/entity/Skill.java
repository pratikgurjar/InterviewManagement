package com.jobtwine.interviewmanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;
    private String skillName;
    @OneToMany(mappedBy = "skill", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<InterviewQuestion> questions;
    @OneToMany(mappedBy = "skill", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<InterviewRound> interviewRounds;
    @OneToMany(mappedBy = "skill", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Job> jobs;
    private int scoreCards;

    public Skill() {
    }

}

