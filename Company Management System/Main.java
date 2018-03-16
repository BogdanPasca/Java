/**
 * Pentru exemplificare, compania noastra are 10 angajati pe 4 functii diferite;
 * Junior web developer - 3 angajati (Marcel, Aurel, Ion);
 * Senior web developer - 2 angajati ( Victor si Tudod);
 * Junior android developer - 2 angajati (Vlad si Ayian);
 * Senior android developer - 3 angajati (Andrei, Sebi, Raul);
 * Angajatii fara loc de parcare: Aurel, Marcel, Victor, Andrei, Raul;
 * Se obtine o lista cu toti angajatii impartiti pe cele 4 functii /  departamente;
 * Se obtine o lista cu toti angajatii sortati dupa vechimea in munca;
 * Se obtine o lista cu angajatii care nu au loc de parcare, ordonata dupa vechimea angajatilor in munca.
 */

package com.company.homeworkPart3;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Lista cu angajatii de pe pozitia junior web developer
        List<Employee> juniorWebDev = new ArrayList<Employee>();
        juniorWebDev.add(new Employee("Marcel", 3, false));
        juniorWebDev.add(new Employee("Aurel", 2, false));
        juniorWebDev.add(new Employee("Ion", 1, true));

        //Lista cu angajatii de pe pozitia senior web developer
        List<Employee> seniorWebDev = new ArrayList<Employee>();
        seniorWebDev.add(new Employee("Victor", 8, false));
        seniorWebDev.add(new Employee("Tudod", 10, true));

        //Lista cu angajatii de pe pozitia junior android developer
        List<Employee> juniorAndroidDev = new ArrayList<Employee>();
        juniorAndroidDev.add(new Employee("Vlad", 1, true));
        juniorAndroidDev.add(new Employee("Ayian", 2, true));

        //Lista cu angajatii de pe pozitia senior android developer
        List<Employee> seniorAndroidDev = new ArrayList<Employee>();
        seniorAndroidDev.add(new Employee("Andrei", 15, false));
        seniorAndroidDev.add(new Employee("Sebi", 13, true));
        seniorAndroidDev.add(new Employee("Raul", 16, false));

        System.out.println("=== Toti angajatii impartiti pe cele 4 functii / departamente ===");
        Company company = new Company("Asos", juniorWebDev, seniorWebDev, juniorAndroidDev, seniorAndroidDev);
        System.out.println(company);

        //Lista care contine TOTI angajatii din companie impartiti pe cele 4 functii/departamente
        List<Employee> allEmployeesOfCompany = new ArrayList<Employee>();
        allEmployeesOfCompany.addAll(juniorWebDev);
        allEmployeesOfCompany.addAll(seniorWebDev);
        allEmployeesOfCompany.addAll(juniorAndroidDev);
        allEmployeesOfCompany.addAll(seniorAndroidDev);
        System.out.println("");
        
        //Sortare dupa vechime a tuturor angajatilor
        System.out.println("");
        System.out.println("=== Toti angajatii sortati dupa vechimea in munca === ");
        Set<Employee> listaVechime = new TreeSet<Employee>(new VechimeComp());
        listaVechime.addAll(allEmployeesOfCompany);
        for(Employee e: listaVechime){
            System.out.println("angajat: " + e.getName() + " === Vechime: " +e.getYearsSpentInCompany()+"ani" + " === Loc parcare:" + e.isParkingSpace());
        }
        System.out.println("");
        System.out.print("=== Angajatii fara loc de parcare, sortati dupa vechimea in munca(Metoda Clasica): ===");

        //Se face o copie a listei care contine toti angajatii din companie
        List<Employee> listaSortataDupaParcare = new ArrayList<Employee>();
        listaSortataDupaParcare.addAll(allEmployeesOfCompany);

        //Se parcurce lista si se sterg toate persoanele care au loc de parcare
        for (int i = listaSortataDupaParcare.size() - 1; i>=0; i--){
            if (listaSortataDupaParcare.get(i).parkingSpace == true)
                listaSortataDupaParcare.remove(i);
        }
       // Pe lista noua rezultate cu persoane fara loc de parcare se apeleaza comparatorul pentru vechimea in munca
        Set<Employee> VechimeComp = new TreeSet<Employee>(new VechimeComp());
        VechimeComp.addAll(listaSortataDupaParcare);
        for (Employee e: VechimeComp){
            System.out.print(e);
        }
        System.out.println("");

        //lista cu toti angajatii care nu au loc de parcare, sortati dupa vechimea in munca
        List<Employee> output =
                allEmployeesOfCompany.stream()
                        .filter(emp -> !emp.parkingSpace)
                        .sorted(Comparator.comparingInt(Employee::getYearsSpentInCompany))
                        .collect(Collectors.toList());
        System.out.println("");
        System.out.println("=== Angajatii fara loc de parcare, sortati dupa vechimea in munca(Metoda Stream): ===" +  output);

    }
}



