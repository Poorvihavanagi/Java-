
package com.xworkz.isaRelation;

import com.xworkz.inheritance.Glass;
import com.xworkz.inheritance.DrinkingGlass;

public class GlassRunner {
    public static void main(String[] args) {

        DrinkingGlass drinkingGlass = new DrinkingGlass();
        drinkingGlass.fill();
        drinkingGlass.drink();
        drinkingGlass.clean();
        drinkingGlass.checkMaterial();
        drinkingGlass.empty();

        System.out.println("------------------------------------------------------------------");
        Glass glass = new DrinkingGlass();
        glass.fill();
        glass.drink();
        glass.clean();
        glass.checkMaterial();
        glass.empty();
    }
}
