class Chat{
	
	String messType;
	String content;
	int unreadMessageCount;
	
	Chat(String messType, String content, int unreadMessageCount)
	{
		this.messType=messType;
		this.content=content;
		this.unreadMessageCount=unreadMessageCount;
		System.out.println("String parameter constructor in Chat");
	}
}