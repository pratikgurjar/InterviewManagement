package com.jobtwine.interviewmanagement.service;

import com.jobtwine.interviewmanagement.entity.InterviewQuestion;
import com.jobtwine.interviewmanagement.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewQuestionService {
    private final QuestionRepository questionRepository;

    public InterviewQuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public InterviewQuestion createInterviewQuestion(InterviewQuestion interviewQuestion) {
        return questionRepository.save(interviewQuestion);
    }

    public InterviewQuestion getInterviewQuestion(Long id) {
        return questionRepository.findById(id).orElse(null);
    }

    public List<InterviewQuestion> getAllInterviewQuestions() {
        return questionRepository.findAll();
    }

    public InterviewQuestion updateInterviewQuestion(Long id, InterviewQuestion interviewQuestion) {
        interviewQuestion.setId(id);
        return questionRepository.save(interviewQuestion);
    }

    public void deleteInterviewQuestion(Long id) {
        questionRepository.deleteById(id);
    }
}

