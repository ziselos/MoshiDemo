package com.example.moshiparsingdemo.ui.parsers.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class Employee(@Json(name = "firsName")val firsName : String? = null,
                    @Json(name = "lastName")val lastName : String? = null,
                    @Json(name = "age")val age: Int ? = null,
                    @Json(name = "imageUrl")val imageUrl : String? = null,
                    @Json(name = "job")val job: Job? = null)