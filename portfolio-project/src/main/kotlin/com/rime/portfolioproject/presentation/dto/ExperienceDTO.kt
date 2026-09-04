package com.rime.portfolioproject.presentation.dto

import java.time.YearMonth

data class ExperienceDTO(
    val title: String,
    val description: String,
    val startYearMonth: String?,
    val endYearMonth: String?,
    val details: List<String>
)
