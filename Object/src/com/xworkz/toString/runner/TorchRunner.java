package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Torch;

public class TorchRunner {
    public static void main(String[] args) {
        Torch torch = new Torch("Eveready", "Rechargeable", 120);
        System.out.println(torch);
    }
}