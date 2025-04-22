package com.xworkz.practice.runner;

import com.xworkz.practice.external.OnlineStore;
import com.xworkz.practice.internal.ECommerceAuthority;
import com.xworkz.practice.internal.EcomIndiaImpl;

public class ECommerceAuthorityRunner {
    public static void main(String[] args) {
        ECommerceAuthority eCommerceAuthority=new EcomIndiaImpl();
        OnlineStore onlineStore=new OnlineStore(eCommerceAuthority);
        onlineStore.monitorProductListings();
    }
}
