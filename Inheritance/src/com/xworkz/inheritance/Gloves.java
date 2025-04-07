package com.xworkz.inheritance;

public class Gloves extends ProtectiveGear {

    @Override
    public void wear() {
        super.wear();
        System.out.println("Running wear in gloves");
    }

    @Override
    public void remove() {
        super.remove();
        System.out.println("Running remove in gloves");
    }

    @Override
    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Running checkMaterial in gloves");
    }

    @Override
    public void wash() {
        super.wash();
        System.out.println("Running wash in gloves");
    }

    @Override
    public void store() {
        super.store();
        System.out.println("Running store in gloves");
    }
    public void sanitize(){
        System.out.println("Running sanitize in gloves");
    }
}
