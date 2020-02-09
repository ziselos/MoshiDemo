package com.example.moshiparsingdemo.ui.parsers.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Job(val title: String? = null,
               val salary : Double? = null,
               val address: String? = null)