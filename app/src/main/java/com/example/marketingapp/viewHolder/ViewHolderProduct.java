package com.example.marketingapp.viewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marketingapp.R;

public class ViewHolderProduct extends RecyclerView.ViewHolder {


    private View view;

    private TextView txtProductItemNameProduct;

    private ImageView imgProductItemImageProduct;

    private ImageView imgProductItemGoToDetailesProduct;


    public ViewHolderProduct(@NonNull View itemView) {
        super(itemView);

        this.view = itemView;

        txtProductItemNameProduct = (TextView) view.findViewById(R.id.txtProductItemNameProduct);

        imgProductItemImageProduct = (ImageView) view.findViewById(R.id.imgProductItemImageProduct);

        imgProductItemGoToDetailesProduct = (ImageView) view.findViewById(R.id.imgProductItemGoToDetailesProduct);

    }


    public View getView() {
        return view;
    }


    public TextView getTxtProductItemNameProduct() {
        return txtProductItemNameProduct;
    }

    public ImageView getImgProductItemImageProduct() {
        return imgProductItemImageProduct;
    }

    public ImageView getImgProductItemGoToDetailesProduct() {
        return imgProductItemGoToDetailesProduct;
    }


}
