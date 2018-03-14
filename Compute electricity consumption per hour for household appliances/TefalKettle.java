/**
 * Tefal este un fierbator care are un consum implicit de 25w.
 * El are o singura functie in plus, keepLiquidWarm care mentine lichidul dinautru cald dupa ce acesta a fost incalzit/fiert.
 * Aceasta functie consuma in plus 13 w.
 * Functia se poate porni sau se poate opri dupa preferinta clientului, consumul se ajusteaza in functie de acest lucru.
 */
package com.company;

public class TefalKettle extends Kettle {
    private String serialNumber;
    private float consumptionPerHour;

    public TefalKettle(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void keepLiquidWarm() {
        if (this.consumptionPerHour == 25) {
            consumptionPerHour += 13;
            System.out.println("keep liquid warm on");
        }
    }

    @Override
    public void keepLiquidWarmOff() {
        if (consumptionPerHour == 38) {
            consumptionPerHour -= 13;
            System.out.println("Function keep liquid warm is now off");
        }
    }

    @Override
    public void start() {
        this.consumptionPerHour = 25;
        if (consumptionPerHour == 25)
            System.out.println("Kettle on");

    }

    @Override
    public void stop() {
        if (consumptionPerHour == 25 || consumptionPerHour == 38) {
            consumptionPerHour = 0;
            System.out.println("Kettle off");
        }
    }

    @Override
    public float getConsumptionPerHour() {

        return consumptionPerHour;
    }
}
