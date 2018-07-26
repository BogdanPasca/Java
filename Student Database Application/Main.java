package StudentDatabase;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Cati utilizatori noi trenuie adaugati
        System.out.println("Introduceti numarul de studenti pe care doriti sa ii inscrieti: ");
        Scanner in = new Scanner(System.in);
        int noOfStudents = in.nextInt();
        Student[] students = new Student[noOfStudents];


        //Crearea unui numar n de studenti
        for (int n = 0; n < noOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }
        for (int n = 0; n < noOfStudents; n++){
            System.out.println(students[n].toString());
        }
    }
}
