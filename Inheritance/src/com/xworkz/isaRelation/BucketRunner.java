package com.xworkz.isaRelation;

import com.xworkz.inheritance.Bucket;
import com.xworkz.inheritance.Tool;

public class BucketRunner
{
    public static void main(String[] args) {

        Tool tool=new Tool();
        tool.fill();
        tool.empty();
        tool.checkWaterLevel();
        tool.carry();
        tool.clean();

        Bucket bucket=new Tool();
        bucket.fill();
        bucket.empty();
        bucket.checkWaterLevel();
        bucket.carry();
        bucket.clean();

    }
}
