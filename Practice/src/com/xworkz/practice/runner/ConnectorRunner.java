package com.xworkz.practice.runner;

import com.xworkz.practice.external.ConnectorUser;
import com.xworkz.practice.internal.Connector;
import com.xworkz.practice.internal.ConnectorImpl;

public class ConnectorRunner {
    public static void main(String[] args) {
        Connector connector=new ConnectorImpl();
        ConnectorUser connectorUser=new ConnectorUser(connector);
        connectorUser.execute();
    }
}
