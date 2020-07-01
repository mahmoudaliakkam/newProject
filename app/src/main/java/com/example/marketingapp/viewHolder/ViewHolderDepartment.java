package com.example.marketingapp.viewHolder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marketingapp.R;

public class ViewHolderDepartment extends RecyclerView.ViewHolder {


    private View view;

    private TextView txtDepartment;



    public ViewHolderDepartment(@NonNull View itemView) {
        super(itemView);

        this.view = itemView;

        txtDepartment = (TextView) view.findViewById(R.id.txtDepartment);


    }


    public View getView() {
        return view;
    }


    public TextView getTxtDepartment() {
        return txtDepartment;
    }





}
