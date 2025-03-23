package com.xworkz.nonPrimitiveTypes;

public class Theater
{
    void show(Poster poster){
        if(poster!=null){
            System.out.println("Poster running in theater");
            poster.showInfo();
        }
        else{
            System.out.println("Poster not running in theater");
        }
    }
}
