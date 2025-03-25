package com.xworkz.accessorsAndMutators;

public class IdCard
{
    private String material;
    private String[] color;
    private double weight;
    private String designedBy;

    public String getMaterial(){
        return this.material;
    }
    public void setMaterial(String material){
        this.material=material;
    }
    public String[] getColor(){
        return this.color;
    }
    public void setColor(String[] color){
        this.color=color;
    }
    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public String getDesignedBy(){
        return this.designedBy;
    }
    public void setDesignedBy(String designedBy){
        this.designedBy=designedBy;
    }
}
