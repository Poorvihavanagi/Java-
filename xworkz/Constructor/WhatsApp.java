class WhatsApp
{
	long phoneNumber;
	boolean isOnline;
	String lastSeen;
	
	WhatsApp(long phoneNumber,boolean isOnline, String lastSeen){
		
		this.phoneNumber=phoneNumber;
		this.isOnline=isOnline;
		this.lastSeen=lastSeen;
		System.out.println("String parameter constructor in Whatsapp");
	}
}