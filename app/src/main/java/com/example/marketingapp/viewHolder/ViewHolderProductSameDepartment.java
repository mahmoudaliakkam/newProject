package com.example.marketingapp.viewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marketingapp.R;

public class ViewHolderProductSameDepartment extends RecyclerView.ViewHolder {


    private View view;

    private TextView txtProductSameDepartment;


    public ViewHolderProductSameDepartment(@NonNull View itemView) {
        super(itemView);

        this.view = itemView;

        txtProductSameDepartment = (TextView) view.findViewById(R.id.txtProductSameDepartment);


    }


    public View getView() {
        return view;
    }


    public TextView getTxtProductSameDepartment() {
        return txtProductSameDepartment;
    }


}
