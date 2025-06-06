package com.xworkz.implement;

import com.xworkz.internal.Movie;

public class ActionMovie implements Movie {
    public void play() {
        System.out.println("Playing the action movie.");
    }

    public void pause() {
        System.out.println("Pausing the action movie.");
    }

    public void stop() {
        System.out.println("Stopping the action movie.");
    }
    @Override
    public void rewind() {
        System.out.println("Rewinding the action movie.");
    }

    @Override
    public void forward() {
        System.out.println("Fast forwarding the action movie.");
    }
}
