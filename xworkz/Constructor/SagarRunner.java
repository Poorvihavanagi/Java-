class SagarRunner{
	
	public static void main(String... args)
	{
		
		int age=21;
		double height=6;
		String city="Banglore";
		Sagar sagar=new Sagar(age,height,city);
		System.out.println("Sagar's age: " +sagar.age);
		System.out.println("Sagar's height: " +sagar.height);
		System.out.println("Sagar's city: " +sagar.city+"\n");
		
		int age2 = 25;
        double height2 = 5.9;
        String city2 = "Mumbai";
        Sagar sagar2 = new Sagar(age2, height2, city2);
        System.out.println("Sagar's age: " + sagar2.age);
        System.out.println("Sagar's height: " + sagar2.height);
        System.out.println("Sagar's city: " + sagar2.city + "\n");

        int age3 = 28;
        double height3 = 5.8;
        String city3 = "Pune";
        Sagar sagar3 = new Sagar(age3, height3, city3);
        System.out.println("Sagar's age: " + sagar3.age);
        System.out.println("Sagar's height: " + sagar3.height);
        System.out.println("Sagar's city: " + sagar3.city + "\n");

        int age4 = 30;
        double height4 = 5.7;
        String city4 = "Delhi";
        Sagar sagar4 = new Sagar(age4, height4, city4);
        System.out.println("Sagar's age: " + sagar4.age);
        System.out.println("Sagar's height: " + sagar4.height);
        System.out.println("Sagar's city: " + sagar4.city + "\n");

        int age5 = 23;
        double height5 = 6.1;
        String city5 = "Hyderabad";
        Sagar sagar5 = new Sagar(age5, height5, city5);
        System.out.println("Sagar's age: " + sagar5.age);
        System.out.println("Sagar's height: " + sagar5.height);
        System.out.println("Sagar's city: " + sagar5.city + "\n");
	}
}