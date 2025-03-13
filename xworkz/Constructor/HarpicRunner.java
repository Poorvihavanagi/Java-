class HarpicRunner{
	
	public static void main(String[] args)
	{
		String brand="Harpic Power Plus";
		String color="Blue";
		boolean isEcoFriendly=false;
		Harpic harpic=new Harpic(brand,color,isEcoFriendly);
		System.out.println("Harpic barnd: " +harpic.brand);
		System.out.println("Harpic color: "+harpic.color);
		System.out.println("Is harpic eco friendly: "+harpic.isEcoFriendly+ "\n");
		
		String brand2="Harpic Fresh";
		String color2="Green";
		boolean isEcoFriendly2=true;
		Harpic harpic2=new Harpic(brand2,color2,isEcoFriendly2);
		System.out.println("Harpic brand: " +harpic2.brand);
		System.out.println("Harpic color: "+harpic2.color);
		System.out.println("Is Harpic eco-friendly: "+harpic2.isEcoFriendly+ "\n");
		
		String brand3="Harpic Fresh";
		String color3="Green";
		boolean isEcoFriendly3=true;
		Harpic harpic3=new Harpic(brand3,color3,isEcoFriendly3);
		System.out.println("Harpic brand: " +harpic3.brand);
		System.out.println("Harpic color: "+harpic3.color);
		System.out.println("Is Harpic eco-friendly: "+harpic3.isEcoFriendly+ "\n");
		
		String brand4="Harpic Lavender Fresh";
		String color4="Purple";
		boolean isEcoFriendly4=true;
		Harpic harpic4=new Harpic(brand4,color4,isEcoFriendly4);
		System.out.println("Harpic brand: " +harpic4.brand);
		System.out.println("Harpic color: "+harpic4.color);
		System.out.println("Is Harpic eco-friendly: "+harpic4.isEcoFriendly+ "\n");
		
		String brand5="Harpic Disinfectant";
		String color5="Yellow";
		boolean isEcoFriendly5=true;
		Harpic harpic5=new Harpic(brand5,color5,isEcoFriendly5);
		System.out.println("Harpic brand: " +harpic5.brand);
		System.out.println("Harpic color: "+harpic5.color);
		System.out.println("Is Harpic eco-friendly: "+harpic5.isEcoFriendly+ "\n");
		
	}
}