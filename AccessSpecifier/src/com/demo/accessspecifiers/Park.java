package com.demo.accessspecifiers;
import com.demo.accessspecifiers.Park;
public class Park
{
    Tree tree = new Tree();

    public void display(){
        tree.type="Oak";
        tree.color="Green";

        System.out.println("Tree in the park");
        tree.grow();
        tree.provideShade();
    }
}
