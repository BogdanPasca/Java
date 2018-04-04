package com.company;

public class Main {

    public static void main(String[] args) {
       Sandwich sandwich = new Sandwich("simplu", "pui", 10,"alba");
       double price = sandwich.pretTotalSandwichCuAditionale();

       sandwich.adaugaItemAditional1Sandwich("rosie",0.27);
       sandwich.adaugaItemAditional2Sandwich("varza", 0.75);
       sandwich.adaugaItemAditional3Sandwich("branza", 1.12);

        System.out.println("Pretul total sandwich: " + sandwich.pretTotalSandwichCuAditionale());

        SandiwchSanatos sandiwchSanatos = new SandiwchSanatos("sunca", 12);
        sandiwchSanatos.pretTotalSandwichCuAditionale();
        sandiwchSanatos.adaugaItemAditional1Sandwich("oua", 1.5);
        sandiwchSanatos.adaugaAditional2Sanatos("salata", 3.41);

        System.out.println("Pret total sandwich sanatos: " + sandiwchSanatos.pretTotalSandwichCuAditionale()+ "lei.");
        DeluxeSandwich deluxeSandwich = new DeluxeSandwich();
        deluxeSandwich.pretTotalSandwichCuAditionale();













    }
}
