package com.xworkz.toString.runner;
import com.xworkz.toString.internal.RemoteControl;

public class RemoteControlRunner {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl("TV", 20, true);
        System.out.println(remote);

        int hash = remote.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(remote));

        RemoteControl remote1 = new RemoteControl("TV", 20, true);
        RemoteControl remote2 = new RemoteControl("TV", 20, true);

        System.out.println("Checking same location: " + (remote1 == remote2));
        boolean same = remote1.equals(remote2);
        System.out.println("Remote1 is same as Remote2: " + same);
    }
}