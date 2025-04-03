package com.xworkz.inheritance;

public class Software extends Technology {
    public void develop() {
        super.develop();
        System.out.println("Software is being developed with new features...");
    }

    public void upgrade() {
        super.upgrade();
        System.out.println("Software gets regular updates to improve performance...");
    }

    public void implement() {
        super.implement();
        System.out.println("Software is implemented in various industries...");
    }

    public void support() {
        super.support();
        System.out.println("Software provides customer support and maintenance...");
    }

    public void secure() {
        super.secure();
        System.out.println("Software ensures data security and protection...");
    }
}
