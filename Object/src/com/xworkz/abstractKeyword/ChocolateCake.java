package com.xworkz.abstractKeyword;

public class ChocolateCake extends Cake{

        private String topping;


        public ChocolateCake(String flavor, String size, int layers, double price, String topping) {
            super(flavor, size, layers, price);
            this.topping = topping;
        }

        public ChocolateCake(String flavor, String size, int layers, String topping) {
            super(flavor, size, layers);
            this.topping = topping;
        }

        public ChocolateCake(String flavor, String size, String topping) {
            super(flavor, size);
            this.topping = topping;
        }

        @Override
        public void displayDetails() {
            System.out.println("Cake Flavor: " + flavor);
            System.out.println("Size: " + size);
            System.out.println("Layers: " + layers);
            System.out.println("Topping: " + topping);
            showPrice();
        }
}


