package com.reward.core.domain

import org.springframework.data.jpa.repository.JpaRepository

internal interface RewardRepository: JpaRepository<Reward, Long> {
}