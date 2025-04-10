package com.xworkz.toString.runner;
import com.xworkz.toString.internal.RemoteControl;

public class RemoteControlRunner {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl("TV", 20, true);
        System.out.println(remote);

        int hash = remote.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(remote));
    }
}