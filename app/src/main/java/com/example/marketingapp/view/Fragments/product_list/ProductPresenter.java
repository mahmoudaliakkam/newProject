package com.example.marketingapp.view.Fragments.product_list;

public class ProductPresenter {
    ProductView view;
    ProductPresenter(ProductView view){this.view=view;}

    public  void getProductByDepartmentID(int id){
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
