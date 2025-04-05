package com.xworkz.inheritance;

public class Bridge extends Structure {

    @Override
    public void design() {
        super.design();
        System.out.println("Running design in Bridge");
    }

    @Override
    public void build() {
        super.build();
        System.out.println("Running build in Bridge");
    }

    @Override
    public void maintain() {
        super.maintain();
        System.out.println("Running maintain in Bridge");
    }

    @Override
    public void inspect() {
        super.inspect();
        System.out.println("Running inspect in Bridge");
    }

    @Override
    public void demolish() {
        super.demolish();
        System.out.println("Running demolish in Bridge");
    }
}
