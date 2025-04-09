package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Table;

public class TableRunner {
    public static void main(String[] args) {
        Table table = new Table("Round", "Wood", 75);
        System.out.println(table);
    }
}