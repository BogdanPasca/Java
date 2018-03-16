/** Un program care simuleaza un ATM bancar.
 * Clientul poate : Verifica soldul
 *                  Sa depuna numerar
 *                  Sa retraga numerar
 *                  Sa afle tranzactia anterioara
 */
package com.company;

import java.util.Scanner;

public class ContBancar {
    private String numar;
    private double sold;
    private String numeClient;
    private String emailClient;
    private String telefonClien;
    private double tranzactiaAnterioara;
    private String idClient;


    //metoda depozitare bani
    public void depozitareBani(double sumaDepusa) {
        this.sold += sumaDepusa;
        tranzactiaAnterioara = sumaDepusa;
        System.out.println("Suma " + sumaDepusa + " depusa cu succes. Noul sold: " + this.sold);
    }

    //metoda retragere bani
    public void retragereBani(double sumaRetrasa) {
        if (sold - sumaRetrasa <= 0) {
            System.out.println("Doar " + this.sold + " lei valabili in cont. Retragerea banilor nu a fost procesata.");
        } else {
            this.sold -= sumaRetrasa;
            System.out.println("Retragrea " + sumaRetrasa + " procesata. Sold existent: " + this.sold);
        }
        tranzactiaAnterioara = -sumaRetrasa;
    }

    //metoda care afiseaza tranzactia anterioara
    public void getTranzactiaAnterioara() {
        if (tranzactiaAnterioara > 0) {
            System.out.println("Suma depusa: " + tranzactiaAnterioara);
        } else if (tranzactiaAnterioara < 0) {
            System.out.println("Au fost retrasi: " + Math.abs(tranzactiaAnterioara));
        } else {
            System.out.println("Nu a fost realizata nici o tranzactie");
        }

    }

    public void arataMeniu() {

        char optiune = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bine ai venit " + numeClient + "!");
        System.out.println("ID-ul tau este: " + idClient + ".");
        System.out.println("\n");
        System.out.println("1. Verificare sold.");
        System.out.println("2. Depunere numerar.");
        System.out.println("3. Retragere numerar.");
        System.out.println("4. Tranzactia anterioara.");
        System.out.println("5. Iesire.");

        do {
            System.out.println("-----------------------");
            System.out.println("Te rog alege operatiunea:");
            optiune = scanner.next().charAt(0);

            switch (optiune) {
                case '1':
                    System.out.println("Sold = " + sold);
                    break;

                case '2':
                    System.out.println("Introdu suma pe care doresti sa o depui:");
                    System.out.println("-----------------------");
                    int sumaDepusa = scanner.nextInt();
                    depozitareBani(sumaDepusa);
                    break;
                case '3':
                    System.out.println("Introdu suma pe care doresti sa o retragi:");
                    System.out.println("-----------------------");
                    int sumaRetrasa = scanner.nextInt();
                    retragereBani(sumaRetrasa);
                    break;
                case '4':
                    getTranzactiaAnterioara();
                    break;
                case '5':
                    System.out.println("*************");
                    break;


                default:
                    System.out.println("Optiune invalida! Te rog sa incerci din nou");
                    break;
            }

        } while (optiune != '5');
        System.out.println("Va multumit ca ati apelat la serviciile bancii noastre");


    }

    //constructor
    public ContBancar(String numar, double sold, String numeClient, String emailClient, String telefonClien) {
        this.numar = numar;
        this.sold = sold;
        this.numeClient = numeClient;
        this.emailClient = emailClient;
        this.telefonClien = telefonClien;
    }

    //constructor 2
    public ContBancar(String nume, String id) {
        this.numeClient = nume;
        this.idClient = id;
    }

    // getters and setters
    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getTelefonClien() {
        return telefonClien;
    }

    public void setTelefonClien(String telefonClien) {
        this.telefonClien = telefonClien;
    }
}
