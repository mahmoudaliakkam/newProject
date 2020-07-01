package com.example.marketingapp.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marketingapp.R;
import com.example.marketingapp.viewHolder.ViewHolderDepartment;
import com.example.marketingapp.model.Department;

import java.util.List;

public class DepartmentAdapter extends RecyclerView.Adapter<ViewHolderDepartment> {
    private Context context;
    private List<Department> departments;
    private Fragment fragment;


    public DepartmentAdapter(Context context, List<Department> departments, Fragment fragment) {
        this.context = context;
        this.departments = departments;
        this.fragment = fragment;
    }


    @NonNull
    @Override
    public ViewHolderDepartment onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.department_item, parent, false);
        return new ViewHolderDepartment(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull final ViewHolderDepartment viewHolderDepartment, final int position) {

        final Department department = departments.get(position);


        viewHolderDepartment.getTxtDepartment().setText(department.getNameDepartment());

        viewHolderDepartment.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return departments.size();
    }


    public void setData(List<Department> departments) {
        this.departments = departments;
        notifyDataSetChanged();
    }


}
