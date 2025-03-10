class Station{
	public static void send( String name,int num1,int num2)
	{
		System.out.println("Running accept in station");
		//System.out.println("Addition = "+(num1+num2));
		DeliveryGuy.accept(name,num1,num2);
	}
}