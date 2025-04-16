package com.xworkz.implement;

import com.xworkz.internal.Makeup;

public class Lipstick implements Makeup {
    public void apply() {
        System.out.println("Applying the lipstick on lips.");
    }

    public void remove() {
        System.out.println("Removing the lipstick with makeup remover.");
    }

    public void store() {
        System.out.println("Storing the lipstick in the makeup bag.");
    }
}
