package com.xworkz.implement;

import com.xworkz.internal.Art;

public class Painting implements Art {
    @Override
    public void create() {
        System.out.println("running create in painting");
    }

    @Override
    public void describeStyle() {
        System.out.println("running describe style in painting");
    }

    @Override
    public void display() {
        System.out.println("running display in painting");
    }
    @Override
    public void frame() {
        System.out.println("The painting is being framed.");
    }

    @Override
    public void preserve() {
        System.out.println("The painting is being preserved.");
    }
}
