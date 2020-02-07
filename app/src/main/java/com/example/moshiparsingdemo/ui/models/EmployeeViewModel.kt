package com.example.moshiparsingdemo.ui.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moshiparsingdemo.ui.network.api.MoshiDemoFactory
import com.example.moshiparsingdemo.ui.network.employee.EmployeeRepository
import com.example.moshiparsingdemo.ui.parsers.response.Employee
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class EmployeeViewModel : ViewModel() {

    private val parentJob = Job()

    private val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.Default

    private val scope = CoroutineScope(coroutineContext)

    private val repository : EmployeeRepository = EmployeeRepository(MoshiDemoFactory.moshiApi)

    val employessLiveData = MutableLiveData<MutableList<Employee>>()

    fun getEmployees() {
        scope.launch {
            val employeesList = repository.getEmployees()
            employessLiveData.postValue(employeesList)
        }
    }

    fun cancelAllRequests() = coroutineContext.cancel()
}