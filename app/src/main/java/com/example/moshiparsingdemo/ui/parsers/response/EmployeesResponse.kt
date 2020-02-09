package com.example.moshiparsingdemo.ui.parsers.response

import com.example.moshiparsingdemo.ui.models.EmployeeModel
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EmployeesResponse(val results: List<Employee>)

//fun toModel(employeeList: List<Employee>) : List<EmployeeModel> {
//}