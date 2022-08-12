package com.example.raz_demo2.data.model

import com.google.gson.annotations.SerializedName

data class AdviceModel (
    @SerializedName("slip" ) var slip : Slip? = Slip()
    )

