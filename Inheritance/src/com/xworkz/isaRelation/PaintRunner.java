package com.xworkz.isaRelation;

import com.xworkz.inheritance.Coating;
import com.xworkz.inheritance.Paint;

public class PaintRunner {
    public static void main(String[] args) {

        Paint paint = new Paint();
        paint.apply();
        paint.dry();
        paint.checkQuality();
        paint.remove();
        paint.protectSurface();

        System.out.println("-----------------------------------------------");
        Coating coating = new Paint();
        coating.apply();
        coating.dry();
        coating.checkQuality();
        coating.remove();
        coating.protectSurface();
    }
}
