package com.xworkz.practice.runner;

import com.xworkz.practice.external.SportsLeague;
import com.xworkz.practice.internal.MatchScheduling;
import com.xworkz.practice.internal.NBA_ScheduleImpl;

public class MatchSchedulingRunner {
    public static void main(String[] args) {
        MatchScheduling matchScheduling=new NBA_ScheduleImpl();
        SportsLeague sportsLeague=new SportsLeague(matchScheduling);
        sportsLeague.schedulePlayoffs();
    }
}
