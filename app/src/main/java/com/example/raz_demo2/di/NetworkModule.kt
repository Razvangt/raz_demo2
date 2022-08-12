package com.example.raz_demo2.di

import com.example.raz_demo2.data.network.AdviceApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Singleton
    @Provides
    fun provideRetrofit() : Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://api.adviceslip.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideAdviceApiClient(retrofit: Retrofit):AdviceApiClient{
        return  retrofit.create(AdviceApiClient::class.java)
    }
}