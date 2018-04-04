package com.company;

public class Sandwich {
    private String nume;
    private String carne;
    private double pret;
    private String tipPaine;

    private String aditional1Nume;
    private double aditional1Pret;

    private String aditional2Nume;
    private double aditional2Pret;

    private String aditional3Nume;
    private double aditional3Pret;

    private String aditional4Nume;
    private double aditional4Pret;


    public Sandwich(String nume, String carne, double pret, String tipPaine) {
        this.nume = nume;
        this.carne = carne;
        this.pret = pret;
        this.tipPaine = tipPaine;
    }

    public void adaugaItemAditional1Sandwich(String nume, double pret) {
        this.aditional1Nume = nume;
        this.aditional1Pret = pret;
    }

    public void adaugaItemAditional2Sandwich(String nume, double pret) {
        this.aditional2Nume = nume;
        this.aditional2Pret = pret;
    }

    public void adaugaItemAditional3Sandwich(String nume, double pret) {
        this.aditional3Nume = nume;
        this.aditional3Pret = pret;
    }

    public void adaugaItemAditional4Sandwich(String nume, double pret) {
        this.aditional4Nume = nume;
        this.aditional4Pret = pret;
    }

    public double getPret() {
        return pret;
    }

    public double pretTotalSandwichCuAditionale() {
        double sandwichPret = this.pret;
        System.out.println("Pretul unui sandwich " + this.nume + " cu carne de " + this.carne + " si paine " + this.tipPaine + " este: " + this.pret + " lei");

        if (this.aditional1Nume != null) {
            sandwichPret += this.aditional1Pret;
            System.out.println("A fost adaugat/a " + this.aditional1Nume + " la pretul de " + this.aditional1Pret + " lei");
        }

        if (this.aditional2Nume != null) {
            sandwichPret += this.aditional2Pret;
            System.out.println("A fost adaugat/a " + this.aditional2Nume + " la pretul de " + this.aditional2Pret + " lei");
        }
        if (this.aditional3Nume != null) {
            sandwichPret += this.aditional3Pret;
            System.out.println("A fost adaugat/a " + this.aditional3Nume + " la pretul de " + this.aditional3Pret + " lei");
        }
        if (this.aditional4Nume != null) {
            sandwichPret += this.aditional4Pret;
            System.out.println("A fost adaugat/a " + this.aditional4Nume + " la pretul de " + this.aditional4Pret + " lei");
        }
        return sandwichPret;
    }
}
