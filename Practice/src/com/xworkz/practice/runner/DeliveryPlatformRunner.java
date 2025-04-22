package com.xworkz.practice.runner;

import com.xworkz.practice.external.FoodDeliveryApp;
import com.xworkz.practice.internal.DeliveryPlatform;
import com.xworkz.practice.internal.SwiggyPlatformImpl;

public class DeliveryPlatformRunner {
    public static void main(String[] args) {
        DeliveryPlatform deliveryPlatform=new SwiggyPlatformImpl();
        FoodDeliveryApp foodDeliveryApp=new FoodDeliveryApp(deliveryPlatform);
        foodDeliveryApp.deliverOrder();
    }
}
