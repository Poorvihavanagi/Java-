class BakeryRunner{
	public static void main(String[] args){
		
		String item="Cake";
		int quantity=2;
		Bakery.buy(item,quantity);
		
		boolean value=true;
		Bakery.open(value);
		
		boolean result=false;
		Bakery.close(result);
		
		String name="Sakshi";
		Bakery.owner(name);
		
		String cashierName="Priya";
		Bakery.cashier(cashierName);
	}
}