package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Remote;
import com.xworkz.toString.internal.RemoteControl;


public class RemoteRunner {
    public static void main(String[] args) {
        Remote remote = new Remote("TV", "Samsung", 10);
        System.out.println(remote);

        int hash = remote.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(remote));

        Remote remote1 = new Remote("TV", "Samsung", 10);
        Remote remote2 = new Remote("TV", "Samsung", 50);

        System.out.println("Checking same location: " + (remote1 == remote2));
        boolean same = remote1.equals(remote2);
        System.out.println("Remote1 is same as Remote2: " + same);

    }
}
