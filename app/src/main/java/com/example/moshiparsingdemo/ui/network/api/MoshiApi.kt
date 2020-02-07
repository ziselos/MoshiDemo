package com.example.moshiparsingdemo.ui.network.api

import com.example.moshiparsingdemo.ui.parsers.response.EmployeesResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface MoshiApi {

    @GET("5e3d650c2d00008709d95d27")
    fun getEmployees(): Deferred<Response<EmployeesResponse>>

}