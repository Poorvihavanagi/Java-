package com.xworkz.inheritance;

public class GlassWindow extends Window {

    @Override
    public void open() {
        super.open();
        System.out.println("Running open in glass window...");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("Running close in glass window...");
    }

    @Override
    public void clean() {
        super.clean();
        System.out.println("Running clean in glass window...");
    }

    @Override
    public void lock() {
        super.lock();
        System.out.println("Running lock in glass window...");
    }

    @Override
    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Running checkMaterial in glass window...");
    }
}
