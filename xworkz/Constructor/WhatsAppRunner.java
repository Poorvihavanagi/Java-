class WhatsAppRunner{
	
	public static void main(String... values)
	{
		long phoneNumber = 7418529631L;
        boolean isOnline = true;
        String lastSeen = "Today at 10:30 PM";
		
		WhatsApp whatsapp=new WhatsApp(phoneNumber,isOnline,lastSeen);
		System.out.println("Whatsapp phone number: "+whatsapp.phoneNumber);
		System.out.println("Whatsapp lastseen: " +whatsapp.lastSeen);
		System.out.println("Is user online?: " +whatsapp.isOnline+ "\n");
		
		long phoneNumber2 = 9876543210L;
		boolean isOnline2 = false;
		String lastSeen2 = "Yesterday at 8:15 AM";

		WhatsApp whatsapp2 = new WhatsApp(phoneNumber2, isOnline2, lastSeen2);
		System.out.println("WhatsApp phone number: " + whatsapp2.phoneNumber);
		System.out.println("WhatsApp last seen: " + whatsapp2.lastSeen);
		System.out.println("Is user online?: " + whatsapp2.isOnline + "\n");

		long phoneNumber3 = 1234567890L;
		boolean isOnline3 = true;
		String lastSeen3 = "Online now";

		WhatsApp whatsapp3 = new WhatsApp(phoneNumber3, isOnline3, lastSeen3);
		System.out.println("WhatsApp phone number: " + whatsapp3.phoneNumber);
		System.out.println("WhatsApp last seen: " + whatsapp3.lastSeen);
		System.out.println("Is user online?: " + whatsapp3.isOnline + "\n");

		long phoneNumber4 = 5556667778L;
		boolean isOnline4 = false;
		String lastSeen4 = "2 days ago";

		WhatsApp whatsapp4 = new WhatsApp(phoneNumber4, isOnline4, lastSeen4);
		System.out.println("WhatsApp phone number: " + whatsapp4.phoneNumber);
		System.out.println("WhatsApp last seen: " + whatsapp4.lastSeen);
		System.out.println("Is user online?: " + whatsapp4.isOnline + "\n");

		long phoneNumber5 = 9192939495L;
		boolean isOnline5 = true;
		String lastSeen5 = "Typing...";

		WhatsApp whatsapp5 = new WhatsApp(phoneNumber5, isOnline5, lastSeen5);
		System.out.println("WhatsApp phone number: " + whatsapp5.phoneNumber);
		System.out.println("WhatsApp last seen: " + whatsapp5.lastSeen);
		System.out.println("Is user online?: " + whatsapp5.isOnline + "\n");
	}
}