class Agent{
	public static void purchase(String vegetable,int quantity)
	{
		System.out.println("Agent is purchasing vegetables");
		Broker.brokerage(vegetable,quantity);
	}
}