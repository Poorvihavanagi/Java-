package com.xworkz.inheritance;

public class NationalFlag extends Flag
{
    @Override
    public void hoist() {
        super.hoist();
        System.out.println("Running hoist flag in National flag");
    }
    @Override
    public void fold() {
        super.fold();
        System.out.println("Running fold flag in national flag");
    }
    @Override
    public void wave() {
        super.wave();
        System.out.println("Running wave flag in national flag");
    }
    @Override
    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Running material check flag in National flag");
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Running display flag in national flag");
    }
}
