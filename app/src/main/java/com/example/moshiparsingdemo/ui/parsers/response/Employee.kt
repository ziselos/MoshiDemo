package com.example.moshiparsingdemo.ui.parsers.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Employee(val firsName : String? = null,
                    val lastName : String? = null,
                    val age: Int ? = null,
                    val imageUrl : String? = null,
                    val job: Job? = null)