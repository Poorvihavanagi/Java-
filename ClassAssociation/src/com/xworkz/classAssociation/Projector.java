package com.xworkz.classAssociation;

public class Projector
{
    public void displayDetails(){
        Len len=new Len();
        len.setBrand("Nikon");
        System.out.println("Brand: " +len.getBrand());
        len.setPrice(4999.99);
        System.out.println("Price: " +len.getPrice());
        System.out.println("-------------------------------------");

        Lamp lamp=new Lamp();
        lamp.setMaterial("Metal");
        System.out.println("Lamp material: " +lamp.getMaterial());
        lamp.setColor("Black");
        System.out.println("Color: " +lamp.getColor());
        System.out.println("-------------------------------------");

        Button button = new Button();
        button.setShape("Round");
        button.setColor("Black");
        System.out.println("Shape: " + button.getShape());
        System.out.println("Color: " + button.getColor());
        System.out.println("-------------------------------------");

        Port port = new Port();
        port.setPortName("USB-C");
        port.setProtocol("USB 3.1");
        System.out.println("Port Name: " + port.getPortName());
        System.out.println("Protocol: " + port.getProtocol());
        System.out.println("-------------------------------------");

        Wire wire = new Wire();
        wire.setMaterial("Copper");
        wire.setLength(5);
        System.out.println("Material: " + wire.getMaterial());
        System.out.println("Length: " + wire.getLength() + " meters");
        System.out.println("-------------------------------------");

        Board board = new Board();
        board.setType("Circuit Board");
        board.setSize("12x8 inches");
        System.out.println("Type: " + board.getType());
        System.out.println("Size: " + board.getSize());
        System.out.println("-------------------------------------");

        Panel panel = new Panel();
        panel.setPanelTitle("Control Panel");
        panel.setHeight(24.5);
        System.out.println("Title: " + panel.getPanelTitle());
        System.out.println("Height: " + panel.getHeight() + " cm");
        System.out.println("-------------------------------------");

        Remote remote = new Remote();
        remote.setBrand("Samsung");
        remote.setRange(10);
        System.out.println("Brand: " + remote.getBrand());
        System.out.println("Range: " + remote.getRange() + " meters");
        System.out.println("-------------------------------------");

        Screw screw = new Screw();
        screw.setMaterial("Steel");
        screw.setLength(3);
        System.out.println("Material: " + screw.getMaterial());
        System.out.println("Length: " + screw.getLength() + " cm");
    }
}
