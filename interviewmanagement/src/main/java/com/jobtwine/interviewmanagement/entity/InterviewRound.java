package com.jobtwine.interviewmanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class InterviewRound {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roundName;

    @ManyToOne
    @JoinColumn(name = "skillId")
    private Skill skill;

    public InterviewRound() {
    }

}
