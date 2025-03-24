package com.demo.accessspecifiers;

public class Machine
{
    Robot robot = new Robot();

    public void display(){
        robot.model="RX-200";
        robot.type="Industrial";

        System.out.println("Machine controlling robot: " +robot.model);
        robot.work();
        robot.charge();
    }
}
