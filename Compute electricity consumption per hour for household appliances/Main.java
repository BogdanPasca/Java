package com.company;
public class Main {
    public static void main(String[] args) {

        //Downcast pentru fridge
        Appliance fr = new SamsungSmartFridge("SN-SMSG009");
        SamsungSmartFridge fridge = (SamsungSmartFridge) fr;

        System.out.println("consumul frididerului este: " + fridge.getConsumptionPerHour() + " W.");
        fridge.start();
        System.out.println("consumul frididerului este: " + fridge.getConsumptionPerHour() + " W.");
        fridge.powerFreezerOn();
        System.out.println("consumul frididerului este: " + fridge.getConsumptionPerHour() + " W.");
        fridge.powerFreezerOff();
        System.out.println("consumul frididerului este: " + fridge.getConsumptionPerHour() + " W.");
        fridge.stop();
        System.out.println("consumul frididerului este: " + fridge.getConsumptionPerHour() + " W.");
        System.out.println("\n ****************AIR CONDITIONER***************");



        //de aici in jos este pentru AirConditioner
      Appliance mid = new MideaAirConditioner("test");
      MideaAirConditioner midea = (MideaAirConditioner) mid;
        System.out.println("consumul aparatului de aer conditionat este " + midea.getConsumptionPerHour()+ " W." );
        midea.start();
        System.out.println("consumul aparatului de aer conditionat este: " + midea.getConsumptionPerHour() + " W.");
        midea.cool();
        System.out.println("consumul aparatului de aer conditionat este: " + midea.getConsumptionPerHour() + " W.");
        midea.heat();
        System.out.println("consumul aparatului de aer conditionat este: " + midea.getConsumptionPerHour() + " W.");
        midea.stop();
        System.out.println("consumul aparatului de aer conditionat este: " + midea.getConsumptionPerHour() + " W.");
        System.out.println("\n **************TV*************");

        //de aici in jos este pentru Tv
        Appliance tiv = new NeiTv("test");
        NeiTv nei = (NeiTv) tiv;

        nei.start();
        System.out.println("consumul Tv: " + nei.getConsumptionPerHour() + " W.");
        nei.economicMode();
        System.out.println("consumul Tv: " + nei.getConsumptionPerHour() + " W.");
        nei.economicModeOff();
        System.out.println("consumul Tv: " + nei.getConsumptionPerHour() + " W.");
        nei.stop();
        System.out.println("consumul Tv: " + nei.getConsumptionPerHour() + " W.");
        System.out.println("\n****************TEFAL KETTLE ****************");

        //de aici in jos este pentru Kettle/fierbator
        Appliance tf = new TefalKettle("test");
        TefalKettle tefal = (TefalKettle) tf;

        System.out.println("consumul TefalKettle: " + tefal.getConsumptionPerHour() + " W.");
        tefal.start();
        System.out.println("consumul TefalKettle: " + tefal.getConsumptionPerHour() + " W.");
        tefal.keepLiquidWarm();
        System.out.println("consumul TefalKettle: " + tefal.getConsumptionPerHour() + " W.");
        tefal.keepLiquidWarmOff();
        System.out.println("consumul TefalKettle: " + tefal.getConsumptionPerHour() + " W.");
        tefal.stop();
        System.out.println("consumul TefalKettle: " + tefal.getConsumptionPerHour() + " W.");
        System.out.println("\n*****************LENOVO NOTEBOOK******************");

        //de aici in jos este pentru LenovoNotebook
        Appliance ln = new LenovoNotebook("test");
        LenovoNotebook lenovo = (LenovoNotebook) ln;

        lenovo.start();
        System.out.println("consumul Lenovo notebook: " + lenovo.getConsumptionPerHour() + " W.");
        lenovo.iluminateKeyboard();
        System.out.println("consumul Lenovo notebook: " + lenovo.getConsumptionPerHour() + " W.");
        lenovo.turnOffIluminatedKeyboard();
        System.out.println("consumul Lenovo notebook: " + lenovo.getConsumptionPerHour() + " W.");
        lenovo.stop();
        System.out.println("consumul Lenovo notebook: " + lenovo.getConsumptionPerHour() + " W.");
        System.out.println("\n *******************MIELE WASHING MACHINE*****************");

        //de aici in jos este pentru MieleWashingMachine

        Appliance miel = new MieleWashingMachine("test");
        MieleWashingMachine miele = (MieleWashingMachine) miel;

        miele.start();
        System.out.println("consumul Miele washing machine: " + miele.getConsumptionPerHour() + " W.");
        miele.mixtWash();
        System.out.println("consumul Miele washing machine: " + miele.getConsumptionPerHour() + " W.");
        miele.start();
        miele.cottonWash();
        System.out.println("consumul Miele washing machine: " + miele.getConsumptionPerHour() + " W.");
        miele.start();
        miele.quickWash();
        System.out.println("consumul Miele washing machine: " + miele.getConsumptionPerHour() + " W.");
        miele.start();
        miele.delicateWash();
        System.out.println("consumul Miele washing machine: " + miele.getConsumptionPerHour() + " W.");
        miele.stop();
        System.out.println("consumul Miele washing machine: " + miele.getConsumptionPerHour() + " W.");


        System.out.println("\n ***********IRobotVAcuum600Series**********");
       

        IRobotVacuum iRobot = new IRobotVacuum600Series("test");
        Appliance someVacuum = (Appliance) iRobot;
        someVacuum.start();
        System.out.println("consumul aspiratorului este de: "+ someVacuum.getConsumptionPerHour() + " W.");
        iRobot.doQuickClean();
        System.out.println("consumul aspiratorului este de: "+ iRobot.getConsumptionPerHour() + " W.");
        iRobot.cleanPetHair();
        System.out.println("consumul aspiratorului este de: "+ iRobot.getConsumptionPerHour() + " W.");

        iRobot.stopQuickClean();
        System.out.println("consumul aspiratorului este de: "+ iRobot.getConsumptionPerHour() + " W.");
        iRobot.stopCleanPetHair();
        System.out.println("consumul aspiratorului este de: "+ iRobot.getConsumptionPerHour() + " W.");
        iRobot.stop();
        System.out.println("consumul aspiratorului este de: "+ iRobot.getConsumptionPerHour() + " W.");

    }
}











































































