class ChainRunner{
	
	public static void main(String[] args)
	{
		String material = "Silver";
        double weight = 25.5;   
        boolean isAdjustable = true;
		Chain chain = new Chain(material,weight,isAdjustable);
		System.out.println("Chain material: " +chain.material);
		System.out.println("Chain weight: " +chain.weight);
		System.out.println("is chain adjustable?: " +chain.isAdjustable+ "\n");
		
		String material2 = "Gold";
        double weight2 = 30.0;   
        boolean isAdjustable2 = false;
        Chain chain2 = new Chain(material2, weight2, isAdjustable2);
        System.out.println("Chain material: " + chain2.material);
        System.out.println("Chain weight: " + chain2.weight);
        System.out.println("Is chain adjustable?: " + chain2.isAdjustable + "\n");

        String material3 = "Platinum";
        double weight3 = 40.5;   
        boolean isAdjustable3 = true;
        Chain chain3 = new Chain(material3, weight3, isAdjustable3);
        System.out.println("Chain material: " + chain3.material);
        System.out.println("Chain weight: " + chain3.weight);
        System.out.println("Is chain adjustable?: " + chain3.isAdjustable + "\n");

        String material4 = "Steel";
        double weight4 = 20.8;   
        boolean isAdjustable4 = false;
        Chain chain4 = new Chain(material4, weight4, isAdjustable4);
        System.out.println("Chain material: " + chain4.material);
        System.out.println("Chain weight: " + chain4.weight);
        System.out.println("Is chain adjustable?: " + chain4.isAdjustable + "\n");

        String material5 = "Titanium";
        double weight5 = 35.2;   
        boolean isAdjustable5 = true;
        Chain chain5 = new Chain(material5, weight5, isAdjustable5);
        System.out.println("Chain material: " + chain5.material);
        System.out.println("Chain weight: " + chain5.weight);
        System.out.println("Is chain adjustable?: " + chain5.isAdjustable + "\n");
	}
}