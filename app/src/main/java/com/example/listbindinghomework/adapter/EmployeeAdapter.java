package com.example.listbindinghomework.adapter;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listbindinghomework.Holder.EmployeeHolder;
import com.example.listbindinghomework.R;
import com.example.listbindinghomework.databinding.EmployeeItemBinding;
import com.example.listbindinghomework.model.Employee;

import java.util.LinkedList;
import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeHolder> {

    private List<Employee> items = new LinkedList<>();

    public void setData(List<Employee> data) {
        items.clear();
        items.addAll(data);
    }

    @NonNull
    @Override
    public EmployeeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        EmployeeItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.employee_item, parent, false);
        return new EmployeeHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}