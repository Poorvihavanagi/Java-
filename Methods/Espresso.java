class Espresso{
	public static String mobileNo(long number)
	{
		System.out.println("The mobile number is : "+number);
        if (number == 9353246898L)
		{  
            return "Suraj";  			//implicit
        } 
		else if(number == 7975106351L)
		{
			return "Poorvi";
		}
		else if(number == 7019794018L)
		{
			return "Pragyna";
		}
		else if(number == 7895234516L)
		{
			return "raksha";
		}
		else if(number == 7513548951L)
		{
			return "vasuki";
		}
		else if(number == 7894561233L)
		{
			return "rakesh";
		}else if(number == 9448996612L)
		{
			return "ramesh";
		}
		else if(number == 8794561231L)	
		{
			return "rani";
		}
		else if(number == 9456871231L)
		{
			return "sujay";
		}
		else if(number == 6897541231L)
		{
			return "Tanu";
		}
		else if(number == 9448779955L)
		{
			return "rocky";
		}
		else if(number == 7512365468L)
		{
			return "keerti";
		}
		else if(number == 8745612391L)
		{
			return "rashi";
		}
		else if(number == 7456891321L)
		{
			return "nidhi";
		}
		else if(number == 8794123651L)
		{
			return "Alis";
		}
		else if(number == 7456891231L)
		{
			return "Roy";
		}
		else if(number == 8974561331L)
		{
			return "shravya";
		}
		else if(number == 9687451231L)
		{
			return "Meera";
		}
		else if(number == 8574961232L)
		{
			return "Priya";
		}
		else if(number == 6312549871L)
		{
			return "Ananya";
		}
		else if(number == 7418529632L)
		{
			return "ramya";
		}
		else if(number == 6987451231L)
		{
			return "shravana";
		}
		else if(number == 9445566712L)
		{
			return "navami";
		}	
		else{
			return "Not found";
		}
	}

	public static String getCompanyName(String companyName)
	{
		System.out.println("The company name: " +companyName);
		if(companyName == "Tesla")
		{
			String ownerName = "Elon Musk";  	//Explicit
			return ownerName;
		}
		else if(companyName == "Amazon")
		{
			String ownerName = "Jeff Bezos";  	
			return ownerName;
		}
		else if(companyName == "Microsoft")
		{
			String ownerName = "Bill gates";  	
			return ownerName;
		}
		else if(companyName == "Apple")
		{
			String ownerName = "Steve Jobs";  	
			return ownerName;
		}
		else if(companyName == "Google")
		{
			String ownerName = "Larry Page";  	
			return ownerName;
		}
		else if(companyName == "Facebook")
		{
			String ownerName = "Mark Zuckerberg";  	
			return ownerName;
		}
		else if(companyName == "Walmart")
		{
			String ownerName = "Sam Walton";  	
			return ownerName;
		}
		else if(companyName == "Mercedes-Benz")
		{
			String ownerName = "Karl Benz";  	
			return ownerName;
		}
		else if(companyName == "Oracle")
		{
			String ownerName = "Larry Ellison";  	
			return ownerName;
		}
		else if(companyName == "Dell")
		{
			String ownerName = "Michael Dell";  	
			return ownerName;
		}
		else if(companyName == "IBM")
		{
			String ownerName = "Charles Ranlett Flint";  	
			return ownerName;
		}
		else if(companyName == "Puma")
		{
			String ownerName = "Rudolf Dassler";  	
			return ownerName;
		}
		else
		{
			return "Not Found";
		}
	}
	
	public static double getFoodPrice(String foodItem)
	{
		System.out.println("Food Item: "+foodItem);
		if (foodItem == "Pizza")
		{
			return 120.00;
		}
		else if(foodItem == "Burger")
		{
			return 140.9;
		}
		else if(foodItem == "Pasta")
		{
			return 110.2;
		}
		else if(foodItem == "Idli")
		{
			return 30.0;
		}
		else if(foodItem == "Dosa")
		{
			return 45.5;
		}
		else if(foodItem == "Ice Cream")
		{
			return 50.00;
		}
		else if(foodItem == "Biryani")
		{
			return 145.00;
		}
		else if(foodItem == "Paratha ")
		{
			return 79.99;
		}
		else if(foodItem == "Momos")
		{
			return 50.00;
		}
		else if(foodItem == "Fries")
		{
			return 40.0;
		}
		else if(foodItem == "Sandwich")
		{
			return 59.99;
		}else if(foodItem == "Salad")
		{
			return 110.0;
		}
		else if(foodItem == "Paneer Tikka")
		{
			return 199.99;
		}
		else if(foodItem == "Samosa")
		{
			return 30.0;
		}
		else if(foodItem == "vada pav")
		{
			return 40.00;
		}
		else if(foodItem == "Pani Puri")
		{
			return 20.00;
		}
		else if(foodItem == "Pav Bhaji")
		{
			return 50.00;
		}
		else if(foodItem == "Dhokla")
		{
			return 80.0;
		}
		else if(foodItem == "Chicken Kalmi")
		{
			return 285.00;
		}
		else{
			return -1;		//Not found
		}
	}
	
	public static double getAccountBalance(long accountNo)
	{
		System.out.println("Account Number: "+accountNo);
		if(accountNo == 1001002001L)
		{
			return 50000.75;
		}
		else if(accountNo == 1001002002L)
		{
			return 152000.50;
		}
		else if(accountNo == 1001002004L)
		{
			return 98000.25;
		}
		else if(accountNo == 1001002005L)
		{
			return 65000.90;
		}
		else if(accountNo == 1001002006L)
		{
			return 87000.30;
		}
		else if(accountNo == 1001002007L)
		{
			return 910000.00;
		}
		else if(accountNo == 1001002008L)
		{
			return 250000.75;
		}
		else if(accountNo == 1001002008L)
		{
			return 350000.25;
		}else if(accountNo == 1001002010L)
		{
			return 134500.65;
		}
		else if(accountNo == 1001002011L)
		{
			return 740000.35;
		}
		else if(accountNo == 1001002012L)
		{
			return 56000.00;
		}
		else if(accountNo == 1001002013L)
		{
			return 215000.20;
		}
		else if(accountNo == 1001002014L)
		{
			return 305000.00;
		}
		else if(accountNo == 1001002015L)
		{
			return 215000.00;
		}
		else if(accountNo == 1001002016L)
		{
			return 78000.00;
		}
		else if(accountNo == 1001002017L)
		{
			return 405000.00;
		}
		else if(accountNo == 1001002018L)
		{
			return 12700.00;
		}
		else
		{
			return -1.0;
		}
	}
	
	public static String isAlive(String name)
	{
		System.out.println("Name: "+name);
		if(name == "Suraj")
		{
			return "alive";
		}
		else if(name == "sakshi")
		{
			return "alive";
		}
		else if(name == "Priya")
		{
			return "alive";
		}
		else if(name == "Krishna")
		{
			return "alive";
		}
		else if(name == "Poorvi")
		{
			return "alive";
		}
		else if(name == "Sita")
		{
			return "alive";
		}
		else if(name == "Meera")
		{
			return "alive";
		}
		else if(name == "Leela")
		{
			return "alive";
		}
		else
		{
			return "Not alive";
		}
	}
	
	public static double getSourcePrice(String source)
	{
		System.out.println("Source is: " +source);
		if(source == "T-Shirt")
		{
			return 500.00;
		}
		else if(source == "Jeans")
		{
			return 1450.20;
		}
		else if(source == "jacket")
		{
			return 1500.00;
		}
		else if(source == "sweater")
		{
			return 1200.25;
		}
		else if(source == "Sneakers")
		{
			return 2000.00;
		}
		else if(source == "Sandals")
		{
			return 3000.30;
		}
		else if(source == "heels")
		{
			return 1000.00;
		}
		else if(source == "Sunglasses")
		{
			return 250.00;
		}
		else if(source == "scarf")
		{
			return 200.25;
		}
		else if(source == "bracelet")
		{
			return 350.20;
		}
		else if(source == "Earrings")
		{
			return 400.00;
		}
		else if(source == "Perfume")
		{
			return 1100.0;
		}
		else if(source == "cap")
		{
			return 400.0;
		}
		else if(source == "belt")
		{
			return 600.00;
		}
		else if(source == "Saree")
		{
			return 1800.00;
		}
		else if(source == "hair clip")
		{
			return 50.25;
		}
		else if(source == "makeup")
		{
			return 1000.00;
		}
		else if(source == "anklet")
		{
			return 150.00;
		}
		else if(source == "bangel")
		{
			return 302.25;
		}
		else if(source == "Wallet")
		{
			return 700.00;
		}
		else{
			return -1;		//not found
		}
	}
}
