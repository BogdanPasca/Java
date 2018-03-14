/**
 * Masina asta de spalat consuma atunci cand doar este pornita 3w /ora,
 * consuma doar ledurile pentru ca nu este ales nici un program
 * Este o masina simpla, clientul nu poate selecta temperatura, fiecare program are o temperatura presetata din fabrica.
 * Masina are 5 programe care nu se suprapun, se poate alege doar unul o data.
 * Daca un program este in functiune, pentru a selecta alt program trebuie repornita masina de spalat.(asa este si la masina mea de spalat)
 * Masina asta miele e de 20 ani, nu are buton de pauza.
 * 1. quick wash consuma 40w ora
 * 2. mixt wash consuma 50 w ora
 * 3. cotton wash consuma 100w pe ora (pt ca e temperatura mai mare implicit in acest program)
 * 4.delicate wash consuma 30w.
 * (p.s  nu ma pricep la electricitate, am pus valorile asa doar)
 */


package com.company;

public class MieleWashingMachine extends WashingMachine {
    private String serialNumber;
    private float consumptionPerHour;

    public MieleWashingMachine(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void quickWash() {
        if (this.consumptionPerHour == 3) {
            consumptionPerHour += 40;
            System.out.println("Quick wash choosed");
        }
    }

    @Override
    public void mixtWash() {
        if (this.consumptionPerHour == 3) {
            consumptionPerHour += 50;
            System.out.println("Mixt wash choosed");
        }
    }

    @Override
    public void cottonWash() {
        if (this.consumptionPerHour == 3) {
            consumptionPerHour += 100;
            System.out.println("Cotton wash choosed");
        }
    }

    @Override
    public void delicateWash() {
        if (this.consumptionPerHour == 3) {
            consumptionPerHour += 30;
            System.out.println("Delicate wash choosed");
        }
    }

    @Override
    public void start() {
        this.consumptionPerHour = 3;
        if (consumptionPerHour == 3)
            System.out.println("Washing machine on. Please choose a program");
    }

    @Override
    public void stop() {
        if (consumptionPerHour == 3 || consumptionPerHour == 43 || consumptionPerHour == 53 || consumptionPerHour == 103
                || consumptionPerHour == 33) {
            consumptionPerHour = 0;
            System.out.println("Washing machine off.");
        }
    }

    @Override
    public float getConsumptionPerHour() {
        return consumptionPerHour;
    }
}
