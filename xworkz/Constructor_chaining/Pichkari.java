class Pichkari {
    
    String type;
    String color;
    int range;
    String material;
    int cost;
    boolean is_eco_friendly;

    
    Pichkari() {
        System.out.println("No-argument constructor in Pichkari\n");
    }

    
    Pichkari(String type) {
        this.type = type;
        System.out.println("Constructor with String parameter in Pichkari\n");
    }

   
    Pichkari(String type, String color)
	{
        this(type);
        this.color = color;
        System.out.println("Constructor with String, String parameters in Pichkari\n");
    }

   
    Pichkari(String type, String color, int range) {
        this(type, color);
        this.range = range;
        System.out.println("Constructor with String, String, int parameters in Pichkari\n");
    }

   
    Pichkari(String type, String color, int range, String material) {
        this(type, color, range);
        this.material = material;
        System.out.println("Constructor with String, String, int, String parameters in Pichkari\n");
    }

    
    Pichkari(String type, String color, int range, String material, int cost) {
        this(type, color, range, material);
        this.cost = cost;
        System.out.println("Constructor with String, String, int, String, int parameters in Pichkari\n");
    }

    
    Pichkari(String type, String color, int range, String material, int cost, boolean is_eco_friendly) {
        this(type, color, range, material, cost);
        this.is_eco_friendly = is_eco_friendly;
        System.out.println("Constructor with all parameters in Pichkari");
    }
	void display()
	{
		System.out.println("Pichakari details");
		System.out.println("Pichakari type: "+this.type);
		System.out.println("Pichakari color: " +this.color);
		System.out.println("The shooting range: " +this.range);
		System.out.println("Material: " +this.material);
		System.out.println("Cost pichkari: " +this.cost);
		System.out.println("Whether the Pichkari is environmentally friendly: " +this.is_eco_friendly);
	}
}