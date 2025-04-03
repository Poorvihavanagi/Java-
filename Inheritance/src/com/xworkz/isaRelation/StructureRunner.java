package com.xworkz.isaRelation;
import com.xworkz.inheritance.Structure;
import com.xworkz.inheritance.Bridge;
public class StructureRunner {
    public static void main(String[] args) {

        Bridge bridge = new Bridge();
        bridge.design();
        bridge.build();
        bridge.maintain();
        bridge.inspect();
        bridge.demolish();
        System.out.println("---------------------------------------------------------------------------");
        Structure structure = new Bridge();
        structure.design();
        structure.build();
        structure.maintain();
        structure.inspect();
        structure.demolish();
    }
}

