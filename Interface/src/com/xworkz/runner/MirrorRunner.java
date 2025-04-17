package com.xworkz.runner;

import com.xworkz.internal.Mirror;
import com.xworkz.implement.WallMirror;

public class MirrorRunner {
    public static void main(String[] args) {
        Mirror mirror = new WallMirror();
        mirror.reflect();
        mirror.clean();
        mirror.hangOnWall();
        mirror.polish();
    }
}
