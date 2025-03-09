class PostMaster{
	public static void deliver(String customerName, String address)
	{
		System.out.println("Post Master delivers mail");
	}
}

class PostHeadMaster{
	public static void deliver(String customerName,String address)
	{
		System.out.println("Post Head Master checks delivery");
		PostMaster.deliver(customerName, address);
	}
}

class RegionalPostOffice{
	public static void deliver(String customerName, String address)
	{
		System.out.println("Regional Post office processing dispatch");
		PostHeadMaster.deliver(customerName, address);
	}
}

class SubRegionalPostOffice{
	public static void deliver(String customerName,String address){
		System.out.println("Sub-Regional Post Office forwarding parcel");
		RegionalPostOffice.deliver(customerName,address);
	}
}

class AreaPostOffice{
	public static void deliver(String customerName,String address)
	{
		System.out.println("Area Post Office initiating dispatch ");
		SubRegionalPostOffice.deliver(customerName,address);
		System.out.println("Customer Name: " + customerName + " Address: " + address);
	}
}

class PostRunner{
	public static void main(String[] args)
	{
		String customerName="raksha";
		String address="123 Main";
		AreaPostOffice.deliver(customerName,address);
	}
}