package com.xworkz.inheritance;

public class Bridge extends Structure{

    public void design() {
        super.design();
        System.out.println("Designing the bridge with arches and supports...");
    }

    public void build() {
        super.build();
        System.out.println("Building the bridge with reinforced materials...");
    }

    public void maintain() {
        super.maintain();
        System.out.println("Maintaining the bridge for safety...");
    }

    public void inspect() {
        super.inspect();
        System.out.println("Inspecting the bridge for structural integrity...");
    }

    public void demolish() {
        super.demolish();
        System.out.println("Demolishing the bridge for reconstruction...");
    }
}
