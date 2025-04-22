package com.xworkz.practice.internal;

public class ConnectorImpl implements Connector{
    @Override
    public void run() {
        System.out.println("Running run in connector implementation from interface");
    }
}
