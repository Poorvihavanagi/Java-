class Color
{
	
	String name;
	String shade;
	double capacity;
	boolean isPrimary;
	boolean isNeon;
	
	Color()
	{
        System.out.println("No-argument constructor in Color\n");
    }

    
    Color(String name) 
	{
        this.name = name;
        System.out.println("Constructor with String parameter in Color\n");
    }

    
    Color(String name, String shade) 
	{
        this(name);
        this.shade = shade;
        System.out.println("Constructor with String, String parameters in Color\n");
    }

    
    Color(String name, String shade, double capacity)
	{
        this(name, shade);
        this.capacity = capacity;
        System.out.println("Constructor with String, String, double parameters in Color\n");
    }

    
    Color(String name, String shade, double capacity, boolean isPrimary)
	{
        this(name, shade, capacity);
        this.isPrimary = isPrimary;
        System.out.println("Constructor with String, String, double, boolean parameters in Color\n");
    }

    
    Color(String name, String shade, double capacity, boolean isPrimary, boolean isNeon)
	{
        this(name, shade, capacity, isPrimary);
        this.isNeon = isNeon;
        System.out.println("Constructor with String, String, double, boolean, boolean parameters in Color\n");
    }

    
    void display() 
	{
        System.out.println("Color Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Shade: " + this.shade);
        System.out.println("Capacity: " + this.capacity + " ml");
        System.out.println("Is Primary Color? " + this.isPrimary);
        System.out.println("Is Neon? " + this.isNeon);
    }
	
}