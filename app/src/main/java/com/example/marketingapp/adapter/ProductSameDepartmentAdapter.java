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
import com.example.marketingapp.model.Product;
import com.example.marketingapp.view.Fragments.product.ProductFragment;
import com.example.marketingapp.view.Fragments.product_list.ProductListFragment;
import com.example.marketingapp.viewHolder.ViewHolderProductSameDepartment;

import java.util.List;



public class ProductSameDepartmentAdapter extends RecyclerView.Adapter<ViewHolderProductSameDepartment> {
    private Context context;
    private List<Product> products;
    private Fragment fragment;


    public ProductSameDepartmentAdapter(Context context, List<Product> products, Fragment fragment) {
        this.context = context;
        this.products = products;
        this.fragment = fragment;
    }


    @NonNull
    @Override
    public ViewHolderProductSameDepartment onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_same_department_item, parent, false);
        return new ViewHolderProductSameDepartment(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull final ViewHolderProductSameDepartment viewHolderProductSameDepartment, final int position) {

        final Product product = products.get(position);


        viewHolderProductSameDepartment.getTxtProductSameDepartment().setText(product.getNameProduct());

        viewHolderProductSameDepartment.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ProductFragment) fragment).changeFragment(new ProductListFragment());
            }
        });

    }

    @Override
    public int getItemCount() {
        return products.size();
    }


    public void setData(List<Product> products) {
        this.products = products;
        notifyDataSetChanged();
    }


}
