package com.example.moshiparsingdemo.ui.models

import com.example.moshiparsingdemo.ui.parsers.response.Employee

data class EmployeeModel(
    val firsName : String? = null,
    val lastName : String? = null,
    val age: Int ? = null,
    val imageUrl : String? = null,
    val job: JobModel? = null
)


fun Employee.toModel(): EmployeeModel {
    return EmployeeModel(
        firsName = this.firsName,
        lastName = this.lastName,
        age = this.age,
        job = this.job?.toModel()
    )
}