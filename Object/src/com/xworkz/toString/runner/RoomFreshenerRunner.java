package com.xworkz.toString.runner;
import com.xworkz.toString.internal.RoomFreshener;

public class RoomFreshenerRunner {
    public static void main(String[] args) {
        RoomFreshener freshener = new RoomFreshener("Odonil", "Lavender", 150);
        System.out.println(freshener);

        int hash = freshener.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(freshener));
    }
}