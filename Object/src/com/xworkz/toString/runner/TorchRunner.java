package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Torch;

public class TorchRunner {
    public static void main(String[] args) {
        Torch torch = new Torch("Eveready", "Rechargeable", 120);
        System.out.println(torch);

        int hash = torch.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(torch));
    }
}