class Beer{
	public static void brand(String beerType){
		System.out.println(beerType);
	}
	
	public static void content(double percent){
		System.out.println(percent);
	}
	
	public static void isChilled(boolean chilled){
		System.out.println(chilled);
	}
	
	public static void pour(int quantity, boolean hasFoam){
		System.out.println(quantity);
		System.out.println(hasFoam);
	}
	
	public static void food(String item, String glassType)
	{
		System.out.println(item);
		System.out.println(glassType);
	}
	
	public static void process(String type, int time, boolean filtered)
	{
		System.out.println(type);
		System.out.println(time);
		System.out.println(filtered);
	}
	
	public static void purchase(double discount,char packSize, String retailer)
	{
		System.out.println(discount);
		System.out.println(packSize);
		System.out.println(retailer);
	}
}