package com.xworkz.inheritance;

public class Platform extends SocialMedia {

    @Override
    public void createPost() {
        super.createPost();
        System.out.println("Running create post in social media platform");
    }

    @Override
    public void likePost() {
        super.likePost();
        System.out.println("Running like post in platform");
    }

    @Override
    public void sharePost() {
        super.sharePost();
        System.out.println("Running share post in platform");
    }

    @Override
    public void commentOnPost() {
        super.commentOnPost();
        System.out.println("Running comment on post in platform");
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Running send message in platform");
    }
}
