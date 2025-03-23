class Bucket{
	
	String material;
	String brand;
	int price;
	boolean is_heat_resistant;
	double weight;
	String lid_type;
	
	
	Bucket()
	{
		System.out.println("No-argument constructor in Bucket\n");
	}
	Bucket(String material)
	{
		this.material=material;
		System.out.println("String, No-argument constructor in Bucket\n");
	}
	Bucket(String material,String brand)
	{
		this.material=material;
		this.brand=brand;
		System.out.println("String, No-argument constructor in Bucket\n");
	}
	Bucket(String material,String brand,int price)
	{
		this.material=material;
		this.brand=brand;
		this.price=price;
		System.out.println("String,int, No-argument constructor in Bucket\n");
	}
	Bucket(String material,String brand,int price,boolean is_heat_resistant)
	{
		this(material,brand,price);
		this.is_heat_resistant=is_heat_resistant;
		System.out.println("String,int,String, No-argument constructor in Bucket\n");
	}
	Bucket(String material,String brand,int price,boolean is_heat_resistant,double weight)
	{
		this(material,brand,price,is_heat_resistant);
		this.weight=weight;
		System.out.println("String,int,String,boolean,double, No-argument constructor in Bucket\n" );
	}
	Bucket(String material,String brand,int price,boolean is_heat_resistant,double weight,String lid_type)
	{
		this(material,brand,price,is_heat_resistant,weight);
		this.lid_type=lid_type;
		System.out.println("String,int,String,boolean,double, No-argument constructor in Bucket\n");
	}
	void display()
	{
		System.out.println("Bucket details");
		System.out.println("Material: " + this.material);
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: ₹" + this.price);
        System.out.println("Heat Resistant: " + this.is_heat_resistant);
        System.out.println("Weight: " + this.weight + " kg");
        System.out.println("Lid Type: " + this.lid_type);
	}
}