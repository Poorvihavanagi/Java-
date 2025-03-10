class Shop{
	public static void sell(String vegetable,int quantity)
	{
		System.out.println("Shop is selling vegetable");
		Agent.purchase(vegetable,quantity);
	}
}