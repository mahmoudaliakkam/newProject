package com.example.marketingapp.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marketingapp.R;
import com.example.marketingapp.model.Department;
import com.example.marketingapp.model.Product;
import com.example.marketingapp.view.Activites.DetailsProductActivity;
import com.example.marketingapp.viewHolder.ViewHolderDepartment;
import com.example.marketingapp.viewHolder.ViewHolderProduct;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ViewHolderProduct> {
    private Context context;
    private List<Product> products;


    public ProductAdapter(Context context, List<Product> products) {
        this.context = context;
        this.products = products;
    }


    @NonNull
    @Override
    public ViewHolderProduct onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_item, parent, false);
        return new ViewHolderProduct(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull final ViewHolderProduct viewHolderProduct, final int position) {

        final Product product = products.get(position);


        viewHolderProduct.getTxtProductItemNameProduct().setText(product.getNameProduct());

        viewHolderProduct.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailsProductActivity.class);
                context.startActivity(intent);
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
