class FestivalRunner{
	 public static void main(String[] args) {
        String name="Diwali";
		String date="20/11/2024";
		int duration=3;
		Festival festival = new Festival(name,date,duration);
		System.out.println("Festival name: "+festival.name);
		System.out.println("Date of Festival: "+festival.date);
		System.out.println("Duration: "+festival.duration+ "\n");
		
		String name1="Holi";
		String date1="14/03/2025";
		int duration1=2;
		Festival festival1 = new Festival(name1,date1,duration1);
		System.out.println("Festival name: "+festival1.name);
		System.out.println("Date of Festival: "+festival1.date);
		System.out.println("Duration: "+festival1.duration+ "\n");
		
		String name2="Christmas";
		String date2="25/12/2024";
		int duration2=1;
		Festival festival2 = new Festival(name2,date2,duration);
		System.out.println("Festival2 name: "+festival2.name);
		System.out.println("Festival2 name: "+festival2.date);
		System.out.println("Festival2 name: "+festival2.duration+ "\n");
		
		String name3 = "Navratri";
        String date3 = "26/09/2024";
        int duration3 = 9;
        Festival festival3 = new Festival(name3, date3, duration3);
        System.out.println("Festival3 Name: " + festival3.name);
        System.out.println("Date of Festival: " + festival3.date);
        System.out.println("Duration: " + festival3.duration + " days\n");
		
		String name4 = "Eid";
        String date4 = "10/04/2024";
        int duration4 = 1;
        Festival festival4 = new Festival(name4, date4, duration4);
        System.out.println("Festival Name: " + festival4.name);
        System.out.println("Date of Festival: " + festival4.date);
        System.out.println("Duration: " + festival4.duration + " days\n");
		
	   
	   
    }
}