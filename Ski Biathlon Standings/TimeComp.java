package com.company;

import java.util.Comparator;

public class TimeComp implements Comparator<Athlete> {
    @Override
    public int compare(Athlete a1, Athlete a2 ){
        return a1.getSkiTimeResult().compareTo(a2.getSkiTimeResult());
    }
}
