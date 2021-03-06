package com.example.moshiparsingdemo.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moshiparsingdemo.R
import com.example.moshiparsingdemo.ui.extensions.loadImage
import com.example.moshiparsingdemo.ui.models.EmployeeModel
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.row_employee.*

class EmployeesRecyclerViewAdapter() :
    RecyclerView.Adapter<EmployeesRecyclerViewAdapter.EmployeeViewHolder>() {

    private var employeeModelList: MutableList<EmployeeModel> = arrayListOf()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_employee, parent, false)
        return EmployeeViewHolder(
            view
        )
    }

    override fun getItemCount(): Int {
        return employeeModelList.size
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {

        holder.bind(employeeModel = employeeModelList[position])
    }

    fun setEmployeeList(employeeModelList: MutableList<EmployeeModel>) {
        this.employeeModelList = employeeModelList
        notifyDataSetChanged()
    }

    class EmployeeViewHolder(
        override val containerView: View
    ) :

        RecyclerView.ViewHolder(containerView),
        LayoutContainer {

        fun bind(employeeModel: EmployeeModel) {
            firstNameTextView.text = String.format(containerView.resources.getString(R.string.firstName), employeeModel.firstName)
            lastNameTextView.text = String.format(containerView.resources.getString(R.string.lastName), employeeModel.lastName)
            ageTextView.text = String.format(containerView.resources.getString(R.string.age), employeeModel.age)

            employeeImageView?.loadImage(employeeModel.imageUrl, R.mipmap.ic_launcher)

        }
    }

}