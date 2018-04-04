package com.company;

public class DeluxeSandwich extends Sandwich {
    private String chips;
    private String bautura;

    public DeluxeSandwich() {
        super("Deluxe", "Sunca & piept de pui", 18.00, "alba");
        super.adaugaItemAditional1Sandwich("Chips", 2.75);
        super.adaugaItemAditional2Sandwich("Fresh", 6);
    }

    @Override
    public void adaugaItemAditional1Sandwich(String nume, double pret) {
        System.out.println("Nu se pot adauga ingrediente noi unui sandwich deluxe");
    }

    @Override
    public void adaugaItemAditional2Sandwich(String nume, double pret) {
        System.out.println("Nu se pot adauga ingrediente noi unui sandwich deluxe");
    }

    @Override
    public void adaugaItemAditional3Sandwich(String nume, double pret) {
        System.out.println("Nu se pot adauga ingrediente noi unui sandwich deluxe");
    }

    @Override
    public void adaugaItemAditional4Sandwich(String nume, double pret) {
        System.out.println("Nu se pot adauga ingrediente noi unui sandwich deluxe");
    }
}
