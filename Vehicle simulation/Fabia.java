package com.company;

public class Fabia extends Masina {
    private int inspectieService;

    public Fabia(int inspectieService) {
        super("Fabia", "Combi", 5, 5, 5, true);
        this.inspectieService = inspectieService;
    }

    public void accelerare(int interval ){
        int vitezaNoua = getVitezaCurenta() + interval;
        if (vitezaNoua == 0){
            stop();
            setTreaptaViteaza(1);
        } else if (vitezaNoua > 0 && vitezaNoua <=10) {
            setTreaptaViteaza(1);
        } else if (vitezaNoua > 10 && vitezaNoua <= 20){
            setTreaptaViteaza(2);
        } else if (vitezaNoua > 20 && vitezaNoua <=50){
            setTreaptaViteaza(3);
        } else if (vitezaNoua > 50 && vitezaNoua <= 100){
            setTreaptaViteaza(4);
        } else if (vitezaNoua > 100 && vitezaNoua <= 200){
            setTreaptaViteaza(5);
        }
        if (vitezaNoua > 0){
            schimbaViteza(vitezaNoua, getDirectiaCurenta());
        }
    }
}
