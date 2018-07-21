package EmailApp;

import java.util.Random;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String email;
    private String companySuffix = "contitech.ro";


    //Constructor care primeste firstName si lastName

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //O metoda care returneaza departamentul
        this.department = setDepartment();
        System.out.println("------------------------\n" + "Department: " + this.department);

        //Apelarea unei metode care returneaza o parola aleatorie
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Parola dvs este: " + this.password);

        //Generarea unei adrese de email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;


    }

    // Cere departamentul
    private String setDepartment() {
        System.out.print("Noul angajat: " + firstName + ". Coduri departament:\n1 pentru Vanzari\n2 pentru Development\n3 pentru Contabilitate\nIntroduceti codul departamentului:  ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "vanzari";
        } else if (depChoice == 2) {
            return "development";
        } else if (depChoice == 3) {
            return "contabilitate";
        } else {
            return ("");

        }
    }

    //Generarea unei parola random
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Setare capacitate casuta de email
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;

    }

    //Setare adresa de email alternativa
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    //Schimbare parola
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;

    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return
                "------------------------" + "\n" +
                        "Numele: " + firstName + " " + lastName + "\n" +
                        "Adresa de email: " + email + "\n" +
                        "Capacitate casuta email: " + mailBoxCapacity + "mb" + "\n" +
                        "------------------------";
    }
}
