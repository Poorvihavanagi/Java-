package com.xworkz.inheritance;

public class Soap extends Product{
    public void cleanTeeth(){
        System.out.println("Toothpaste is cleaning teeth");
    }
    public void removeGerms(Product product){
        product.apply();
        product.checkExpiry();
        product.use();
        product.dispose();
        product.store();

        if(product instanceof Soap){
            System.out.println("Product is an instance of Soap");
            Soap soap=new Soap();
            soap.cleanTeeth();
        }
    }
}
