/**
 * Clasa Company are ca si proprietate :
 * @param name - numele companiei
 * Aceasta companie are 4 tipuri de angajati:
 * @param juniorWebDev - lista cu junior web developer;
 * @param seniorWebDev - lista cu senior web developer;
 * @param juniorAndroidDev - lista cu junior android developer;
 * @param seniorAndroidDev - lista cu senior android developer;
 *
 */

package com.company.homeworkPart3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Employee> juniorWebDev = new ArrayList<Employee>();
    private List<Employee> seniorWebDev = new ArrayList<Employee>();
    private List<Employee> juniorAndroidDev = new ArrayList<Employee>();
    private List<Employee> seniorAndroidDev = new ArrayList<Employee>();

    public Company(String name, List<Employee> juniorWebDev, List<Employee> seniorWebDev, List<Employee> juniorAndroidDev, List<Employee> seniorAndroidDev) {
        this.name = name;
        this.juniorWebDev = juniorWebDev;
        this.seniorWebDev = seniorWebDev;
        this.juniorAndroidDev = juniorAndroidDev;
        this.seniorAndroidDev = seniorAndroidDev;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getJuniorWebDev() {
        return juniorWebDev;
    }

    public List<Employee> getSeniorWebDev() {
        return seniorWebDev;
    }

    public List<Employee> getJuniorAndroidDev() {
        return juniorAndroidDev;
    }

    public List<Employee> getSeniorAndroidDev() {
        return seniorAndroidDev;
    }

    @Override
    public String toString() {
        return
                "Company name: " + name +
                        "\nemployees of company:"
                        + "\n\n====Junior web developer:" + juniorWebDev + "\n\n====Senior web developer" + seniorWebDev
                        + "\n\n====Junior android developer" + juniorAndroidDev + "\n\n==== Senior web developer" + seniorAndroidDev;
    }

}



