class RoadRunner
{
	public static void main(String[] args)
	{
		
		Road road = new Road();
        road.lanes = 4;
        road.type = "Highway";
        road.location = "Mumbai-Pune Expressway";
        road.isOneWay = false;
        System.out.println("Number of lanes on road: " +road.lanes);
		System.out.println("Road type or name: " +road.type);
		System.out.println("Road location: " +road.location);
		System.out.println("Is road one way?: " +road.isOneWay);
		System.out.println("-------------------------------------");
		
		road = new Road();
        road.lanes = 2;
        road.type = "Street";
        road.location = "MG Road, Bangalore";
        road.isOneWay = true;
        System.out.println("Number of lanes on road: " +road.lanes);
		System.out.println("Road type or name: " +road.type);
		System.out.println("Road location: " +road.location);
		System.out.println("Is road one way?: " +road.isOneWay);
		System.out.println("-------------------------------------");

        road = new Road();
        road.lanes = 6;
        road.type = "Expressway";
        road.location = "Delhi-Meerut Expressway";
        road.isOneWay = false;
        System.out.println("Number of lanes on road: " +road.lanes);
		System.out.println("Road type or name: " +road.type);
		System.out.println("Road location: " +road.location);
		System.out.println("Is road one way?: " +road.isOneWay);
		System.out.println("-------------------------------------");

        road = new Road();
        road.lanes = 3;
        road.type = "Avenue";
        road.location = "Marine Drive, Mumbai";
        road.isOneWay = true;
        System.out.println("Number of lanes on road: " +road.lanes);
		System.out.println("Road type or name: " +road.type);
		System.out.println("Road location: " +road.location);
		System.out.println("Is road one way?: " +road.isOneWay);
		System.out.println("-------------------------------------");

        road = new Road();
        road.lanes = 8;
        road.type = "National Highway";
        road.location = "NH-44 (Delhi to Kanyakumari)";
        road.isOneWay = false;
        System.out.println("Number of lanes on road: " +road.lanes);
		System.out.println("Road type or name: " +road.type);
		System.out.println("Road location: " +road.location);
		System.out.println("Is road one way?: " +road.isOneWay);
		System.out.println("-------------------------------------");

        road = new Road();
        road.lanes = 2;
        road.type = "Rural Road";
        road.location = "Village Road, Rajasthan";
        road.isOneWay = false;
        System.out.println("Number of lanes on road: " +road.lanes);
		System.out.println("Road type or name: " +road.type);
		System.out.println("Road location: " +road.location);
		System.out.println("Is road one way?: " +road.isOneWay);
		System.out.println("-------------------------------------");

        road = new Road();
        road.lanes = 6;
        road.type = "Ring Road";
        road.location = "Outer Ring Road, Hyderabad";
        road.isOneWay = false;
        System.out.println("Number of lanes on road: " +road.lanes);
		System.out.println("Road type or name: " +road.type);
		System.out.println("Road location: " +road.location);
		System.out.println("Is road one way?: " +road.isOneWay);
		System.out.println("-------------------------------------");

        road = new Road();
        road.lanes = 1;
        road.type = "Ghat Road";
        road.location = "Sikkim Mountain Road";
        road.isOneWay = true;
        System.out.println("Number of lanes on road: " +road.lanes);
		System.out.println("Road type or name: " +road.type);
		System.out.println("Road location: " +road.location);
		System.out.println("Is road one way?: " +road.isOneWay);
		System.out.println("-------------------------------------");

        road = new Road();
        road.lanes = 2;
        road.type = "Toll Road";
        road.location = "Yamuna Expressway, UP";
        road.isOneWay = false;
        System.out.println("Number of lanes on road: " +road.lanes);
		System.out.println("Road type or name: " +road.type);
		System.out.println("Road location: " +road.location);
		System.out.println("Is road one way?: " +road.isOneWay);
		System.out.println("-------------------------------------");

        road = new Road();
        road.lanes = 5;
        road.type = "Flyover";
        road.location = "Electronic City Flyover, Bangalore";
        road.isOneWay = false;
        System.out.println("Number of lanes on road: " +road.lanes);
		System.out.println("Road type or name: " +road.type);
		System.out.println("Road location: " +road.location);
		System.out.println("Is road one way?: " +road.isOneWay);
	}
}