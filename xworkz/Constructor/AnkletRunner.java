class  AnkletRunner{
	
	public static void main(String... args)
	{
		String material="Gold";
		int price=5000;
		double length=2;
		
		Anklet anklet=new Anklet(material,price,length);
		System.out.println("Anklet material: " +anklet.material);
		System.out.println("Anklet price: "+anklet.price);
		System.out.println("Anklet length in cm: " +anklet.length+ "\n");
		
		String material2 = "Silver";
        int price2 = 3000;
        double length2 = 2.5;

        Anklet anklet2 = new Anklet(material2, price2, length2);
        System.out.println("Anklet material: " + anklet2.material);
        System.out.println("Anklet price: " + anklet2.price);
        System.out.println("Anklet length in cm: " + anklet2.length + "\n");

        String material3 = "Leather";
        int price3 = 1500;
        double length3 = 3.0;

        Anklet anklet3 = new Anklet(material3, price3, length3);
        System.out.println("Anklet material: " + anklet3.material);
        System.out.println("Anklet price: " + anklet3.price);
        System.out.println("Anklet length in cm: " + anklet3.length + "\n");

        String material4 = "Beaded";
        int price4 = 1000;
        double length4 = 2.8;

        Anklet anklet4 = new Anklet(material4, price4, length4);
        System.out.println("Anklet material: " + anklet4.material);
        System.out.println("Anklet price: " + anklet4.price);
        System.out.println("Anklet length in cm: " + anklet4.length + "\n");

        String material5 = "Platinum";
        int price5 = 7000;
        double length5 = 2.2;

        Anklet anklet5 = new Anklet(material5, price5, length5);
        System.out.println("Anklet material: " + anklet5.material);
        System.out.println("Anklet price: " + anklet5.price);
        System.out.println("Anklet length in cm: " + anklet5.length + "\n");
	}
}