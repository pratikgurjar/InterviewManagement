package com.jobtwine.interviewmanagement.repository;

import com.jobtwine.interviewmanagement.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {}
