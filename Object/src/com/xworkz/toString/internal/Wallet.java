package com.xworkz.toString.internal;

public class Wallet {
    private String material;
    private String color;
    private int slots;

    public Wallet(String material, String color, int slots) {
        this.material = material;
        this.color = color;
        this.slots = slots;
    }
    @Override
    public String toString() {
        return "Wallet{material='" + material + "', color='" + color + "', slots=" + slots + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 957;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Wallet) {
                System.out.println("Ref is Wallet, will compare...");
                Wallet wallet1 = this;
                Wallet wallet2 = (Wallet) obj;
                if (wallet1.material.equals(wallet2.material) && wallet1.color.equals(wallet2.color) && wallet1.slots == wallet2.slots) {
                    System.out.println("Both Wallets are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
