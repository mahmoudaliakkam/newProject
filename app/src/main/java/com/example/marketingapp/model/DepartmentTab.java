package com.example.marketingapp.model;

import com.example.marketingapp.R;

public class DepartmentTab {
    String name;
    Boolean click;
    int color;

    public DepartmentTab(String name) {
        this.name = name;
        click = false;
        color = R.color.colorAccent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getClick() {
        return click;
    }

    public void setClick(Boolean click) {
        this.click = click;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
