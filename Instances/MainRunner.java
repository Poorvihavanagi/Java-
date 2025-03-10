class IceCream{
	IceCream()
	{
		System.out.println("Icecream Instance created");
	}
}
class Animal{
	Animal()
	{
		System.out.println("Animal Instance created");
	}
}
class Train{
	Train()
	{
		System.out.println("Train Instance created");
	}
}
class Bridge{
	Bridge()
	{
		System.out.println("Bridge Instance created");
	}
}
class Sofa{
	Sofa()
	{
		System.out.println("Sofa Instance created");
	}
}

class MainRunner{
	public static void main(String[] args)
	{
		System.out.println("Creating 25 copies Explicitly");
		new IceCream(); new Animal(); new Train(); new Bridge(); new Sofa();
		new IceCream(); new Animal(); new Train(); new Bridge(); new Sofa();
		new IceCream(); new Animal(); new Train(); new Bridge(); new Sofa();
		new IceCream(); new Animal(); new Train(); new Bridge(); new Sofa();
		new IceCream(); new Animal(); new Train(); new Bridge(); new Sofa();
	}
}