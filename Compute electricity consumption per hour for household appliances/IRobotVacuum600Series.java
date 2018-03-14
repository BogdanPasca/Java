/**
 * iRobotVacuum600Series este un tip de robot, firma iRobot, seria 600.
 * Consumul implicit al robotului este de 8w/ora , fara alte functii pornite.
 * Pe langa cele doua functii, robotul mare are 2 functii doQuickCLean si cleanPetHair, acestea pot fi oprite sau pornite ( se poate spune ca are 4 functii).
 * IMPORTANT cele doua functii doQuickClean si cleanPetHair se pot suprapune. Adica daca este pornita cleanPetHair, se poate porni si functia doQuickClean pentru a grabi cleanPetHair
 * si invers, daca fct doQuickCLean este pornita se poate porni si cleanPetHair, pentru a curata si petHair in timp ce face quickCLean, consumul se insumeaza.
 * Functia doQuickCLean consuma 6w/ora atunci cand este pornita
 * Functia cleanPetHair consuma 5w/ora atunci cand este pornita.
 * Functia STOP opreste automat toate functiile robotului
 */


package com.company;

public class IRobotVacuum600Series extends IRobotVacuum {
    private String serialNumber;
    private float consumptionPerHour;

    public IRobotVacuum600Series(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    //Functia robotului doQuickCLean (desi literalmente este o metoda in java)
    @Override
    void doQuickClean() {

        if (this.consumptionPerHour == 8 || this.consumptionPerHour == 13) {
            consumptionPerHour += 6;
            System.out.println("Do quick clean on");
        }
    }

    @Override
    void cleanPetHair() {
        if (this.consumptionPerHour == 8 || this.consumptionPerHour == 14) {
            consumptionPerHour += 5;
            System.out.println("Clean pet hair start");
        }
    }

    @Override
    public void start() {
        this.consumptionPerHour = 8;
        if (consumptionPerHour == 8)
            System.out.println("Robot start");
    }

    @Override
    public void stop() {
        if (consumptionPerHour == 8 || consumptionPerHour == 14 || consumptionPerHour == 19 || consumptionPerHour == 13) {
            consumptionPerHour = 0;
            System.out.println("Robot stop");
        }
    }


    public float getConsumptionPerHour() {
        return consumptionPerHour;
    }

    @Override
    void stopQuickClean() {
        if (consumptionPerHour == 14 || consumptionPerHour == 19) {
            consumptionPerHour -= 6;
            System.out.println("Quick clean stop");
        }
    }

    @Override
    void stopCleanPetHair() {
        if (consumptionPerHour == 13 || consumptionPerHour == 19) {
            consumptionPerHour -= 5;
            System.out.println("Clean pet hair stop ");
        }
    }
}

