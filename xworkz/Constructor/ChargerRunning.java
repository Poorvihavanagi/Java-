class ChargerRunning{
	public static void main(String[] args)
	{
		
		Charger charger1 = new Charger("Samsung", "White", "Type-C");
        System.out.println("Charger Brand: " + charger1.brand);
        System.out.println("Charger Color: " + charger1.color);
        System.out.println("Charger Pin Type: " + charger1.pinType + "\n");
		
		Charger charger2 = new Charger("Apple", "Black", "Lightning");
        System.out.println("Charger Brand: " + charger2.brand);
        System.out.println("Charger Color: " + charger2.color);
        System.out.println("Charger Pin Type: " + charger2.pinType + "\n");

        
        Charger charger3 = new Charger("Anker", "Blue", "USB-A");
        System.out.println("Charger Brand: " + charger3.brand);
        System.out.println("Charger Color: " + charger3.color);
        System.out.println("Charger Pin Type: " + charger3.pinType + "\n");

       
        Charger charger4 = new Charger("Sony", "Gray", "Micro-USB");
        System.out.println("Charger Brand: " + charger4.brand);
        System.out.println("Charger Color: " + charger4.color);
        System.out.println("Charger Pin Type: " + charger4.pinType + "\n");

        
        Charger charger5 = new Charger("OnePlus", "Red", "Warp Charge");
        System.out.println("Charger Brand: " + charger5.brand);
        System.out.println("Charger Color: " + charger5.color);
        System.out.println("Charger Pin Type: " + charger5.pinType + "\n");
		
		
	}
}