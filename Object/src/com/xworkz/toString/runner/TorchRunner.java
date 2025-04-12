package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Torch;

public class TorchRunner {
    public static void main(String[] args) {
        Torch torch = new Torch("Eveready", "Rechargeable", 120);
        System.out.println(torch);

        int hash = torch.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(torch));

        Torch torch1 = new Torch("Eveready", "Rechargeable", 120);
        Torch torch2 = new Torch("Eveready", "Rechargeable", 120);

        System.out.println("Checking same location: " + (torch1 == torch2));
        boolean same = torch1.equals(torch2);
        System.out.println("Torch1 is same as Torch2: " + same);
    }
}