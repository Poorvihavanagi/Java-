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
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 500;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Key) {
                System.out.println("Ref is Key, will compare...");
                Key key1 = this;
                Key key2 = (Key) obj;
                if (key1.shapeCode.equals(key2.shapeCode) && key1.engraving.equals(key2.engraving) ) {
                    System.out.println("Both Keys are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
