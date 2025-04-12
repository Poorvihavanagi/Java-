package com.xworkz.toString.internal;

public class Whiteboard {
    private String size;
    private String frameMaterial;
    private boolean magnetic;

    public Whiteboard(String size, String frameMaterial, boolean magnetic) {
        this.size = size;
        this.frameMaterial = frameMaterial;
        this.magnetic = magnetic;
    }

    public String toString() {
        return "Whiteboard{Size='" + size + "', FrameMaterial='" + frameMaterial + "', Magnetic=" + magnetic + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 937;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Whiteboard) {
                System.out.println("Ref is Whiteboard, will compare...");
                Whiteboard wb1 = this;
                Whiteboard wb2 = (Whiteboard) obj;
                if (wb1.size.equals(wb2.size) && wb1.frameMaterial.equals(wb2.frameMaterial) && wb1.magnetic == wb2.magnetic) {
                    System.out.println("Both Whiteboards are identical");
                    return true;
                }
            }
        }
        return false;
    }
}