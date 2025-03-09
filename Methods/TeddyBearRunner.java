class TeddyBearRunner{
	public static void main(String[] args){
		
		String furColor="Red";
		TeddyBear.color(furColor);
		
		int height=30;
		TeddyBear.size(height);
		
		boolean soft=true;
		TeddyBear.isSoft(soft);
		
		int time=10;
		boolean squeeze=true;
		TeddyBear.hug(time,squeeze);
		
		String childname="sakshi";
		String activity="Tea party";
		TeddyBear.play(childname,activity);
		
		String outfit="Red sweater";
		int length=15;
		boolean embroidered=false;
		TeddyBear.customize(outfit,length,embroidered);
		
		boolean giftWrapped=true;
		char label='M';
		String storeName="Toy store";
		TeddyBear.purchase(giftWrapped,label,storeName);
	}
}