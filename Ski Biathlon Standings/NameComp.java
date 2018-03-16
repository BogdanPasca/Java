package com.company;

import java.util.Comparator;

public class NameComp implements Comparator<Athlete> {

    @Override
    public int compare(Athlete a1, Athlete a2) {

        return a1.getAthleteName().compareTo(a2.getAthleteName());
    }
}
