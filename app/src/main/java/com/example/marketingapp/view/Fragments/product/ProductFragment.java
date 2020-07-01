package com.example.marketingapp.view.Fragments.product;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.marketingapp.R;
import com.example.marketingapp.adapter.ProductSameDepartmentAdapter;
import com.example.marketingapp.adapter.SliderPagerAdapter;
import com.example.marketingapp.model.Product;
import com.example.marketingapp.model.Slide;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class ProductFragment extends Fragment {

    private RecyclerView recProductSameDepartment;
    private RecyclerView.LayoutManager layoutManager;
    private ProductSameDepartmentAdapter productSameDepartmentAdapter;
    private List<Product> products;


    private FragmentActivity myContext;


    private List<Slide> lstSlides;

    public ViewPager slider_pager_product_same_department;


    public TextView allProdSameDep;


    public TabLayout indicator_product_same_department;


    Timer timer = new Timer();
    Handler updateSlide = new Handler();
    private static int delay = 5000; //delay before moving to the next slide.
    private static int wait = 5000;



    public ProductFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_product, container, false);

        recProductSameDepartment = (RecyclerView) view.findViewById(R.id.recProductSameDepartment);
        recProductSameDepartment.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(getContext(), 3);
        recProductSameDepartment.setLayoutManager(layoutManager);
        products = new ArrayList<>();
        productSameDepartmentAdapter = new ProductSameDepartmentAdapter(getContext(), products, ProductFragment.this);

        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));


        recProductSameDepartment.setAdapter(productSameDepartmentAdapter);



        allProdSameDep = view.findViewById(R.id.allProdSameDep);


        slider_pager_product_same_department = view.findViewById(R.id.slider_pager_product_same_department);


        indicator_product_same_department = view.findViewById(R.id.indicator_product_same_department);


        lstSlides = new ArrayList<>();
        lstSlides.add(new Slide(R.drawable.androids));
        lstSlides.add(new Slide(R.drawable.images));

        SliderPagerAdapter adapter = new SliderPagerAdapter(getContext(), lstSlides);

        slider_pager_product_same_department.setAdapter(adapter);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //gets the list, and puts the last into the front
                updateSlide.postAtFrontOfQueue(new Runnable() {

                    @Override
                    public void run() {

                        if (slider_pager_product_same_department.getCurrentItem() < lstSlides.size() - 1) {

                            slider_pager_product_same_department.setCurrentItem(slider_pager_product_same_department.getCurrentItem() + 1);

                        } else {

                            slider_pager_product_same_department.setCurrentItem(0);

                        }

                    }

                });
            }
        }, delay, wait);

        indicator_product_same_department.setupWithViewPager(slider_pager_product_same_department, true);









        return view;
    }
    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }

    public void changeFragment(Fragment fragment)
    {
        FragmentManager fragManager = myContext.getSupportFragmentManager();

        fragManager.beginTransaction().replace(R.id.frmDepartmentProduct, fragment).commit();
    }

}
