package com.xworkz.toString.internal;

public class Keyboard {
    private String layout;
    private int keyCount;
    private String languageSupport;

    public Keyboard(String layout, int keyCount, String languageSupport) {
        this.layout = layout;
        this.keyCount = keyCount;
        this.languageSupport = languageSupport;
    }

    @Override
    public String toString() {
        return "Keyboard{Layout='" + layout + "', Key Count=" + keyCount + ", Language Support='" + languageSupport + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 550;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Keyboard) {
                System.out.println("Ref is Keyboard, will compare...");
                Keyboard keyboard1 = this;
                Keyboard keyboard2 = (Keyboard) obj;
                if (keyboard1.layout.equals(keyboard2.layout) && keyboard1.keyCount == keyboard2.keyCount) {
                    System.out.println("Both Keyboards are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
