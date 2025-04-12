package com.xworkz.toString.internal;

public class MakeUp
{
    private String brand;
    private String type;
    private double price;

    public MakeUp(String brand,String type,double price){
        this.brand=brand;
        this.type=type;
        this.price=price;
    }

    @Override
    public String toString(){
        return "MakeUp{Brand: " + brand + ", Type: " + type + ", Price: " + price + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 560;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof MakeUp) {
                System.out.println("Ref is MakeUp, will compare...");
                MakeUp makeup1 = this;
                MakeUp makeup2 = (MakeUp) obj;
                if (makeup1.brand.equals(makeup2.brand) && makeup1.type.equals(makeup2.type) && makeup1.price == makeup2.price) {
                    System.out.println("Both MakeUp objects are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
