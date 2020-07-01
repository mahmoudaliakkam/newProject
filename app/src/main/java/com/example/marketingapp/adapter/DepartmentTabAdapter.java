package com.example.marketingapp.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marketingapp.view.Fragments.home.HomeFragment;
import com.example.marketingapp.view.Fragments.product.ProductFragment;
import com.example.marketingapp.R;
import com.example.marketingapp.viewHolder.ViewHolderDepartmentTab;
import com.example.marketingapp.model.DepartmentTab;

import java.util.List;

import static android.content.ContentValues.TAG;

public class DepartmentTabAdapter extends RecyclerView.Adapter<ViewHolderDepartmentTab> {
    private Context context;
    private List<DepartmentTab> departmentTabs;
    private Fragment fragment;


    public DepartmentTabAdapter(Context context, List<DepartmentTab> departmentTabs, Fragment fragment) {
        this.context = context;
        this.departmentTabs = departmentTabs;
        this.fragment = fragment;
    }


    @NonNull
    @Override
    public ViewHolderDepartmentTab onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.department_tab_item, parent, false);
        return new ViewHolderDepartmentTab(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull final ViewHolderDepartmentTab viewHolderDepartmentTab, final int position) {

        final DepartmentTab departmentTab = departmentTabs.get(position);


        viewHolderDepartmentTab.getTxtNameDepartmentTab().setText(departmentTab.getName());


        final boolean click = departmentTab.getClick();


        viewHolderDepartmentTab.getView().setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {


                for (int i = 0; i < departmentTabs.size(); i++) {
                    departmentTabs.get(i).setClick(false);
                }

                departmentTab.setClick(!departmentTab.getClick());


                ((HomeFragment) fragment).changeFragment(new ProductFragment());

                notifyDataSetChanged();
            }
        });

        Log.i(TAG, "onClick: " + departmentTabs.size());

        viewHolderDepartmentTab.getTxtNameDepartmentTab().setBackgroundResource(click ? R.color.colorPrimary : R.color.colorAccent);

    }

    @Override
    public int getItemCount() {
        return departmentTabs.size();
    }


    public void setData(List<DepartmentTab> departmentTabs) {
        this.departmentTabs = departmentTabs;
        notifyDataSetChanged();
    }


}
