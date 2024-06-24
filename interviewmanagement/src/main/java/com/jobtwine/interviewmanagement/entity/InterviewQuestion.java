package com.jobtwine.interviewmanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class InterviewQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;

    @ManyToOne
    @JoinColumn(name = "skillId")
    private Skill skill;

    public InterviewQuestion() {
    }

}
