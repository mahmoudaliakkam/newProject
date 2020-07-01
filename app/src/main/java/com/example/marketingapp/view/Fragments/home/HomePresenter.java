package com.example.marketingapp.view.Fragments.home;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomePresenter {
    HomeView view;
    HomePresenter(HomeView view){this.view=view;}

    public void getAllDepartment(){
//        view.onShowLoading();
//
//        ApiInterface apiInterface = ApiClient.getApiClient()
//                .create(ApiInterface.class);
//        Call<List<University>> call = apiInterface.getUniversities();
//
//        call.enqueue(new Callback<List<University>>() {
//            @Override
//            public void onResponse(Call<List<University>> call, Response<List<University>> response) {
//                view.onHideLoading();
//
//                if (response.isSuccessful() && response.body() != null) {
//                    view.onGetResult(response.body());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<University>> call, Throwable t) {
//                view.onHideLoading();
//                view.onGetError(t.getLocalizedMessage());
//            }
//        });
    }
}
