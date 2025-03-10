class Broker{
	public static void brokerage(String vegetable,int quantity)
	{
		System.out.println("Broker is handling vegetables");
		Farmer.farm(vegetable,quantity);
	}
}