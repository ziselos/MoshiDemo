package com.example.moshiparsingdemo.ui.parsers.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class EmployeesResponse(@Json(name = "results") val results: List<Employee>)