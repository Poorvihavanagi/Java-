package com.xworkz.toString.internal;

public class Table {
    private String shape;
    private String material;
    private int height;

    public Table(String shape, String material, int height) {
        this.shape = shape;
        this.material = material;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Table{Shape='" + shape + "', Material='" + material + "', Height=" + height + "cm}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 97;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Table) {
                System.out.println("Ref is Table, will compare...");
                Table table1 = this;
                Table table2 = (Table) obj;
                if (table1.shape.equals(table2.shape) && table1.material.equals(table2.material) && table1.height == table2.height) {
                    System.out.println("Both tables are identical");
                    return true;
                }
            }
        }
        return false;
    }
}