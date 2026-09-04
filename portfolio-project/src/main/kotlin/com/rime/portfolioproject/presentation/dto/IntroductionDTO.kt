package com.rime.portfolioproject.presentation.dto

import com.rime.portfolioproject.domain.entity.Introduction

data class IntroductionDTO(
    val content: String
) {
    constructor(introduction: Introduction) : this(
        content = introduction.content
    )
}
