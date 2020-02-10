package com.example.moshiparsingdemo.ui.parsers.response

import com.example.moshiparsingdemo.ui.adapters.NullToEmptyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Job(@NullToEmptyString val title: String = "",
               val salary : Double? = null,
               @NullToEmptyString val address: String = "")