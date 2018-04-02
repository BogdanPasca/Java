package com.company;

public class Vehicul {
    private String nume;
    private String dimensiune;

    private int vitezaCurenta;
    private int directiaCurenta;

    public Vehicul(String nume, String dimensiune) {
        this.nume = nume;
        this.dimensiune = dimensiune;

        this.directiaCurenta = 0;
        this.directiaCurenta = 0;
    }

    public void steer(int directie) {
        this.directiaCurenta += directie;
        System.out.println("Vehicul.steer(): steering at: " + directiaCurenta + " grade");
    }

    public void move(int viteza, int directie) {
        directiaCurenta = directie;
        vitezaCurenta = viteza;
        System.out.println("Vehicul.move(): Moving at " + vitezaCurenta + " in directia " + directiaCurenta);
    }

    public String getNume() {
        return nume;
    }

    public String getDimensiune() {
        return dimensiune;
    }

    public int getVitezaCurenta() {
        return vitezaCurenta;
    }

    public int getDirectiaCurenta() {
        return directiaCurenta;
    }

    public void stop() {
        this.vitezaCurenta = 0;
    }
}
