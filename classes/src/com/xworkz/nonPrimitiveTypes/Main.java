package com.xworkz.nonPrimitiveTypes;

public class Main {

    public static void main(String... args)
    {
        System.out.println("Shop display");
        Shop shop = new Shop();
        shop.ads(new Display());
        shop.ads(null);

        System.out.println("Theater and poster");
        Theater theater = new Theater();
        theater.show(new Poster());
        theater.show(null);

        System.out.println("RCB and Player");
        RCB rcb = new RCB();
        rcb.match(new Player());
        rcb.match(null);

        System.out.println("Space and Planet ");
        Space space = new Space();
        space.explore(new Planet());
        space.explore(null);

        System.out.println("Rocket and Fuel");
        Rocket rocket = new Rocket();
        rocket.launch(new Fuel());
        rocket.launch(null);

        System.out.println("Dolo650 and Patient ");
        Dolo650 dolo = new Dolo650();
        dolo.giveTo(new Patient());
        dolo.giveTo(null);

        System.out.println("Barber and Customer");
        Barber barber = new Barber();
        barber.cutHair(new Customer());
        barber.cutHair(null);

        System.out.println(" Camera and Photographer ");
        Camera camera = new Camera();
        camera.click(new Photographer());
        camera.click(null);

        System.out.println(" Mango and Farmer");
        Mango mango = new Mango();
        mango.pickBy(new Farmer());
        mango.pickBy(null);

        System.out.println("Pillow and Sleeper ");
        Pillow pillow = new Pillow();
        pillow.support(new Sleeper());
        pillow.support(null);
    }
}
