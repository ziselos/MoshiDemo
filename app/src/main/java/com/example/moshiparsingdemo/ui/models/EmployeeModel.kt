package com.example.moshiparsingdemo.ui.models

import com.example.moshiparsingdemo.ui.parsers.response.Employee
import com.example.moshiparsingdemo.ui.parsers.response.Job

data class EmployeeModel(
    val firstName : String? = null,
    val lastName : String? = null,
    val age: Int ? = null,
    val imageUrl : String? = null,
    val job: JobModel? = null
)


fun Employee.toModel(): EmployeeModel {
    return EmployeeModel(
        firstName = this.firstName,
        lastName = this.lastName,
        age = this.age,
        job = this.job?.toModel()
    )
}