package com.example.moshiparsingdemo.ui.network.employee

import com.example.moshiparsingdemo.ui.network.BaseReppository
import com.example.moshiparsingdemo.ui.network.api.MoshiApi
import com.example.moshiparsingdemo.ui.parsers.response.Employee

class EmployeeRepository(private val moshiApi: MoshiApi) : BaseReppository() {

    suspend fun getEmployees() : MutableList<Employee>? {

        val employeeResponse = safeApiCall(
            call = {moshiApi.getEmployees().await()},
            errorMessage = "Error fetching employees"
        )

        return employeeResponse?.results?.toMutableList()
    }
}