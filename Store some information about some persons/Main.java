/**
 * Pentru exemplificare lista noastra are 5 persoane: Diana, Rares,Bogdan,Marcel si Aurel
 * Diana are ca Hobby : jogging, frecventa: 5 ori/saptamanta, locurile de practica: Strada Amforei Tm si Parcul Botanic
 * Bogdan are ca Hobby: Karate, frecventa: 4 ori/saptamana, locurile de practica: Css Bega Tm si P-ta Iancu Huniade Tm
 * Marcel are ca Hobby: Acvaristica, frecventa: 7 ori/saptamana, locul de practica: Acasa- Strada Mures nr4, Tm
 * Rares are ca Hobby: Fotbal, frecventa:4 ori/saptmana, locul de practica: Banu Sport TM
 *                   : Tenis, frecventa: 3 ori/saptamana, locul de practica: Banu Sport TM
 *                   : Biliard, frecventa 1 data/saptamana, locul de practica: Iulius Mall TM;
 */
package com.company.homeworkPart2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Lista cu adresele pentru karate - Bogdan
        List<String> karatePlaces = new ArrayList<String>();
        karatePlaces.add("CSS Bega Timisoara");
        karatePlaces.add("Piața Iancu Huniade-Kraw Maga Timisoara");

        //Lista cu adresele pentru acvaristica - Aurel
        List<String> acvaristicaPlaces = new ArrayList<String>();
        acvaristicaPlaces.add("Acasa-Strada Mures nr4, Timisoara");

        //Lista cu adresele pentru jogging - Diana
        List<String> joggingPlaces = new ArrayList<String>();
        joggingPlaces.add("Sala de pe strada Amforei - Timisoara");
        joggingPlaces.add("Parcul Botanic");

        //Lista cu adresele pentru programare - Marcel
        List<String> programarePlaces = new ArrayList<String>();
        programarePlaces.add("Berg Computers Timisoara");
        programarePlaces.add("Acasa la el");

        //Lista cu adresele pentru fotbal - Rares
        List<String> fotbalPlaces = new ArrayList<String>();
        fotbalPlaces.add("Banu Sport Timisoara");

        //Lista cu adresele pentru Tenis - Rares
        List<String> tenisPlaces = new ArrayList<String>();
        tenisPlaces.add("Banu Sport Timisoara");

        //Lista cu adresele pentru biliard - Rares
        List<String> poolPlaces = new ArrayList<String>();
        poolPlaces.add("Iulius Mall Timisoara");

        // Stocam toate informatiile intr-un hashMap cu cheia String si valoarea lista de Hobby..
        //..pentru ca unele persoane au mai mult de 1 hobby

        Map<String, List<Hobby>> hm = new HashMap<String, List<Hobby>>();

        //Se creeaza lista cu Hobby-urile pentru Bogdan
        List<Hobby> bogdanHobbies = new ArrayList<Hobby>();
        bogdanHobbies.add(new Hobby("Karate", 4, karatePlaces));

        //Se creeaza lista cu Hobby-urile pentru Aurel
        List<Hobby> aurelHobbies = new ArrayList<Hobby>();
        aurelHobbies.add(new Hobby("Acvaristica", 7, acvaristicaPlaces));

        //Se creeaza lista cu Hobby-urile pentru Diana
        List<Hobby> dianaHobbies = new ArrayList<Hobby>();
        dianaHobbies.add(new Hobby("Jogging", 5, joggingPlaces));

        //Se creeaza lista cu Hobby-urile pentru Marcel
        List<Hobby> marcelHobbies = new ArrayList<Hobby>();
        marcelHobbies.add(new Hobby("Programare", 7, programarePlaces));

        //Se creeaza lista cu Hobby-urile pentru Rares
        List<Hobby> raresHobbies = new ArrayList<Hobby>();
        raresHobbies.add(new Hobby("Fotbal", 4, fotbalPlaces));
        raresHobbies.add(new Hobby("Tenis", 3, tenisPlaces));
        raresHobbies.add(new Hobby("Biliard", 1, poolPlaces));

        //Se populeaza HashMap -ul de tipul <String, List<Hobby>>. Cheia fiind numele si valoarea lista de Hobby pentru fiecare
        hm.put("Bogdan", bogdanHobbies);
        hm.put("Aurel", aurelHobbies);
        hm.put("Diana", dianaHobbies);
        hm.put("Marcel", marcelHobbies);
        hm.put("Rares", raresHobbies);

        System.out.println("========= Listeaza informatiile doar despre persoana dorita.(Bogdan si Rares in cazul de fata) ===========");
        System.out.println("");

        //  Listeaza informatiile doar despre persoana dorita, Bogdan si Rares in cazul nostru
        System.out.println("Bogdan: " + hm.get("Bogdan"));
        System.out.println("Rares: " + hm.get("Rares"));

        System.out.println("");
        System.out.println("============== Se listeaza fiecare persoana din lista cu hobby urile aferente ====================================");
        System.out.println("");

        //Listeaza fiecare persoana din lista in parte cu hobby-urile aferente
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key + ":  " + hm.get(key));
        }
        System.out.println("");

    }
}















  /*     System.out.println("==========Persoana/Persoane cu mai multe hobbyuri======================");
        System.out.println("");

        Set<String> keys1 = map.keySet();
        for (String key1 : keys1) {
            System.out.println(key1 + ":  " + map.get(key1));
        }*/


// System.out.println(map.get("Rares"));


//Persoane cu un singur Hobby
//hm.put("Bogdan", new Hobby("Karate", 4, karatePlaces));
// hm.put("Aurel", new Hobby("Acvaristica", 7, acvaristicaPlaces));
// hm.put("Diana", new Hobby("Jogging", 5, joggingPlaces));

//Map<String, List<Hobby>> map = new HashMap<String, List<Hobby>>(); //===============2=============================


/* //Hobby urile pentru Rares
        List<Hobby> raresHobbies = new ArrayList<Hobby>();
        raresHobbies.add(new Hobby("Fotbal", 4, fotbalPlaces));
        raresHobbies.add(new Hobby("Tenis", 3, tenisPlaces));
        raresHobbies.add(new Hobby("Biliard", 1, poolPlaces));*/