package com.rime.portfolioproject.presentation.dto

import com.rime.portfolioproject.domain.entity.Project
import com.rime.portfolioproject.domain.entity.ProjectDetail

data class ProjectDTO(
    val name: String,
    val descriptions: String,
    val startYearMonth: String,
    val endYearMonth: String?,
    val details: List<ProjectDetailDTO>,
    val skills: List<SkillDTO>?
) {
    constructor(project: Project) : this(
        name = project.name,
        descriptions = project.description,
        startYearMonth = "${project.startYear}.${project.startMonth}",
        endYearMonth = project.getEndYearMonth(),
        details = project.details.filter{it.isActive}.map {
            ProjectDetailDTO(it)},
        skills = project.skills.map {it.skill}.filter { it.isActive }.map { SkillDTO(it) }
    )
}
