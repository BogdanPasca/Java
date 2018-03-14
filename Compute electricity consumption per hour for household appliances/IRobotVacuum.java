package com.company;

public abstract class IRobotVacuum  implements Appliance {
    abstract void doQuickClean();
    abstract void cleanPetHair();
    abstract void stopQuickClean();
    abstract void stopCleanPetHair();

}
