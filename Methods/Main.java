class Main{
	
	public static void main(String[]args)
	{
		System.out.println("Running Espresso");
		String name;
		long mobileno = 9353246898L;
		name= Espresso.mobileNo(mobileno);
		System.out.println("Assigned name : " +name);
		long mobileno1 = 6987451231L;
		name= Espresso.mobileNo(mobileno1);
		System.out.println("Assigned name : " +name);
		
		System.out.println("----------------------------------------");
		
		System.out.println("Running Company Information");
        String companyName = "Netflix";
        String ownerName = Espresso.getCompanyName(companyName);
        System.out.println("Assigned name: " + ownerName);
		String companyName1 = "Tesla";
        String ownerName1 = Espresso.getCompanyName(companyName1);
        System.out.println("Assigned name: " + ownerName1);
		
		System.out.println("----------------------------------------");
		
		System.out.println("Running Food Menu");
		String foodItem = "roti";
		double price = Espresso.getFoodPrice(foodItem);
		System.out.println("Price = " +price);
		
		System.out.println("----------------------------------------");
		
		long accNo = 1001002017L;
		double balance=Espresso.getAccountBalance(accNo);
		System.out.println("Bank Balance = " +balance);
		long accNo1 = 10010020L;
		double balance1=Espresso.getAccountBalance(accNo1);
		System.out.println("Bank Balance = " +balance1);
		
		System.out.println("----------------------------------------");
		
		System.out.println("Checking if person is alive");
		String personName="Priya";
		String status=Espresso.isAlive(personName);
		System.out.println(personName + " is " + status);
		
		System.out.println("----------------------------------------");
		
		System.out.println("Source Price");
		String sourceName="Shoe";
		double cost=Espresso.getSourcePrice(sourceName);
		System.out.println(sourceName + " price is " + cost);
		
	}

}