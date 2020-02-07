package com.example.moshiparsingdemo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.moshiparsingdemo.R
import com.example.moshiparsingdemo.ui.models.EmployeeViewModel
import timber.log.Timber

class EmployeesActivity : AppCompatActivity() {

    private lateinit var employeeViewModel : EmployeeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initLayout()
    }

    private fun initLayout() {
        fetchEmployees()
    }

    fun fetchEmployees() {
        employeeViewModel = ViewModelProviders.of(this).get(EmployeeViewModel::class.java)

        employeeViewModel.getEmployees()

        employeeViewModel.employessLiveData.observe(this, Observer {employeeList ->

            Timber.d(employeeList.toString())

        })

    }
}