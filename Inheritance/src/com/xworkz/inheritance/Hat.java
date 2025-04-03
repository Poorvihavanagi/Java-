package com.xworkz.inheritance;

public class Hat extends Cap
{
    public void wear(){
        super.wear();
        System.out.println("Hat covers head");
    }

    public void checkMaterial(){
        super.checkMaterial();
        System.out.println("Stitching a hat");
    }

    public void remove(){
        System.out.println("Remove hat");
    }
}
