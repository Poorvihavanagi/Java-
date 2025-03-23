class ChatRunner
{
	public static void main(String[] args)
	{
		String messType = "Text";
        String content = "Hello, how are you?";
        int unreadMessageCount = 3;

		Chat chat=new Chat(messType,content,unreadMessageCount);
		System.out.println("Message type: "+chat.messType);
		System.out.println("Content of the message: "+content);
		System.out.println("Number of unread messages: "+unreadMessageCount+ "\n");
		
		String messType2 = "Image";
        String content2 = "Sent a photo";
        int unreadMessageCount2 = 1;
        Chat chat2 = new Chat(messType2, content2, unreadMessageCount2);
        System.out.println("Message Type: " + chat2.messType);
        System.out.println("Content: " + chat2.content);
        System.out.println("Unread Messages: " + chat2.unreadMessageCount + "\n");
		
		String messType3 = "Video";
        String content3 = "Check out this video";
        int unreadMessageCount3 = 5;
        Chat chat3 = new Chat(messType3, content3, unreadMessageCount3);
        System.out.println("Message Type: " + chat3.messType);
        System.out.println("Content: " + chat3.content);
        System.out.println("Unread Messages: " + chat3.unreadMessageCount + "\n");
		
		String messType4 = "Audio";
        String content4 = "Sent a voice note";
        int unreadMessageCount4 = 2;
        Chat chat4 = new Chat(messType4, content4, unreadMessageCount4);
        System.out.println("Message Type: " + chat4.messType);
        System.out.println("Content: " + chat4.content);
        System.out.println("Unread Messages: " + chat4.unreadMessageCount + "\n");
		
		String messType5 = "Sticker";
        String content5 = "Sent a funny sticker";
        int unreadMessageCount5 = 0;
        Chat chat5 = new Chat(messType5, content5, unreadMessageCount5);
        System.out.println("Message Type: " + chat5.messType);
        System.out.println("Content: " + chat5.content);
        System.out.println("Unread Messages: " + chat5.unreadMessageCount + "\n");
	}
}