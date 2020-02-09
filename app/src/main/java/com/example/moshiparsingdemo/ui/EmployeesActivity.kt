package com.example.moshiparsingdemo.ui

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moshiparsingdemo.R
import com.example.moshiparsingdemo.ui.adapters.EmployeesRecyclerViewAdapter
import com.example.moshiparsingdemo.ui.models.EmployeeModel
import com.example.moshiparsingdemo.ui.models.EmployeeViewModel
import com.example.moshiparsingdemo.ui.models.toModel
import kotlinx.android.synthetic.main.activity_employees.*
import timber.log.Timber

class EmployeesActivity : AppCompatActivity() {

    private lateinit var employeeViewModel : EmployeeViewModel
    private lateinit var employeesRecyclerViewAdapter: EmployeesRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employees)
        initLayout()
    }

    private fun initLayout() {
        employeesRecyclerViewAdapter = EmployeesRecyclerViewAdapter()
        employeesRecyclerView.layoutManager = LinearLayoutManager(this)
        fetchEmployees()
    }

    fun fetchEmployees() {
        employeeViewModel = ViewModelProviders.of(this).get(EmployeeViewModel::class.java)

        employeeViewModel.getEmployees()

        employeeViewModel.employessLiveData.observe(this, Observer {employeeList ->
//            val list = employeeList.map { EmployeeModel(it.firstName,it.lastName,it.age,it.imageUrl,it.job?.toModel()) }.toMutableList()
//            employeesRecyclerViewAdapter.setEmployeeList(list)
//            employeesRecyclerView.adapter = employeesRecyclerViewAdapter
            Timber.d("Moshi Demo -> employess list %s", employeeList[0].firstName)

        })

    }
}