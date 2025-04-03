package com.xworkz.inheritance;

public class Diwali extends Festival {

    public void celebrate() {
        super.celebrate();
        System.out.println("Celebrating Diwali, the festival of lights...");
    }

    public void lightDecorations() {
        super.lightDecorations();
        System.out.println("Lighting diyas and decorating homes...");
    }

    public void distributeSweets() {
        super.distributeSweets();
        System.out.println("Sharing Diwali sweets like ladoos and barfis...");
    }

    public void performRituals() {
        super.performRituals();
        System.out.println("Performing Lakshmi Puja for prosperity...");
    }

    public void enjoyFireworks() {
        super.enjoyFireworks();
        System.out.println("Bursting crackers and enjoying fireworks...");
    }
}
