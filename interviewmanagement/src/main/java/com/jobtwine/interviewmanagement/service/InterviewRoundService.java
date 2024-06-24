package com.jobtwine.interviewmanagement.service;

import com.jobtwine.interviewmanagement.entity.InterviewRound;
import com.jobtwine.interviewmanagement.repository.InterviewRoundRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewRoundService {

    private final InterviewRoundRepository interviewRoundRepository;

    public InterviewRoundService(InterviewRoundRepository interviewRoundRepository) {
        this.interviewRoundRepository = interviewRoundRepository;
    }

    public List<InterviewRound> getAllInterviewRounds() {
        return interviewRoundRepository.findAll();
    }

    public InterviewRound createInterviewRound(InterviewRound interviewRound) {
        return interviewRoundRepository.save(interviewRound);
    }

    public InterviewRound updateInterviewRound(Long id, InterviewRound interviewRound) {
        interviewRound.setId(id);
        return interviewRoundRepository.save(interviewRound);
    }

    public void deleteInterviewRound(Long id) {
        interviewRoundRepository.deleteById(id);
    }

    public InterviewRound getInterviewRound(Long interviewRoundId) {
        return interviewRoundRepository.findById(interviewRoundId).orElse(null);
    }
}
