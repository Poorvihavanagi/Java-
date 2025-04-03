package com.xworkz.inheritance;

public class GlassWindow extends Window {
    public void open() {
        super.open();
        System.out.println("Sliding open the glass window...");
    }

    public void close() {
        super.close();
        System.out.println("Sliding close the glass window...");
    }

    public void clean() {
        super.clean();
        System.out.println("Using glass cleaner for the glass window...");
    }

    public void lock() {
        super.lock();
        System.out.println("Locking the glass window securely...");
    }

    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Verifying if the glass window is tempered...");
    }
}
