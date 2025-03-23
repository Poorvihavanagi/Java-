class NailPolish
{
	
	String color;
	String brand;
    double price;
    boolean isGelBased;
    int quantity; 
    String finishType;
	
	NailPolish()
	{
		System.out.println("No-argument constructor in Gun\n");
	}
	NailPolish(String color)
	{
		this.color=color;
		System.out.println("Constructor with String parameter in Gun\n");
	}
	NailPolish(String color, String brand) 
	{
        this(color);
        this.brand = brand;
        System.out.println("Constructor with String, String parameters in NailPolish\n");
    }
	NailPolish(String color, String brand, double price)
	{
        this(color, brand);
        this.price = price;
        System.out.println("Constructor with String, String, double parameters in NailPolish\n");
    }
	NailPolish(String color, String brand, double price, boolean isGelBased) 
	{
        this(color, brand, price);
        this.isGelBased = isGelBased;
        System.out.println("Constructor with String, String, double, boolean parameters in NailPolish\n");
    }
	
	NailPolish(String color, String brand, double price, boolean isGelBased, int quantity)
	{
        this(color, brand, price, isGelBased);
        this.quantity = quantity;
        System.out.println("Constructor with String, String, double, boolean, int parameters in NailPolish\n");
    }

  
    NailPolish(String color, String brand, double price, boolean isGelBased, int quantity, String finishType)
	{
        this(color, brand, price, isGelBased, quantity);
        this.finishType = finishType;
        System.out.println("Constructor with all parameters in NailPolish\n");
    }
	
	void display()
	{
        System.out.println("Nail Polish Details:");
        System.out.println("Color: " + this.color);
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: $" + this.price);
        System.out.println("Gel Based: " + this.isGelBased);
        System.out.println("Quantity: " + this.quantity + " ml");
        System.out.println("Finish Type: " + this.finishType);
        
    }
}