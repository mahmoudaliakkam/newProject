package com.example.marketingapp.view.Fragments.product_list;

import com.example.marketingapp.model.Product;

import java.util.List;

public interface ProductView {
    void onShowLoading();
    void onHideLoading();
    void onGetResult(List<Product> universities);
    void onGetError(String message);
}
