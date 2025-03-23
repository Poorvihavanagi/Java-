class Holi
{
	
	int date;
	String location;
	String theme;
	int counts;
	String color_types;
	String drink;
	
	Holi()
	{
		System.out.println("No-argument constructor in Holi");
	}
	Holi(int date)
	{
		this.date=date;
		System.out.println("int, No-argument constructor in Holi");
	}
	Holi(int date,String location)
	{
		this.date=date;
		this.location=location;
		System.out.println("int,String, no-argument const in holi");
	}
	Holi(int date,String location,String theme)
	{
		this.date=date;
		this.location=location;
		this.theme=theme;
		System.out.println("int,String,String no-argument const in holi");
	}
	Holi(int date,String location,String theme,int counts)
	{
		this(date,location,theme);
		this.counts=counts;
		System.out.println("int,String,String,int, no-argument const in holi");
	}
	Holi(int date,String location,String theme,int counts,String color_types)
	{
		this(date,location,theme,counts);
		this.color_types=color_types;
		System.out.println("int,String,String,int,String, no-argument const in holi");
	}
	Holi(int date,String location,String theme,int counts,String color_types,String drink)
	{
		this(date,location,theme,counts,color_types);
		this.drink=drink;
		System.out.println("int,String,String,int,String,String, no-argument const in holi \n");
	}
	
	void display()
	{
		System.out.println("Holi Event details");
		System.out.println("Holi date: " +this.date);
		System.out.println("Location: " +this.location);
		System.out.println("Holi theme: " +this.theme);
		System.out.println("Number of people attending the Holi celebration: " +this.counts);
		System.out.println("types of colors used: " +color_types);
		System.out.println("Holi beverages: " +this.drink+ "\n");
	}
}