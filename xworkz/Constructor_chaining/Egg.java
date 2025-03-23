class Egg
{
	
    
    String type;
    int size;
    boolean is_fertilized;
    String color;
    int weight;
    String shell_texture;

   
    Egg() {
        System.out.println("No-argument constructor in Egg\n");
    }

    
    Egg(String type) {
        this.type = type;
        System.out.println("Constructor with String parameter in Egg\n");
    }

   
    Egg(String type, int size) {
        this(type);
        this.size = size;
        System.out.println("Constructor with String, int parameters in Egg\n");
    }

   
    Egg(String type, int size, boolean is_fertilized) {
        this(type, size);
        this.is_fertilized = is_fertilized;
        System.out.println("Constructor with String, int, boolean parameters in Egg\n");
    }

    
    Egg(String type, int size, boolean is_fertilized, String color) {
        this(type, size, is_fertilized);
        this.color = color;
        System.out.println("Constructor with String, int, boolean, String parameters in Egg\n");
    }

   
    Egg(String type, int size, boolean is_fertilized, String color, int weight) {
        this(type, size, is_fertilized, color);
        this.weight = weight;
        System.out.println("Constructor with String, int, boolean, String, int parameters in Egg\n");
    }

    
    Egg(String type, int size, boolean is_fertilized, String color, int weight, String shell_texture)
	{
        this(type, size, is_fertilized, color, weight);
        this.shell_texture = shell_texture;
        System.out.println("Constructor with all parameters in Egg\n");
    }
	void display()
	{
		System.out.println("Egg details");
		System.out.println("The type of egg: " +this.type);
		System.out.println("The size category: " +this.size);
		System.out.println("Whether the egg is fertilized: " +this.is_fertilized);
		System.out.println("The shell color: " +this.color);
		System.out.println("The weight of the egg in grams: " +this.weight);
		System.out.println("The texture of the eggshell: " +this.shell_texture);
	}
	
}