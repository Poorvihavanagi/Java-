package com.xworkz.Hybrid;

import com.xworkz.MultiLevel.Document;

public class Book extends Media implements Downloadable
{
    public void download(){
        System.out.println("Downloading eBook");
    }
}
