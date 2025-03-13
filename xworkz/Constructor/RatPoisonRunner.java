class RatPoisonRunner{
	public static void main(String... args)
	{
		
		String brand="RatsAway";
		String color="Blue";
		double price=199.99;
		
		RatPoison ratPoison=new RatPoison(brand,color,price);
		System.out.println("Rat Poison info: " +brand);
		System.out.println("Rat poison info: " +color);
		System.out.println("Rat poison info: " +price+ "\n");
		
		String brand2 = "Deadly Bait";
        String color2 = "Red";
        double price2 = 249.50;
        RatPoison ratPoison2 = new RatPoison(brand2, color2, price2);
        System.out.println("Rat Poison info: " + brand2);
        System.out.println("Rat Poison info: " + color2);
        System.out.println("Rat Poison info: " + price2 + "\n");

        String brand3 = "Rodent Killer";
        String color3 = "Green";
        double price3 = 179.75;
        RatPoison ratPoison3 = new RatPoison(brand3, color3, price3);
        System.out.println("Rat Poison info: " + brand3);
        System.out.println("Rat Poison info: " + color3);
        System.out.println("Rat Poison info: " + price3 + "\n");

        String brand4 = "PestGone";
        String color4 = "Black";
        double price4 = 220.30;
        RatPoison ratPoison4 = new RatPoison(brand4, color4, price4);
        System.out.println("Rat Poison info: " + brand4);
        System.out.println("Rat Poison info: " + color4);
        System.out.println("Rat Poison info: " + price4 + "\n");

        String brand5 = "NoMoreRats";
        String color5 = "Yellow";
        double price5 = 205.99;
        RatPoison ratPoison5 = new RatPoison(brand5, color5, price5);
        System.out.println("Rat Poison info: " + brand5);
        System.out.println("Rat Poison info: " + color5);
        System.out.println("Rat Poison info: " + price5 + "\n");
	}
}