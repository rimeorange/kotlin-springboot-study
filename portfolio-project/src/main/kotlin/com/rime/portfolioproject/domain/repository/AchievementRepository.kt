package com.rime.portfolioproject.domain.repository

import com.rime.portfolioproject.domain.entity.Achivement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository : JpaRepository<Achivement, Long> {

    // select * from achievement where is_active = :isActive
    fun findAllByIsActive(isActive: Boolean): List<Achivement>
}