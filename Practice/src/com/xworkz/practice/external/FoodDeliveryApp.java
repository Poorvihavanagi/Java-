package com.xworkz.practice.external;

import com.xworkz.practice.internal.DeliveryPlatform;

public class FoodDeliveryApp {
    private DeliveryPlatform deliveryPlatform;
    public FoodDeliveryApp(DeliveryPlatform deliveryPlatform){
        this.deliveryPlatform=deliveryPlatform;
        System.out.println("Parameterized const");
    }
    public void deliverOrder(){
        if(this.deliveryPlatform!=null){
            System.out.println("Delivery platform is not null");
            this.deliveryPlatform.deliverOrder();
        }
        else{
            System.out.println("It is null");
        }
    }
}
