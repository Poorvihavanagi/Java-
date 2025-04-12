package com.xworkz.toString.internal;

public class Router {
    private String brand;
    private String frequencyBand;
    private int numberOfPorts;

    public Router(String brand, String frequencyBand, int numberOfPorts) {
        this.brand = brand;
        this.frequencyBand = frequencyBand;
        this.numberOfPorts = numberOfPorts;
    }
    @Override
    public String toString() {
        return "Router{" + "brand='" + brand + '\'' + ", frequencyBand='" + frequencyBand + '\'' + ", numberOfPorts=" + numberOfPorts + '}';
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 97;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Router) {
                System.out.println("Ref is Router, will compare...");
                Router router1 = this;
                Router router2 = (Router) obj;
                if (router1.brand.equals(router2.brand) &&
                        router1.frequencyBand.equals(router2.frequencyBand) &&
                        router1.numberOfPorts == router2.numberOfPorts) {
                    System.out.println("Both routers are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
