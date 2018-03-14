/**
 * Samsung este un frigider smart. Are un consum implicit de 10w atunci cand este pornit.
 * Functia power freezer are un consum implicit de 10w atunci cand este pornita.
 * Frigiderul are 4 functii - start/stop/ power freezer on/ power freezer off.
 * Functia stop a frigiderului opreste automat si functia power freezer.
 * Power freezer porneste doar daca frigiderul este pornit,
 * se verifica daca frigiderul este pornit si daca este pornit creste consumul cu 10W(atat consuma power freezer).
 * Power freezer se opreste doar daca este pornit .Consumul frigiderului scade cu 10w (cat consuma power freezer-ul)
 */


package com.company;

// Samsung este un frigider smart

public class SamsungSmartFridge extends Fridge {
    private String serialNumber;
    private float consumptionPerHour;

    //Constructorul prin care introduce un "serial Number"
    public SamsungSmartFridge(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    // metoda prin care se porneste frigiderul Samsung. El are un consum implicit de 10W.
    @Override
    public void start() {
        this.consumptionPerHour = 10;
        if (consumptionPerHour == 10)
            System.out.println("Fridge on");
    }

    // metoda prin care se opreste frigiderul Samsung. Consumul este redus la 0w.
    @Override
    public void stop() {
        if (consumptionPerHour == 10 || consumptionPerHour == 20) {
            consumptionPerHour = 0;
            System.out.println("Fridge stoped");
        }
    }

    // metoda prin care se returneaza consumul pe ora
    @Override
    public float getConsumptionPerHour() {
        return consumptionPerHour;
    }

    //  metoda prin care se opreste power freezer.
    @Override
    public void powerFreezerOff() {
        if (consumptionPerHour == 20) {
            consumptionPerHour -= 10;
            System.out.println("Power freezer off");
        }
    }

    // metoda prin care se porneste power freezer. Power freezer porneste doar daca frigiderul este pornit.
    // se verifica daca frigiderul este pornit si daca este pornit creste consumul cu 10W(atat consuma power freezer)
    @Override
    public void powerFreezerOn() {
        if (this.consumptionPerHour == 10) {
            consumptionPerHour += 10;
            System.out.println("Power freezer on");

        }
    }
}
