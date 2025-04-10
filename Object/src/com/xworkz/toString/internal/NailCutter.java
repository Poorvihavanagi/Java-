package com.xworkz.toString.internal;

public class NailCutter {
    private String springType;
    private String bladeSharpness;
    private boolean safetyLock;

    public NailCutter(String springType, String bladeSharpness, boolean safetyLock) {
        this.springType = springType;
        this.bladeSharpness = bladeSharpness;
        this.safetyLock = safetyLock;
    }

    @Override
    public String toString() {
        return "NailCutter{" + "Spring Type='" + springType + "'" + ", Blade Sharpness='" + bladeSharpness + "'" + ", Safety Lock=" + safetyLock + '}';
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -670;
    }
}
