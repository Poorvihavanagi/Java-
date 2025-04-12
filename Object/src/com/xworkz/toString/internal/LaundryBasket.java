package com.xworkz.toString.internal;

public class LaundryBasket {
    private String material;
    private String color;
    private int capacity;

    public LaundryBasket(String material, String color, int capacity) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "LaundryBasket{Material='" + material + "', Color='" + color + "', Capacity=" + capacity + "L}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 520;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof LaundryBasket) {
                System.out.println("Ref is LaundryBasket, will compare...");
                LaundryBasket basket1 = this;
                LaundryBasket basket2 = (LaundryBasket) obj;
                if (basket1.material.equals(basket2.material) && basket1.color.equals(basket2.color)) {
                    System.out.println("Both LaundryBaskets are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
