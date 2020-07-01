package com.example.marketingapp.viewHolder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marketingapp.R;

public class ViewHolderDepartmentTab extends RecyclerView.ViewHolder {


    private View view;

    private TextView txtDepartmentTab;

    private LinearLayout crdDepartmentTab;


    public ViewHolderDepartmentTab(@NonNull View itemView) {
        super(itemView);

        this.view = itemView;

        txtDepartmentTab = (TextView) view.findViewById(R.id.txtDepartmentTab);

        crdDepartmentTab = (LinearLayout) view.findViewById(R.id.crdDepartmentTab);

    }


    public View getView() {
        return view;
    }


    public TextView getTxtNameDepartmentTab() {
        return txtDepartmentTab;
    }

    public LinearLayout getCrdDepartmentTab() {
        return crdDepartmentTab;
    }




}
