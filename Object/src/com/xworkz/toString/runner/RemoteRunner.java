package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Remote;

public class RemoteRunner {
    public static void main(String[] args) {
        Remote remote = new Remote("TV", "Samsung", 10);
        System.out.println(remote);

        int hash = remote.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(remote));
    }
}
