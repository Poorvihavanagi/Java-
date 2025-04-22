package com.xworkz.practice.runner;

import com.xworkz.practice.external.Restaurant;
import com.xworkz.practice.internal.FoodSafetyAuthority;
import com.xworkz.practice.internal.FssaiImpl;

public class FoodSafetyAuthorityRunner {
    public static void main(String[] args) {
        FoodSafetyAuthority foodSafetyAuthority=new FssaiImpl();
        Restaurant restaurant=new Restaurant(foodSafetyAuthority);
        restaurant.approveMenu();
    }
}
