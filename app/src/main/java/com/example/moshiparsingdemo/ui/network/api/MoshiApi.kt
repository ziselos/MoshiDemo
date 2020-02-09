package com.example.moshiparsingdemo.ui.network.api

import com.example.moshiparsingdemo.ui.parsers.response.EmployeesResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface MoshiApi {

    @GET("5e4068883300005600b04dda")
    fun getEmployees(): Deferred<Response<EmployeesResponse>>

}