class PaperRunner{
	public static void main(String[] args)
	{
		String size="A4";
		Paper.capacity(size);
		
		boolean ecofriendly=true;
		Paper.usability(ecofriendly);
		
		double thickness=0.1;
		Paper.density(thickness);
		
		int count=2;
		char grade='N';
		Paper.fold(count, grade);
		
		int parts=4;
		String type="Bond Paper";
		Paper.pieces(parts,type);
		
		String text="Paper is a versatile, recyclable material.";
		int quantity=10;
		String color="Blue";
		Paper.print(text,quantity,color);
		
		int length=10;
		double width=15.5;
		String shape="Rectangle";
		Paper.modify(length,width,shape);
	}
}