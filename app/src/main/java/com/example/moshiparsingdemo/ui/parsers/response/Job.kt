package com.example.moshiparsingdemo.ui.parsers.response

import com.squareup.moshi.Json

data class Job(@Json(name = "title")val title: String? = null,
               @Json(name = "salary")val salary : Double? = null,
               @Json(name = "address")val address: String? = null)