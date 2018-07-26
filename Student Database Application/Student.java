package StudentDatabase;

import java.util.Scanner;

public class Student {
    private static int costOfCourse = 600;
    private static int id = 1000;
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;

    // Constructor pentru numele si anul studentului
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceti prenumele studentului: ");
        this.firstName = in.nextLine();

        System.out.print("Introduceti numele studentului: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Primul an\n2 - Al doilea an\n3 - Al treilea an\n4 - Al patrulea an: ");
        this.gradeYear = in.nextInt();
        setStudentId();
    }

    // Generarea unui id
    private void setStudentId() {
        //anul + ID
        id++;
        this.studentId = gradeYear + "" + id;
    }

    // Inscrierea la cursuri
    public void enroll() {
        do {
            System.out.print("Introduceti cursul dorit (q pentru a iesi): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
    }


    // Sold
    public void viewBalance() {
        System.out.println("Situatia ta financiara este: " + tuitionBalance);
    }

    //Plata taxa
    public void payTuition() {
        viewBalance();
        System.out.print("Introduceti suma pe care doriti sa o platiti: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Va multumim pentra plata facuta in valoare de: " + payment + " lei");
        viewBalance();
    }

    // Informatii despre student
    public String toString() {
        return "Nume: " + firstName + " " + lastName +
                "\nAnul: " + gradeYear +
                "\nID student: " + studentId +
                "\nCursuri frecventate: " + courses +
                "\nSituatia financiara: " + tuitionBalance + " lei";
    }
}
