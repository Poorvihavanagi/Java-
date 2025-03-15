class Gun{
	
	String model;
    String caliber;
    int capacity;
    double weight;
    boolean isAutomatic;
    int range;
	
	Gun()
	{
        System.out.println("No-argument constructor in Gun\n");
    }

    Gun(String model) 
	{
        this.model = model;
        System.out.println("Constructor with String parameter in Gun\n");
    }

    Gun(String model, String caliber) 
	{
        this(model);
        this.caliber = caliber;
        System.out.println("Constructor with String, String parameters in Gun\n");
    }

    Gun(String model, String caliber, int capacity)
	{
        this(model, caliber);
        this.capacity = capacity;
        System.out.println("Constructor with String, String, int parameters in Gun\n");
    }

    Gun(String model, String caliber, int capacity, double weight) 
	{
        this(model, caliber, capacity);
        this.weight = weight;
        System.out.println("Constructor with String, String, int, double parameters in Gun\n");
    }

    Gun(String model, String caliber, int capacity, double weight, boolean isAutomatic) 
	{
        this(model, caliber, capacity, weight);
        this.isAutomatic = isAutomatic;
        System.out.println("Constructor with String, String, int, double, boolean parameters in Gun\n");
    }

    Gun(String model, String caliber, int capacity, double weight, boolean isAutomatic, int range)
	{
        this(model, caliber, capacity, weight, isAutomatic);
        this.range = range;
        System.out.println("Constructor with String, String, int, double, boolean, int parameters in Gun\n");
    }

    void display() 
	{
        System.out.println("Gun Details:");
        System.out.println("Model: " + this.model);
        System.out.println("Caliber: " + this.caliber);
        System.out.println("Capacity: " + this.capacity + " bullets");
        System.out.println("Weight: " + this.weight + " kg");
        System.out.println("Automatic: " + this.isAutomatic);
        System.out.println("Range: " + this.range + " meters");
    }
	
}