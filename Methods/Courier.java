class Courier{
	public static void pickUp(String item,int num,int num1)
	{
		System.out.println("Running station in courier");
		Station.send(item,num,num1);
		
	}
	public static void add(int num1,int num2)
	{
		System.out.println("Sum = "+(num1+num2));
		
	}
	
}