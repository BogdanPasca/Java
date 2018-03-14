/**
 * Lenovo este un laptop care are un consum implicit de 12w.
 * Are in plus o functie - iluminate keyboard (2 daca luam in considerare si turnOffIluminatedKeyboard)
 * IluminateKeyboard are un consum implicit de 3.5 w, consum care se adauga la cel implicit al laptopului.
 * Tastatura iluminata se poate porni sau opri, consumul se modifica in functie de asta.
 */

package com.company;

public class LenovoNotebook extends Notebook {
    private String serialNumber;
    private float consumptionPerHour;

    public LenovoNotebook(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void iluminateKeyboard() {
        if (consumptionPerHour == 12) {
            consumptionPerHour += 3.5;
            System.out.println("keyboard is now illuminated");
        }
    }

    @Override
    public void turnOffIluminatedKeyboard() {
        if (consumptionPerHour == 15.5) {
            consumptionPerHour -= 3.5;
            System.out.println("keyboard illuminate off");
        }
    }

    @Override
    public void start() {
        this.consumptionPerHour = 12;
        if (consumptionPerHour == 12)
            System.out.println("Laptop is starting");
    }

    @Override
    public void stop() {
        if (consumptionPerHour == 12 || consumptionPerHour == 15.5) {
            consumptionPerHour = 0;
            System.out.println("Laptop shut down successfully");
        }
    }

    @Override
    public float getConsumptionPerHour() {
        return consumptionPerHour;
    }
}



