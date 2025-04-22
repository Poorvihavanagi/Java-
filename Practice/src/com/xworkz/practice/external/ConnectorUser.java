package com.xworkz.practice.external;

import com.xworkz.practice.internal.Connector;

public class ConnectorUser {
    private Connector connector;

    public ConnectorUser(Connector connector){
        this.connector=connector;
        System.out.println("Connector in connector user");
    }
    public void execute(){
        if(this.connector!=null){
            System.out.println("connector is not null constructor");
            this.connector.run();
        }
        else {
            System.out.println("It is null");
        }

    }
}

