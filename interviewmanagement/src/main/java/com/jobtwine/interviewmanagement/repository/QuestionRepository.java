package com.jobtwine.interviewmanagement.repository;

import com.jobtwine.interviewmanagement.entity.InterviewQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<InterviewQuestion, Long> {
}

