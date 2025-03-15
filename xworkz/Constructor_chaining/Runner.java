class Runner{
	public static void main(String... args)
	{
		Balloon balloon=new Balloon("Red",2,"Round",false,3,"decoration");
		balloon.display();
		System.out.println("-----------------------------------------------------------------");
		
		Holi holi = new Holi(14,"Vrindavan","Rain Dance Holi",200,"Herbal colors","Bhang");
		holi.display();
		System.out.println("-----------------------------------------------------------------");
		
		Pichkari pichkari = new Pichkari("Spray Gun","Blue");
		pichkari.display();
		System.out.println("-----------------------------------------------------------------");
		
		Egg egg = new Egg("Chicken", 2 , true);
		egg.display();
		System.out.println("-----------------------------------------------------------------");
		
		Bucket bucket = new Bucket("Plastic", "Milton",150,false,500);
		bucket.display();
		System.out.println("-----------------------------------------------------------------");
		
		Tomato tomato = new Tomato("Cherry",150,"Red",true,"Sweet",7);
		tomato.display();
		System.out.println("-----------------------------------------------------------------");
		
		WaterBall ball1 = new WaterBall();
        ball1.display();

        WaterBall ball2 = new WaterBall("Blue");
        ball2.display();

        WaterBall ball3 = new WaterBall("Red", true);
        ball3.display();

        WaterBall ball4 = new WaterBall("Green", false, 50);
        ball4.display();

        WaterBall ball5 = new WaterBall("Yellow", true, 75, "Plastic");
        ball5.display();

        WaterBall ball6 = new WaterBall("Purple", false, 100, "Rubber", 120.5);
        ball6.display();

        WaterBall ball7 = new WaterBall("Orange", true, 150, "Silicone", 80.0, 10);
        ball7.display();
		System.out.println("-----------------------------------------------------------------");
		
		Gun gun = new Gun("M16","5.56mm",30,3.4,true,1800);
		gun.display();
		System.out.println("-----------------------------------------------------------");
		
		NailPolish nailPolish = new NailPolish("Black", "Lakme", 199.99, true,15);
		nailPolish.display();
		System.out.println("-----------------------------------------------------------");
		
		Water water = new Water("River",7.2,true,"Clear",1.5,"Fresh");
		water.display();
		System.out.println("-----------------------------------------------------------");
		
		Color color = new Color("Red", "Dark Red", 500, true, false);
		color.display();
		System.out.println("-----------------------------------------------------------");
		
	}
}