package com.xworkz.inheritance;

public class Bangle extends Accessory {

    @Override
    public void wear() {
        super.wear();
        System.out.println("Running wear in Bangle");
    }

    @Override
    public void remove() {
        super.remove();
        System.out.println("Running remove in Bangle");
    }

    @Override
    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Running checkMaterial in Bangle");
    }

    @Override
    public void clean() {
        super.clean();
        System.out.println("Running clean in Bangle");
    }

    @Override
    public void store() {
        super.store();
        System.out.println("Running store in Bangle");
    }

    public void polish(){
        System.out.println("Running polish bangle");
    }
}
