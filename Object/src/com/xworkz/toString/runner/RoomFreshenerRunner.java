package com.xworkz.toString.runner;
import com.xworkz.toString.internal.RoomFreshener;

public class RoomFreshenerRunner {
    public static void main(String[] args) {
        RoomFreshener freshener = new RoomFreshener("Odonil", "Lavender", 150);
        System.out.println(freshener);

        int hash = freshener.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(freshener));

        RoomFreshener freshener1 = new RoomFreshener("Airwick", "Rose", 200);
        RoomFreshener freshener2 = new RoomFreshener("Odonil", "Lavender", 150);

        System.out.println("Checking same location: " + (freshener1 == freshener2));
        boolean same = freshener1.equals(freshener2);
        System.out.println("Freshener1 is same as Freshener2: " + same);
    }
}