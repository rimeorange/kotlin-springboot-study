package com.rime.portfolioproject.presentation.repository

import com.rime.portfolioproject.domain.entity.Achivement
import com.rime.portfolioproject.domain.entity.Experience
import com.rime.portfolioproject.domain.entity.Introduction
import com.rime.portfolioproject.domain.entity.Link
import com.rime.portfolioproject.domain.entity.Project
import com.rime.portfolioproject.domain.entity.Skill
import com.rime.portfolioproject.domain.repository.AchievementRepository
import com.rime.portfolioproject.domain.repository.ExperienceRepository
import com.rime.portfolioproject.domain.repository.IntroductionRepository
import com.rime.portfolioproject.domain.repository.LinkRepository
import com.rime.portfolioproject.domain.repository.ProjectRespository
import com.rime.portfolioproject.domain.repository.SkillRepository
import org.springframework.stereotype.Repository

@Repository
class PresentationRepository(
    private val achievementRepository: AchievementRepository,
    private val experienceRepository: ExperienceRepository,
    private val introductionRepository: IntroductionRepository,
    private val linkRepository: LinkRepository,
    private val projectRespository: ProjectRespository,
    private val skillRepository: SkillRepository
) {

    fun getActiveAchievements(): List<Achivement> {
        return achievementRepository.findAllByIsActive(true)
    }

    fun getActiveExperiences(): List<Experience> {
        return experienceRepository.findAllByIsActive(true)
    }

    fun getActiveIntroductions(): List<Introduction> {
        return introductionRepository.findAllByIsActive(true)
    }

    fun getActiveLinks(): List<Link> {
        return linkRepository.findAllByIsActive(true)
    }

    fun getActiveProjects(): List<Project> {
        return projectRespository.findAllByIsActive(true)
    }

    fun getActiveSkills(): List<Skill> {
        return skillRepository.findAllByIsActive(true)
    }
}