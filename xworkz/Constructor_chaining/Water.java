class Water{
	
	String source;
	double pHLevel;
	boolean isDrinkable;
	String color;
	double volume;
	String taste;
	
	Water()
	{
        System.out.println("No-argument constructor in Water\n");
    }

   
    Water(String source)
	{
        this.source = source;
        System.out.println("Constructor with String parameter in Water\n");
    }

    
    Water(String source, double pHLevel) 
	{
        this(source);
        this.pHLevel = pHLevel;
        System.out.println("Constructor with String, double parameters in Water\n");
    }

    
    Water(String source, double pHLevel, boolean isDrinkable)
	{
        this(source, pHLevel);
        this.isDrinkable = isDrinkable;
        System.out.println("Constructor with String, double, boolean parameters in Water\n");
    }

    
    Water(String source, double pHLevel, boolean isDrinkable, String color) 
	{
        this(source, pHLevel, isDrinkable);
        this.color = color;
        System.out.println("Constructor with String, double, boolean, String parameters in Water\n");
    }

    
    Water(String source, double pHLevel, boolean isDrinkable, String color, double volume)
	{
        this(source, pHLevel, isDrinkable, color);
        this.volume = volume;
        System.out.println("Constructor with String, double, boolean, String, double parameters in Water\n");
    }

    
    Water(String source, double pHLevel, boolean isDrinkable, String color, double volume, String taste)
	{
        this(source, pHLevel, isDrinkable, color, volume);
        this.taste = taste;
        System.out.println("Constructor with String, double, boolean, String, double, String parameters in Water\n");
    }

    void display()
	{
        System.out.println("Water Details:");
        System.out.println("Source: " + this.source);
        System.out.println("pH Level: " + this.pHLevel);
        System.out.println("Is Drinkable: " + this.isDrinkable);
        System.out.println("Color: " + this.color);
        System.out.println("Volume: " + this.volume + " liters");
        System.out.println("Taste: " + this.taste);
	}
}