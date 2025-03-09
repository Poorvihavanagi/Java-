class FoodItemRunner{
	
	public static void main(String[] args)
	{
		String name="Sakshi";
		FoodItem.owner(name);
		
		double amount=500.25;
		FoodItem.price(amount);
		
		boolean status=true;
		FoodItem.eat(status);
		
		boolean discount=false;
		char mode='H';
		FoodItem.buy(discount, mode);
		
		String foodName="Pizza";
		int serve=5;
		FoodItem.cook(foodName,serve);
		
		int quantity=3;
		boolean spicy=false;
		String store="Packed";
		FoodItem.consume(quantity,spicy,store);
		
		String date="2-02-2025";
		boolean isfrozened=true;
		String storage="Refrigerator";
		FoodItem.freshness(date,isfrozened,storage);
	}
}