package com.xworkz.classesAsInstanceVariable;

public class Pushpa
{
    void useClip(Clip[] clips){
        if(clips!=null){
            System.out.println("Using clip Pushpa");
            for(Clip clip: clips) {
                if (clip != null) {
                    clip.hold();
                    System.out.println("List of clips: " + clip.color);
                }
            }
        }else{
            System.out.println("No clips available");
        }
    }
}
