package com.xworkz.inheritance;

public class Makeup extends Cosmetic {

    public void apply() {
        super.apply();
        System.out.println("Applying makeup on the face.");
    }
    public void remove() {
        super.remove();
        System.out.println("Removing makeup using a cleanser.");
    }
    public void checkIngredients() {
        super.checkIngredients();
        System.out.println("Checking if the makeup is suitable for skin type.");
    }
    public void smell() {
        super.smell();
        System.out.println("Smelling the mild fragrance of the makeup product.");
    }
    public void store() {
        super.store();
        System.out.println("Storing makeup in a dry and cool place.");
    }
}
