package com.example.raz_demo2.data.network

import com.example.raz_demo2.data.model.AdviceModel
import retrofit2.Response
import retrofit2.http.GET

interface AdviceApiClient {
    @GET("/advice")
    suspend fun getAdvice() : Response<AdviceModel>
}