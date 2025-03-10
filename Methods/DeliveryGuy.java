class DeliveryGuy{
	public static void accept(String item,int num1,int num2)
	{
		System.out.println("Item = "+item);
		System.out.println("Running delivery guy");
		Courier.add(num1,num2);
	}
}