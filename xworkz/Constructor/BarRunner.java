class BarRunner{
	public static void main(String... args)
	{
		String name = "The Whiskey Den";
		boolean isOpen = true;
		double rating = 4.5;
		
		Bar bar=new Bar(name,isOpen,rating);
		System.out.println("Name of the bar: " +bar.name);
		System.out.println("Is bar open?: " +bar.isOpen);
		System.out.println("Bar ratings: " +bar.rating);
		
		String name2 = "Sky Lounge";
        boolean isOpen2 = false;
        double rating2 = 4.8;
        Bar bar2 = new Bar(name2, isOpen2, rating2);
        System.out.println("Name of the bar: " + bar2.name);
        System.out.println("Is bar open?: " + bar2.isOpen);
        System.out.println("Bar ratings: " + bar2.rating + "\n");

        String name3 = "Ocean Breeze Bar";
        boolean isOpen3 = true;
        double rating3 = 4.2;
        Bar bar3 = new Bar(name3, isOpen3, rating3);
        System.out.println("Name of the bar: " + bar3.name);
        System.out.println("Is bar open?: " + bar3.isOpen);
        System.out.println("Bar ratings: " + bar3.rating + "\n");

        String name4 = "The Night Owl";
        boolean isOpen4 = false;
        double rating4 = 3.9;
        Bar bar4 = new Bar(name4, isOpen4, rating4);
        System.out.println("Name of the bar: " + bar4.name);
        System.out.println("Is bar open?: " + bar4.isOpen);
        System.out.println("Bar ratings: " + bar4.rating + "\n");

        String name5 = "Sunset Rooftop";
        boolean isOpen5 = true;
        double rating5 = 4.7;
        Bar bar5 = new Bar(name5, isOpen5, rating5);
        System.out.println("Name of the bar: " + bar5.name);
        System.out.println("Is bar open?: " + bar5.isOpen);
        System.out.println("Bar ratings: " + bar5.rating + "\n");
	}
}