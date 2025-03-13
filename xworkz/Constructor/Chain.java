class Chain{
	
	String material;
	double weight;
	boolean isAdjustable;
	
	Chain(String material, double weight, boolean isAdjustable){
		
		this.material=material;
		this.weight=weight;
		this.isAdjustable=isAdjustable;
		System.out.println("String parameter constructor in Chain");
	}
}