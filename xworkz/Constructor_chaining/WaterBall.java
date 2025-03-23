class WaterBall{
	
	String color;
	boolean is_reusable;
	int cost;
	String material;
	double weight;
	int size;
	
	WaterBall()
	{
		System.out.println("No-argument constructor in WaterBall\n");
	}
	WaterBall(String color)
	{
		this.color=color;
		System.out.println("Constructor with String parameters in WaterBall\n");
	}
	WaterBall(String color,boolean is_reusable)
	{
		this.color=color;
		this.is_reusable=is_reusable;
		System.out.println("Constructor with String,boolean parameters in waterBall\n");
	}
	WaterBall(String color,boolean is_reusable,int cost)
	{
		this.color=color;
		this.is_reusable=is_reusable;
		this.cost=cost;
		System.out.println("Constructor with String,boolean,int, parameters in waterBall\n");
	}
	WaterBall(String color,boolean is_reusable,int cost,String material)
	{
		this(color,is_reusable,cost);
		this.material=material;
		System.out.println("Constructor with String,boolean,int,String, parameters in waterBall\n");
	}
	WaterBall(String color,boolean is_reusable,int cost,String material,double weight)
	{
		this(color,is_reusable,cost,material);
		this.weight=weight;
		System.out.println("Constructor with String,boolean,int,String,double, parameters in waterBall\n");
	}
	WaterBall(String color,boolean is_reusable,int cost,String material,double weight,int size)
	{
		this(color,is_reusable,cost,material,weight);
		this.size=size;
		System.out.println("Constructor with String,boolean,int,String,double,int, parameters in waterBall\n");
	}
	void display()
	{
		System.out.println("WaterBall details");
		System.out.println("Color: " +this.color);
		System.out.println("Is waterball reusable? " +this.is_reusable);
		System.out.println("Cost: " +this.cost);
		System.out.println("Material: " +this.material);
		System.out.println("Weight: " +this.weight);
		System.out.println("Size: " +this.size+"\n");
	}
}