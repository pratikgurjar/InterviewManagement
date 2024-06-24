package com.jobtwine.interviewmanagement.service;

import com.jobtwine.interviewmanagement.entity.ScoreCard;
import com.jobtwine.interviewmanagement.repository.ScoreCardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreCardService {

    private final ScoreCardRepository scoreCardRepository;

    public ScoreCardService(ScoreCardRepository scoreCardRepository) {
        this.scoreCardRepository = scoreCardRepository;
    }

    public List<ScoreCard> getAllScoreCards() {
        return scoreCardRepository.findAll();
    }

    public ScoreCard createScoreCard(ScoreCard scoreCard) {
        return scoreCardRepository.save(scoreCard);
    }

    public ScoreCard updateScoreCard(Long id, ScoreCard scoreCard) {
        scoreCard.setScoreCardId(id);
        return scoreCardRepository.save(scoreCard);
    }

    public void deleteScoreCard(Long id) {
        scoreCardRepository.deleteById(id);
    }

    public ScoreCard getScoreCard(Long id) {
        return scoreCardRepository.findById(id).orElse(null);
    }
}
