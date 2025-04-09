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
}