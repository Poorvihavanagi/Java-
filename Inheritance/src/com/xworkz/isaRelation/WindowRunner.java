package com.xworkz.isaRelation;

import com.xworkz.inheritance.Window;
import com.xworkz.inheritance.GlassWindow;

public class WindowRunner {
    public static void main(String[] args) {

        GlassWindow glassWindow = new GlassWindow();
        glassWindow.open();
        glassWindow.close();
        glassWindow.clean();
        glassWindow.lock();
        glassWindow.checkMaterial();

        System.out.println("-------------------------------------------------------------------------");
        Window window = new GlassWindow();
        window.open();
        window.close();
        window.clean();
        window.lock();
        window.checkMaterial();
    }
}
