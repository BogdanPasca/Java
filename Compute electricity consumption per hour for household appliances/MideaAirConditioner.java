/**
 * Midea este un aer conditionat care consuma implicit 4 w atunci cand este pornit si nu este ales nici un program,
 * consuma doar ledul.
 * Midea are 2 functii/programe: 1. Cool care consuma 120w si 2.Heat care consuma 100w.
 * Pentru simplicitate, midea are predefinite programele cool si heat.
 * Programele nu se pot suprapune. Daca in timp ce ruleaza un program este ales al doilea program,
 * automat primul program se opreste si intra in functiune al doilea program.
 * De aceea nu este nevoie de CoolOFF si HeatOFf, se face automat la alegerea celui de al doilea program(in cazul in care primul functioneaza.
 */

package com.company;

public class MideaAirConditioner extends AirConditioner {
    private String serialNumber;
    private float consumptionPerHour;

    public MideaAirConditioner(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void cool() {
        if (this.consumptionPerHour == 4) {
            consumptionPerHour += 120;
            System.out.println("Cool mode on");

        } else if (this.consumptionPerHour == 104) {
            consumptionPerHour = 124;
            System.out.println("Cool mode on");
        }
    }

    @Override
    public void heat() {
        if (this.consumptionPerHour == 4) {
            consumptionPerHour += 100;
            System.out.println("Heat mode on");
        } else if (this.consumptionPerHour == 124) {
            consumptionPerHour = 104;
            System.out.println("Heat mode on");
        }
    }

    @Override
    public void start() {
        this.consumptionPerHour = 4;
        if (consumptionPerHour == 4) {
            System.out.println("Air conditioner on. Please choose a program");
        }
    }

    @Override
    public void stop() {
        if (consumptionPerHour == 4 || consumptionPerHour == 124 || consumptionPerHour == 104) {
            consumptionPerHour = 0;
            System.out.println("Air conditioner stopped");
        }
    }

    @Override
    public float getConsumptionPerHour() {
        return consumptionPerHour;
    }
}
