package com.example.moshiparsingdemo.ui.network.api

import com.example.moshiparsingdemo.ui.parsers.response.EmployeesResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface MoshiApi {

    @GET("5e40362d3300004200b04d87")
    fun getEmployees(): Deferred<Response<EmployeesResponse>>

}