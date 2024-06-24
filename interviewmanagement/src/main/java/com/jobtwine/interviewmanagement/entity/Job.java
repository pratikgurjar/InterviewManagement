package com.jobtwine.interviewmanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Job {

    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jobTitle;
    private String description;
    private String location;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;


    public Job() {
    }

}
