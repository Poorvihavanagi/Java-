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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof NailCutter) {
                System.out.println("Ref is NailCutter, will compare...");
                NailCutter n1 = this;
                NailCutter n2 = (NailCutter) obj;
                if (n1.springType.equals(n2.springType) && n1.bladeSharpness.equals(n2.bladeSharpness)) {
                    System.out.println("Both NailCutters are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
