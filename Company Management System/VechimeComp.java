/**
 * Acesta este un comparator definit pentru vechimea in companie.
 * Atunci cand este accesat, sorteaza persoanele din lista dupa anii petrecuti in companie.
 */

package com.company.homeworkPart3;
import java.util.Comparator;

public class VechimeComp implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getYearsSpentInCompany() > o2.getYearsSpentInCompany()) {
            return 1;
        } else {
            return -1;
        }
    }
}

