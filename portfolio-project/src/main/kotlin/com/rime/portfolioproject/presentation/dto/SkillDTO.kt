package com.rime.portfolioproject.presentation.dto

import com.rime.portfolioproject.domain.entity.Skill

data class SkillDTO(
    val name: String,
    val type: String
) {
    constructor(skill: Skill) : this(
        name = skill.name,
        type = skill.type.name
    )
}
