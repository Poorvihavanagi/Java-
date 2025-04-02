package com.xworkz.isaRelation;

import com.xworkz.inheritance.Platform;
import com.xworkz.inheritance.SocialMedia;

public class SocialMediaRunner
{
    public static void main(String[] args) {
        Platform platform = new Platform();
        platform.createPost();
        platform.likePost();
        platform.sharePost();
        platform.commentOnPost();
        platform.sendMessage();

        System.out.println("-------------------------------");

        SocialMedia socialMedia = new Platform();
        socialMedia.createPost();
        socialMedia.likePost();
        socialMedia.sharePost();
        socialMedia.commentOnPost();
        socialMedia.sendMessage();
    }
}
