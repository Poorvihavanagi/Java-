package com.xworkz.isaRelation;

import com.xworkz.inheritance.Medicine;
import com.xworkz.inheritance.Tablet;

public class MedicineRunner {
    public static void main(String[] args) {
        Tablet tablet = new Tablet();
        tablet.consume();
        tablet.store();
        tablet.checkExpiry();
        tablet.prescribe();
        tablet.manufacture();
        System.out.println("------------------------------------------------------------");
        Medicine medicine = new Tablet();
        medicine.consume();
        medicine.store();
        medicine.checkExpiry();
        medicine.prescribe();
        medicine.manufacture();
    }
}
