package com.rime.portfolioproject.presentation.service

import com.rime.portfolioproject.presentation.dto.IntroductionDTO
import com.rime.portfolioproject.presentation.dto.LinkDTO
import com.rime.portfolioproject.presentation.dto.ProjectDTO
import com.rime.portfolioproject.presentation.dto.ResumeDTO
import com.rime.portfolioproject.presentation.repository.PresentationRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PresentationService(
    private val presentationRepository: PresentationRepository
) {

    @Transactional(readOnly = true)
    fun getIntroductions(): List<IntroductionDTO> {
        val introductions = presentationRepository.getActiveIntroductions()

        return introductions.map { IntroductionDTO(it) }
    }

    @Transactional(readOnly = true)
    fun getLinks(): List<LinkDTO> {
        val links = presentationRepository.getActiveLinks()

        return links.map { LinkDTO(it) }
    }

    @Transactional(readOnly = true)
    fun getReume(): ResumeDTO {
        val experiences = presentationRepository.getActiveExperiences()
        val achivements = presentationRepository.getActiveAchievements()
        val skills = presentationRepository.getActiveSkills()

        return ResumeDTO(
            experiences = experiences,
            achievements = achivements,
            skills = skills
        )
    }

    @Transactional(readOnly = true)
    fun getProjects(): List<ProjectDTO> {
        val projects = presentationRepository.getActiveProjects()

        return projects.map { ProjectDTO(it) }
    }
}