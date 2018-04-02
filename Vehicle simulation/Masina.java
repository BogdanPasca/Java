package com.company;

public class Masina extends Vehicul {
    private int roti;
    private int usi;
    private int viteze;
    private boolean esteManual;

    private int treaptaViteaza;

    public Masina(String nume, String dimensiune, int roti, int usi, int viteze, boolean esteManual) {
        super(nume, dimensiune);
        this.roti = roti;
        this.usi = usi;
        this.viteze = viteze;
        this.esteManual = esteManual;
    }

    public void setTreaptaViteaza(int treaptaViteaza) {
        this.treaptaViteaza = treaptaViteaza;
        System.out.println("Masina.setTreaptaViteza(): Schimbata la viteza a " + this.treaptaViteaza + " viteza.");
    }

    public void schimbaViteza(int viteza, int directie) {
        move(viteza, directie);
        System.out.println("Masina.schimbaViteza() : Viteza " + viteza + " directie " + directie);
    }

}
