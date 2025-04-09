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
}
