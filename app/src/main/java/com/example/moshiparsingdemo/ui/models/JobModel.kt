package com.example.moshiparsingdemo.ui.models

import com.example.moshiparsingdemo.ui.parsers.response.Job

data class JobModel(
    val title: String? = null,
    val salary : Double? = null,
    val address: String? = null
)

fun Job.toModel(): JobModel {
    return JobModel(
        title = this.title,
        salary = this.salary,
        address = this.address
    )
}