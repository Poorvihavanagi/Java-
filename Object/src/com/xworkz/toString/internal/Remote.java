package com.xworkz.toString.internal;

public class Remote {
    private String deviceType;
    private String brand;
    private int range;

    public Remote(String deviceType, String brand, int range) {
        this.deviceType = deviceType;
        this.brand = brand;
        this.range = range;
    }
    @Override
    public String toString() {
        return "Remote{deviceType='" + deviceType + "', brand='" + brand + "', range=" + range + " meters}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 999;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Remote) {
                System.out.println("Ref is Remote, will compare...");
                Remote remote1 = this;
                Remote remote2 = (Remote) obj;
                if (remote1.deviceType.equals(remote2.deviceType) && remote1.brand.equals(remote2.brand) && remote1.range == remote2.range) {
                    System.out.println("Both remotes are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
