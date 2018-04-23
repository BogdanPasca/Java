package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("ING");

        bank.addBranch("Timisoara");

        bank.addCustomer("Timisoara", "Bogdan", 750.05);
        bank.addCustomer("Timisoara", "Vlad", 175.34);
        bank.addCustomer("Timisoara", "Diana", 220.12);
        bank.addCustomer("Timisoara","Roxana",100);

        bank.addBranch("Arad");
        bank.addCustomer("Arad", "Rares", 150.54);

        bank.addCustomerTransaction("Timisoara", "Bogdan", 44.22);
        bank.addCustomerTransaction("Timisoara", "Maria", 12.44);
        bank.addCustomerTransaction("Timisoara", "Roxana", 251.65);

        bank.listCustomers("Timisoara",true);
        System.out.println("=============================================");
        bank.listCustomers("Arad",true);


        bank.addBranch("Recas");

        if(!bank.addCustomer("Recas", "Brian", 5.53)){
            System.out.println("Error Recas branch does not exist");
        }

    }
}
