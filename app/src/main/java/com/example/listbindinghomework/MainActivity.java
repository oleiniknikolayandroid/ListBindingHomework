package com.example.listbindinghomework;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listbindinghomework.adapter.EmployeeAdapter;
import com.example.listbindinghomework.model.Employee;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private LinkedList<Employee> employeeList = new LinkedList<>();
    String[] names = {"Ivan", "Kolya", "C", "D", "E", "F", "G", "A", "B","Andrei"};
    String name;
    RecyclerView rv;
    EmployeeAdapter ea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRV();
        initData();
        ea.setData(employeeList);
    }

    private void initData() {
        int i;

        for (i = 0; i < 10; i++) {
            name = names[i];
            employeeList.add(new Employee(name));
        }

    }

    private void initRV() {
        rv = findViewById(R.id.item_list);
        ea = new EmployeeAdapter();
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(ea);
        rv.setItemAnimator(null);
    }
}
