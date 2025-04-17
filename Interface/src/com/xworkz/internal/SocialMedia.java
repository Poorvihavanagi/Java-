package com.xworkz.internal;

public interface SocialMedia {
    void postContent();
    void likeContent();
    void comment();
    default void shareContent() {
        System.out.println("Sharing content on social media.");
    }

    default void blockUser() {
        System.out.println("Blocking user on social media.");
    }
}
