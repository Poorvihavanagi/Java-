package com.xworkz.runner;

import com.xworkz.implement.OfficeChair;
import com.xworkz.internal.Chair;

public class ChairRunner {
    public static void main(String[] args) {
        Chair chair=new OfficeChair();
        chair.sit();
        chair.adjustHeight();
        chair.rotate();

        chair.clean();
        chair.fold();
    }
}
