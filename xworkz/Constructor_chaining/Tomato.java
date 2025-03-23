class Tomato
{
	
	String variety;
	int weight;
	String color;
	boolean is_ripe;
	String taste;
	int diameter;
	
	Tomato()
	{
		System.out.println("No-argument constructor in Tomato\n");
	}
	Tomato(String variety)
	{
		this.variety=variety;
		System.out.println("Constructor with String parameters in tomato\n");
	}
	Tomato(String variety,int weight)
	{
		this.variety=variety;
		this.weight=weight;
		System.out.println("Constructor with String,int, parameters in tomato\n");
	}
	Tomato(String variety,int weight,String color)
	{
		this.variety=variety;
		this.weight=weight;
		this.color=color;
		System.out.println("Constructor with String,int,String, parameters in tomato\n");
	}
	Tomato(String variety, int weight, String color, boolean is_ripe)
	{
        this(variety, weight, color);
        this.is_ripe = is_ripe;
        System.out.println("Constructor with String, int, String, boolean parameters in Tomato\n");
    }
	Tomato(String variety, int weight, String color, boolean is_ripe, String taste) 
	{
        this(variety, weight, color, is_ripe);
        this.taste = taste;
        System.out.println("Constructor with String, int, String, boolean, String parameters in Tomato\n");
    }
	Tomato(String variety, int weight, String color, boolean is_ripe, String taste, int diameter) 
	{
        this(variety, weight, color, is_ripe, taste);
        this.diameter = diameter;
        System.out.println("Constructor with all parameters in Tomato\n");
    }
	void display()
	{
		System.out.println("Tomato details");
        System.out.println("Variety: " + this.variety);
        System.out.println("Weight: " + this.weight + " grams");
        System.out.println("Color: " + this.color);
        System.out.println("Ripe: " + this.is_ripe);
        System.out.println("Taste: " + this.taste);
        System.out.println("Diameter: " + this.diameter + " cm");
	}

}