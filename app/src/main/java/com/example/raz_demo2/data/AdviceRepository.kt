package com.example.raz_demo2.data

import com.example.raz_demo2.data.model.AdviceModel
import com.example.raz_demo2.data.network.AdviceService
import javax.inject.Inject

class AdviceRepository @Inject constructor(
    private val api: AdviceService
) {
    suspend fun getAdvice() : AdviceModel?{
        val response = api.getAdvice()
        print("Repository : $response")
        return response
    }
}