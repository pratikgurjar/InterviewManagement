package com.jobtwine.interviewmanagement.controller;

import com.jobtwine.interviewmanagement.entity.InterviewQuestion;
import com.jobtwine.interviewmanagement.service.InterviewQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interviewQuestions")
public class InterviewQuestionController {

    private final InterviewQuestionService interviewQuestionService;

    @Autowired
    public InterviewQuestionController(InterviewQuestionService interviewQuestionService) {
        this.interviewQuestionService = interviewQuestionService;
    }

    @GetMapping
    public ResponseEntity<List<InterviewQuestion>> getAllInterviewQuestions() {
        return ResponseEntity.ok(interviewQuestionService.getAllInterviewQuestions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<InterviewQuestion> getInterviewQuestion(@PathVariable Long id) {
        InterviewQuestion interviewQuestion = interviewQuestionService.getInterviewQuestion(id);
        if (interviewQuestion != null) {
            return ResponseEntity.ok(interviewQuestion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<InterviewQuestion> createInterviewQuestion(@RequestBody InterviewQuestion interviewQuestion) {
        return ResponseEntity.ok(interviewQuestionService.createInterviewQuestion(interviewQuestion));
    }

    @PutMapping("/{id}")
    public ResponseEntity<InterviewQuestion> updateInterviewQuestion(@PathVariable Long id, @RequestBody InterviewQuestion interviewQuestion) {
        return ResponseEntity.ok(interviewQuestionService.updateInterviewQuestion(id, interviewQuestion));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInterviewQuestion(@PathVariable Long id) {
        interviewQuestionService.deleteInterviewQuestion(id);
        return ResponseEntity.noContent().build();
    }
}
