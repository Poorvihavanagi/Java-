class MagnetRunner{
	public static void main(String... values)
	{
		String shape="Disc";
		String color="Black";
		double weight=0.15;
		Magnet magnet=new Magnet(shape,color,weight);
		System.out.println("Shape of the magnet: "+magnet.shape);
		System.out.println("Color of the magnet: " +magnet.color);
		System.out.println("Weight of the magnet in grams: "+magnet.weight+ "\n");
		
		String shape2 = "Bar";
        String color2 = "Silver";
        double weight2 = 50.0;

        Magnet magnet2 = new Magnet(shape2, color2, weight2);
        System.out.println("Shape of the magnet: " + magnet2.shape);
        System.out.println("Color of the magnet: " + magnet2.color);
        System.out.println("Weight of the magnet in grams: " + magnet2.weight + "\n");

        String shape3 = "Ring";
        String color3 = "Gray";
        double weight3 = 30.5;

        Magnet magnet3 = new Magnet(shape3, color3, weight3);
        System.out.println("Shape of the magnet: " + magnet3.shape);
        System.out.println("Color of the magnet: " + magnet3.color);
        System.out.println("Weight of the magnet in grams: " + magnet3.weight + "\n");

        String shape4 = "Cylinder";
        String color4 = "Red";
        double weight4 = 75.2;

        Magnet magnet4 = new Magnet(shape4, color4, weight4);
        System.out.println("Shape of the magnet: " + magnet4.shape);
        System.out.println("Color of the magnet: " + magnet4.color);
        System.out.println("Weight of the magnet in grams: " + magnet4.weight + "\n");

        String shape5 = "Horseshoe";
        String color5 = "Blue";
        double weight5 = 120.0;

        Magnet magnet5 = new Magnet(shape5, color5, weight5);
        System.out.println("Shape of the magnet: " + magnet5.shape);
        System.out.println("Color of the magnet: " + magnet5.color);
        System.out.println("Weight of the magnet in grams: " + magnet5.weight + "\n");
	}
}