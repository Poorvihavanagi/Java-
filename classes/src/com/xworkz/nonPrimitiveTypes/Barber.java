package com.xworkz.nonPrimitiveTypes;

public class Barber
{
    void cutHair(Customer customer) {
        if (customer != null) {
            System.out.println("Barber cutting hair ");
            customer.getHaircut();
        } else {
            System.out.println("Customer is null");
        }
    }
}
