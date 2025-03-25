package com.xworkz.accessorsAndMutators;

public class Camera
{
    private String brand;
    private double price;
    private CameraType type;
    private String connectivity;

    public String getBrand() {
        return this.brand;
    }

    public double getPrice() {
        return this.price;
    }

    public CameraType getType() {
        return this.type;
    }

    public String getConnectivity() {
        return this.connectivity;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(CameraType type) {
        this.type = type;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

}
