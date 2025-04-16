package com.xworkz.implement;

import com.xworkz.internal.Food;

public class Pizza implements Food {

    @Override
    public void prepare(){
        System.out.println("Running prepare in pizza");
    }
    @Override
    public void serve(){
        System.out.println("Running serve in pizza");
    }
    @Override
    public void consume(){
        System.out.println("Running consume in pizza");
    }
}
