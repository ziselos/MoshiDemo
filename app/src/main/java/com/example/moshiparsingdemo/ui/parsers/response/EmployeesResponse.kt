package com.example.moshiparsingdemo.ui.parsers.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EmployeesResponse(val results: List<Employee>)