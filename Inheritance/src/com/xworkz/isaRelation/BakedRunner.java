package com.xworkz.isaRelation;

import com.xworkz.inheritance.Baked;
import com.xworkz.inheritance.Cookie;

public class BakedRunner {
    public static void main(String[] args) {

        Cookie cookie = new Cookie();
        cookie.prepare();
        cookie.bake();
        cookie.coolDown();
        cookie.pack();
        cookie.serve();

        System.out.println("-----------------------------------------------------");
        Baked baked = new Cookie();
        baked.prepare();
        baked.bake();
        baked.coolDown();
        baked.pack();
        baked.serve();
    }
}
