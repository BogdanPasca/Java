package com.company;

public class SandiwchSanatos extends Sandwich {
    private String numeAditional1Sanatos;
    private double pretAditional1Sanatos;

    private String numeAditional2Sanatos;
    private double pretAditional2Sanatos;

    public SandiwchSanatos(String carne, double pret) {
        super("sanatos", carne, pret, "integrala");

    }

    public void adaugaAditional1Sanatos(String nume, double pret){
        this.numeAditional1Sanatos = nume;
        this.pretAditional1Sanatos = pret;
    }

    public void adaugaAditional2Sanatos(String nume, double pret){
        this.numeAditional2Sanatos = nume;
        this.pretAditional2Sanatos = pret;
    }

    @Override
    public double pretTotalSandwichCuAditionale() {
        double pretSandwich  = super.pretTotalSandwichCuAditionale();
        if (this.numeAditional1Sanatos != null){
            pretSandwich += this.pretAditional1Sanatos;
            System.out.println("Au/a fost adaugate/adaugat " + this.numeAditional1Sanatos + " la pretul de: " + this.pretAditional1Sanatos + " lei.");
        }

        if (this.numeAditional2Sanatos != null){
            pretSandwich += this.pretAditional2Sanatos;
            System.out.println("Au/a fost adaugate/adaugat " + this.numeAditional2Sanatos + " la pretul de: " + this.pretAditional2Sanatos + " lei.");
        }
         return  pretSandwich;
    }
}
