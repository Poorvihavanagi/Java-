class Customer{
	public static void buy(String vegetable,int quantity)
	{
		System.out.println("Customer is buying vegetable");
		Shop.sell(vegetable,quantity);
		System.out.println("vegetable: " + vegetable + " quantity: " + quantity);
	}
}