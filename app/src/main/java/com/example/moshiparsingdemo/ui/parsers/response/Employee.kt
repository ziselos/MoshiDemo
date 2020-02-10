package com.example.moshiparsingdemo.ui.parsers.response

import com.example.moshiparsingdemo.ui.adapters.NullToEmptyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Employee(@NullToEmptyString val firstName : String = "",
                    @NullToEmptyString val lastName : String = "",
                    val age: Int = -1,
                    val imageUrl : String? = null,
                    val job: Job? = null)