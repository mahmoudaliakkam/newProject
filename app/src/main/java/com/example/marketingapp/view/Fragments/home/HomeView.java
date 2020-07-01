package com.example.marketingapp.view.Fragments.home;

import com.example.marketingapp.model.Department;

import java.util.List;

public interface HomeView {
    void onShowLoading();
    void onHideLoading();
    void onGetResult(List<Department> universities);
    void onGetError(String message);
}
