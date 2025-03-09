class BeerRunner{
	public static void main(String[] args)
	{
		String brandname="Budweiser";
		Beer.brand(brandname);
		
		double level=4.5;
		Beer.content(level);
		
		boolean chilled=true;
		Beer.isChilled(chilled);
		
		int quantity=2;
		boolean foam=true;
		Beer.pour(quantity, foam);
		
		String item="Spicy Wings";
		String glass="mug";
		Beer.food(item,glass);
		
		String grainType="Barley";
		int time=14;
		boolean filetered=false;
		Beer.process(grainType,time,filetered);
		
		double discount=10.1;
		char pack='M';
		String retiler="Local Liquor Store";
		Beer.purchase(discount,pack,retiler);
	}
}