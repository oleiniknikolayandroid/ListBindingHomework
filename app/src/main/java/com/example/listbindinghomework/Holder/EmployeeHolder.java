package com.example.listbindinghomework.Holder;


import androidx.recyclerview.widget.RecyclerView;

import com.example.listbindinghomework.databinding.EmployeeItemBinding;
import com.example.listbindinghomework.model.Employee;

public class EmployeeHolder extends RecyclerView.ViewHolder {

    EmployeeItemBinding binding;

    public EmployeeHolder(EmployeeItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Employee employee) {
        binding.setEmployee(employee);
        binding.executePendingBindings();
    }

}