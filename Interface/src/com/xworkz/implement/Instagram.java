package com.xworkz.implement;

import com.xworkz.internal.SocialMedia;

public class Instagram implements SocialMedia {
    public void postContent() {
        System.out.println("Posting a new photo on Instagram.");
    }

    public void likeContent() {
        System.out.println("Liking a photo on Instagram.");
    }

    public void comment() {
        System.out.println("Commenting on a post on Instagram.");
    }
    @Override
    public void shareContent() {
        System.out.println("Sharing content on Facebook.");
    }

    @Override
    public void blockUser() {
        System.out.println("Blocking user on Facebook.");
    }
}
