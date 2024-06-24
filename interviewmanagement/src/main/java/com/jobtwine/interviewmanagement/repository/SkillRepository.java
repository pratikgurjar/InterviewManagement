package com.jobtwine.interviewmanagement.repository;

import com.jobtwine.interviewmanagement.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {}

