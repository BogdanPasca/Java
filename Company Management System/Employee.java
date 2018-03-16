/**
 * Clasa Employee reprezinta angajatul din companie si are 3 proprietati:
 * @param name - numele angajatului
 * @param yearsSpentInCompany - vechimea in companie a angajatului
 * @param parkingSPace - care este boolean. True daca angajatul detine loc de parcare si fals daca angajatul nu detine loc de parcare
 */


package com.company.homeworkPart3;

public class Employee implements Comparable {
    private String name;
    private int yearsSpentInCompany;
    boolean parkingSpace;

    public Employee(String name, int yearsSpentInCompany, boolean parkingSpace) {
        this.name = name;
        this.yearsSpentInCompany = yearsSpentInCompany;
        this.parkingSpace = parkingSpace;
    }

    public String getName() {
        return name;
    }

    public int getYearsSpentInCompany() {
        return yearsSpentInCompany;
    }

    public boolean isParkingSpace() {
        return parkingSpace;
    }

    @Override
    public String toString() {
        return "\n" + name + ": " + yearsSpentInCompany + " years in company." + " Parking place: " + parkingSpace;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

