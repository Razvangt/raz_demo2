package com.example.raz_demo2.data.model

import com.google.gson.annotations.SerializedName

data class Slip (
    @SerializedName("id"     ) var id     : Int?    = null,
    @SerializedName("advice" ) var advice : String? = null
)