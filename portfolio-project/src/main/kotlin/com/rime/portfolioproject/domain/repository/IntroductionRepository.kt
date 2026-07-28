package com.rime.portfolioproject.domain.repository

import com.rime.portfolioproject.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long> {

    // select * from introduction where is_active = :isActive
    fun findAllbyIsActive(isActive: Boolean): List<Introduction>
}