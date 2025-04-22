package com.xworkz.practice.external;

import com.xworkz.practice.internal.FoodSafetyAuthority;

public class Restaurant {
    private FoodSafetyAuthority foodSafetyAuthority;

    public Restaurant(FoodSafetyAuthority foodSafetyAuthority){
        this.foodSafetyAuthority=foodSafetyAuthority;
        System.out.println("Parametrized const restaurant");
    }
    public void approveMenu(){
        if(this.foodSafetyAuthority!=null){
            System.out.println("Food safety authority is not null");
            this.foodSafetyAuthority.inspectHygiene();
        }
        else{
            System.out.println("It is null");
        }
    }
}
