package com.xworkz.toString.internal;

public class Key {
    private String shapeCode;
    private String engraving;
    private String keyType;

    public Key(String shapeCode, String engraving, String keyType) {
        this.shapeCode = shapeCode;
        this.engraving = engraving;
        this.keyType = keyType;
    }

    @Override
    public String toString() {
        return "Key{" + "Shape Code='" + shapeCode + "'" + ", Engraving='" + engraving + "'" + ", Key Type='" + keyType + "'" + '}';
    }
}
