class Balloon{
	
	String color;
	int size;
	String shape;
	boolean burst;
	int count;
	String usage;
	
	Balloon(){
		
		System.out.println("No argument constructor in balloon");
	}
	
	Balloon(String color)
	{
		
		this.color=color;
		System.out.println("String no-argument const in balloon");
	}
	Balloon(String color,int size)
	{
		this.color=color;
		this.size=size;
		System.out.println("String,int, no-argument const in balloon");
	}
	Balloon(String color,int size,String shape)
	{
		this.color=color;
		this.size=size;
		this.shape=shape;
		System.out.println("String,int,String no-argument const in balloon");
	}
	Balloon(String color,int size,String shape,boolean burst)
	{
		this(color,size,shape);
		this.burst=burst;
		System.out.println("String,int,String,boolean, no-argument const in balloon");
	}
	Balloon(String color,int size,String shape,boolean burst,int count)
	{
		this(color,size,shape,burst);
		this.count=count;
		System.out.println("String,int,String,boolean,int, no-argument const in balloon");
	}
	Balloon(String color,int size,String shape,boolean burst,int count,String usage)
	{
		this(color,size,shape,burst,count);
		this.usage=usage;
		System.out.println("String,int,String,boolean,int,String, no-argument const in balloon\n");
	}
	void display()
	{
		System.out.println("Balloon details");
		System.out.println("Color: " +this.color);
		System.out.println("Size: " +this.size);
		System.out.println("Shape: " +this.shape);
		System.out.println("Indicating if the balloon has popped: " +this.burst);
		System.out.println("Number of balloons: " +this.count);
		System.out.println("Balloon usage: " +this.usage+ "\n");
	}
}