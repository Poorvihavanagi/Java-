package com.xworkz.accessorsAndMutators;

public class IdCardService
{
    public void idCardType(IdCard[] idCards){
        System.out.println("Id card information....");
        for(IdCard cards: idCards) {
            if (cards != null) {
                System.out.println("Material: " + cards.getMaterial());
                System.out.println("Color: " + String.join(",",cards.getColor()));
                System.out.println("Weight: " + cards.getWeight());
                System.out.println("Designed By: " + cards.getDesignedBy());
            }
        }
    }

    public void initIdCardService(){
        IdCard[] idCard = new IdCard[3];

        idCard[0] = new IdCard();
        idCard[0].setMaterial("Plastic");
        idCard[0].setColor(new String[]{"Blue" , "White"});
        idCard[0].setWeight(12.5);
        idCard[0].setDesignedBy("Xworkz Designs");

        idCard[1] = new IdCard();
        idCard[1].setMaterial("Metal");
        idCard[1].setColor(new String[]{"Silver","Black"});
        idCard[1].setWeight(20.0);
        idCard[1].setDesignedBy("Alpha corp");

        idCard[2] = new IdCard();
        idCard[2].setMaterial("Paper");
        idCard[2].setColor(new String[]{"Green"});
        idCard[2].setWeight(5.0);
        idCard[2].setDesignedBy("EcoPrint");

        idCardType(idCard);
    }

}
