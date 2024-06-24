package com.jobtwine.interviewmanagement.service;

import com.jobtwine.interviewmanagement.entity.Job;
import com.jobtwine.interviewmanagement.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    public Job getJob(Long jobId) {
        return jobRepository.findById(jobId).orElse(null);
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Job updateJob(Long jobId, Job jobDetails) {
        Job job = jobRepository.findById(jobId).orElse(null);
        if (job != null) {
            job.setJobTitle(jobDetails.getJobTitle());
            job.setDescription(jobDetails.getDescription());
            job.setLocation(jobDetails.getLocation());
            return jobRepository.save(job);
        }
        return null;
    }

    public void deleteJob(Long jobId) {
        jobRepository.deleteById(jobId);
    }
}