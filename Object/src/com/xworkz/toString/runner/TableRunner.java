package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Table;

public class TableRunner {
    public static void main(String[] args) {
        Table table = new Table("Round", "Wood", 75);
        System.out.println(table);

        int hash = table.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(table));

        Table table1 = new Table("Round", "Wood", 75);
        Table table2 = new Table("Round", "Wood", 75);

        System.out.println("Checking same location: " + (table1 == table2));
        boolean same = table1.equals(table2);
        System.out.println("Table1 is same as Table2: " + same);
    }
}