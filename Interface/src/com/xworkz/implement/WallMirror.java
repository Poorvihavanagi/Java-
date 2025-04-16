package com.xworkz.implement;

import com.xworkz.internal.Mirror;

public class WallMirror implements Mirror {
    public void reflect() {
        System.out.println("Reflecting image through the wall mirror.");
    }

    public void clean() {
        System.out.println("Cleaning the wall mirror with a cloth.");
    }

    public void hangOnWall() {
        System.out.println("Hanging the mirror on the wall securely.");
    }
}
