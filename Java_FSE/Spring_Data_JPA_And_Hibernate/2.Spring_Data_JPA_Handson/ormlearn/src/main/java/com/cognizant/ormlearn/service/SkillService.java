package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.entity.Skill;
import com.cognizant.ormlearn.repository.SkillRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Transactional
    public Skill get(int id) {
        return skillRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Skill skill) {
        skillRepository.save(skill);
    }
}