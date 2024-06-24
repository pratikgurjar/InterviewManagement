package com.jobtwine.interviewmanagement.service;

import com.jobtwine.interviewmanagement.entity.Skill;
import com.jobtwine.interviewmanagement.repository.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public Skill createSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    public Skill getSkill(Long skillId) {
        return skillRepository.findById(skillId).orElse(null);
    }

    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    public Skill updateSkill(Long skillId, Skill skillDetails) {
        Skill skill = skillRepository.findById(skillId).orElse(null);
        if (skill != null) {
            skill.setSkillName(skillDetails.getSkillName());
            return skillRepository.save(skill);
        }
        return null;
    }

    public void deleteSkill(Long skillId) {
        skillRepository.deleteById(skillId);
    }

}