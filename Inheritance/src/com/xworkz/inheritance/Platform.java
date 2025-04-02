package com.xworkz.inheritance;

public class Platform extends SocialMedia
{
    public void createPost() {
        super.createPost();
        System.out.println("Running create post in social media platform");
    }
    public void likePost() {
        super.likePost();
        System.out.println("Running like post in platform");
    }
    public void sharePost() {
        super.sharePost();
        System.out.println("Running share post in platform");
    }
    public void commentOnPost() {
        super.commentOnPost();
        System.out.println("Running comment on post in platform");
    }
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Running send message in platform");
    }
}
