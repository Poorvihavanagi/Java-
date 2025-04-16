package com.xworkz.runner;

import com.xworkz.internal.Newspaper;
import com.xworkz.implement.DailyNewspaper;

public class NewspaperRunner {
    public static void main(String[] args) {
        Newspaper newspaper = new DailyNewspaper();
        newspaper.read();
        newspaper.subscribe();
        newspaper.discard();
    }
}
