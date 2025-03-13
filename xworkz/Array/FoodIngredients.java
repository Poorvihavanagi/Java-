class FoodIngredients{
	
	public static void getIngredients(String foodItem)
	{
		if(foodItem.equals("Pizza"))
		{
			System.out.println("Ingredients for pizza: ");
			System.out.println("Flour, Tomato Sauce, Cheese, Olive Oil, Yeast");
		}
		else if(foodItem.equals("Pasta"))
		{
			System.out.println("Ingredients for Pasta: ");
			System.out.println("Pasta, Olive Oil, Garlic, Tomato Sauce, Parmesan");
		}
		else if(foodItem.equals("Briyani"))
		{
			System.out.println("Ingredients for Biryani: ");
			System.out.println("Basmati Rice, Chicken, Yogurt, Spices, Onion, Tomato, Ghee");
		}
		else if(foodItem.equals("Sandwich"))
		{
			System.out.println("Ingredients for Sandwich: ");
			System.out.println("Bread, Butter, Lettuce, Cheese, Tomato");
		}
		else if(foodItem.equals("Pani Puri"))
		{
			System.out.println("Ingredients for Pani puri: ");
			System.out.println("Semolina, Flour, Potato, Chickpeas, Spices, Tamarind, Mint Water");
		}
	}
}