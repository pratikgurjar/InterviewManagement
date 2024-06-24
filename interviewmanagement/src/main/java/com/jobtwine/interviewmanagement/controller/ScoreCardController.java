package com.jobtwine.interviewmanagement.controller;

import com.jobtwine.interviewmanagement.entity.Skill;
import com.jobtwine.interviewmanagement.entity.ScoreCard;
import com.jobtwine.interviewmanagement.service.ScoreCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scorecards")
public class ScoreCardController {

    private final ScoreCardService scoreCardService;

    @Autowired
    public ScoreCardController(ScoreCardService scoreCardService) {
        this.scoreCardService = scoreCardService;
    }

    @PostMapping
    public ResponseEntity<ScoreCard> createScoreCard(@RequestBody ScoreCard scoreCard) {
        return ResponseEntity.ok(scoreCardService.createScoreCard(scoreCard));
    }


    @GetMapping
    public ResponseEntity<List<ScoreCard>> getAllScoreCards() {
        return ResponseEntity.ok(scoreCardService.getAllScoreCards());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ScoreCard> getScoreCard(@PathVariable Long id) {
        ScoreCard scoreCard = scoreCardService.getScoreCard(id);
        if (scoreCard != null) {
            return ResponseEntity.ok(scoreCard);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ScoreCard> updateScoreCard(@PathVariable Long id, @RequestBody ScoreCard scoreCard) {
        return ResponseEntity.ok(scoreCardService.updateScoreCard(id, scoreCard));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteScoreCard(@PathVariable Long id) {
        scoreCardService.deleteScoreCard(id);
        return ResponseEntity.noContent().build();
    }
}
