package com.example.marketingapp.view.Fragments.department;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.marketingapp.R;
import com.example.marketingapp.adapter.DepartmentAdapter;
import com.example.marketingapp.adapter.SliderPagerAdapter;
import com.example.marketingapp.model.Department;
import com.example.marketingapp.model.Slide;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class DepartmentFragment extends Fragment {

    private RecyclerView recDepartment;
    private RecyclerView.LayoutManager layoutManager;
    private DepartmentAdapter departmentAdapter;
    private List<Department> departments;


    private List<Slide> lstSlides;

    public ViewPager sliderpager;


    public TextView allDep;


    public TabLayout indicator;


    Timer timer = new Timer();
    Handler updateSlide = new Handler();
    private static int delay = 5000; //delay before moving to the next slide.
    private static int wait = 5000;


    public DepartmentFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_department, container, false);





        recDepartment = (RecyclerView) view.findViewById(R.id.recDepartment);
        recDepartment.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(getContext(), 3);
        recDepartment.setLayoutManager(layoutManager);
        departments = new ArrayList<>();
        departmentAdapter = new DepartmentAdapter(getContext(), departments, new DepartmentFragment());

        departments.add(new Department("Department"));
        departments.add(new Department("Department"));
        departments.add(new Department("Department"));
        departments.add(new Department("Department"));
        departments.add(new Department("Department"));
        departments.add(new Department("Department"));
        departments.add(new Department("Department"));
        departments.add(new Department("Department"));
        departments.add(new Department("Department"));
        departments.add(new Department("Department"));
        departments.add(new Department("Department"));
        departments.add(new Department("Department"));
        departments.add(new Department("Department"));
        departments.add(new Department("Department"));
        departments.add(new Department("Department"));
        departments.add(new Department("Department"));
        departments.add(new Department("Department"));
        departments.add(new Department("Department"));


        recDepartment.setAdapter(departmentAdapter);



        allDep = view.findViewById(R.id.allDep);


        sliderpager = view.findViewById(R.id.slider_pager_department);


        indicator = view.findViewById(R.id.indicatorDepartment);


        lstSlides = new ArrayList<>();
        lstSlides.add(new Slide(R.drawable.androids));
        lstSlides.add(new Slide(R.drawable.images));

        SliderPagerAdapter adapter = new SliderPagerAdapter(getContext(), lstSlides);

        sliderpager.setAdapter(adapter);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //gets the list, and puts the last into the front
                updateSlide.postAtFrontOfQueue(new Runnable() {

                    @Override
                    public void run() {

                        if (sliderpager.getCurrentItem() < lstSlides.size() - 1) {

                            sliderpager.setCurrentItem(sliderpager.getCurrentItem() + 1);

                        } else {

                            sliderpager.setCurrentItem(0);

                        }

                    }

                });
            }
        }, delay, wait);

        indicator.setupWithViewPager(sliderpager, true);


        return view;
    }
}
