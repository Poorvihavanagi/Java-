package com.xworkz.practice.external;

import com.xworkz.practice.internal.ECommerceAuthority;

public class OnlineStore {
    private ECommerceAuthority eCommerceAuthority;

    public OnlineStore(ECommerceAuthority eCommerceAuthority){
        this.eCommerceAuthority=eCommerceAuthority;
        System.out.println("Parameterized const online store");
    }
    public void monitorProductListings(){
        if(this.eCommerceAuthority!=null){
            System.out.println("ECommerce authority is not null");
            this.eCommerceAuthority.regulateSales();
        }
        else{
            System.out.println("It is null");
        }
    }
}
