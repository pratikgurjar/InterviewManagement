package com.jobtwine.interviewmanagement.controller;

import com.jobtwine.interviewmanagement.entity.InterviewRound;
import com.jobtwine.interviewmanagement.service.InterviewRoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rounds")
public class InterviewRoundController {
    private final InterviewRoundService interviewRoundService;

    @Autowired
    public InterviewRoundController(InterviewRoundService interviewRoundService) {
        this.interviewRoundService = interviewRoundService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<InterviewRound> getInterviewRound(@PathVariable Long id) {
        InterviewRound interviewRound = interviewRoundService.getInterviewRound(id);
        if (interviewRound != null) {
            return ResponseEntity.ok(interviewRound);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<InterviewRound>> getAllInterviewRounds() {
        return ResponseEntity.ok(interviewRoundService.getAllInterviewRounds());
    }

    @PostMapping
    public ResponseEntity<InterviewRound> createInterviewRound(@RequestBody InterviewRound interviewRound) {
        return ResponseEntity.ok(interviewRoundService.createInterviewRound(interviewRound));
    }

    @PutMapping("/{id}")
    public ResponseEntity<InterviewRound> updateInterviewRound(@PathVariable Long id, @RequestBody InterviewRound interviewRound) {
        return ResponseEntity.ok(interviewRoundService.updateInterviewRound(id, interviewRound));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInterviewRound(@PathVariable Long id) {
        interviewRoundService.deleteInterviewRound(id);
        return ResponseEntity.noContent().build();
    }
}
