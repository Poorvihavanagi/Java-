package com.xworkz.runner;

import com.xworkz.internal.SocialMedia;
import com.xworkz.implement.Instagram;

public class SocialMediaRunner {
    public static void main(String[] args) {
        SocialMedia socialMedia = new Instagram();
        socialMedia.postContent();
        socialMedia.likeContent();
        socialMedia.comment();
    }
}
