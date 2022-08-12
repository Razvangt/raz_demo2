package com.example.raz_demo2.data.network

import com.example.raz_demo2.data.model.AdviceModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AdviceService  @Inject constructor(private val api : AdviceApiClient) {

    suspend fun getAdvice() : AdviceModel?{
        return withContext(Dispatchers.IO){
            val response = api.getAdvice()
            print("Response " + response.body())
            response.body()
        }
    }
}