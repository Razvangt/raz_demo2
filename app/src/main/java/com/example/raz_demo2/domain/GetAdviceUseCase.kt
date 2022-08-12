package com.example.raz_demo2.domain

import com.example.raz_demo2.data.AdviceRepository
import javax.inject.Inject

class GetAdviceUseCase @Inject constructor(
    private val repository: AdviceRepository
) {
    suspend operator fun invoke() = repository.getAdvice()
}