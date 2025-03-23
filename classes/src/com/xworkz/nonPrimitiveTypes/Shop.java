package com.xworkz.nonPrimitiveTypes;

public class Shop
{
    void ads(Display display)
    {
        if(display!=null){
            System.out.println("Ads running in shop");
            display.run();
        }else{
            System.out.println("Ads not running in shop");
        }
    }
}
