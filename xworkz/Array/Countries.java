class Countries{
	
	public static void printCountries(String[] countries)
	{
		System.out.println("Printing Countries ending with 'a' and 'A': " );
		for(String country: countries){
			if(country.endsWith("a") || country.endsWith("A")){
				System.out.println(country);
			}
		}
			
	}
}