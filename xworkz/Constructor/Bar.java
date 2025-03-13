class Bar{
	
	String name;
	boolean isOpen;
	double rating; 
	
	Bar(String name,boolean isOpen, double rating){
		
		this.name=name;
		this.isOpen=isOpen;
		this.rating=rating;
		System.out.println("String parameter constructor in Bar");
	}
}