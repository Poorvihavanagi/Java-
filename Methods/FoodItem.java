class FoodItem{
	
	public static void owner(String name){
		System.out.println(name);
	}
	
	public static void price(double amount)
	{
		System.out.println(amount);
	}
	
	public static void eat(boolean status)
	{
		System.out.println(status);
	}
	
	public static void buy(boolean discount,char delivery_mode)
	{
		System.out.println(discount);
		System.out.println(delivery_mode);
	}
	
	public static void cook(String foodName, int serving)
	{
		System.out.println(foodName);
		System.out.println(serving);
	}	
	
	public static void consume(int quantity, boolean spicy, String store)
	{
		System.out.println(quantity);
		System.out.println(spicy);
		System.out.println(store);
	}
	
	public static void freshness(String expireDate, boolean frozen, String storage)
	{
		System.out.println(expireDate);
		System.out.println(frozen);
		System.out.println(storage);
	}
}