/**
 * Clasa Hobby contine 3 proprietati
 *
 * @param name - nume hobby
 * @param int - frecventa hobby
 * @param adress -  adresa unde poate fi practicat hobby-ul
 */
package com.company.homeworkPart2;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
    private List<String> adress = new ArrayList<String>();

    public Hobby(String name, int frequency, List<String> adress) {
        this.name = name;
        this.frequency = frequency;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void addAdress(String item) {
        adress.add(item);
    }

    public void getAdress() {
        for (String e : adress) {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "Hobby-" + name + "; Frequency-" + frequency + "; " + "Places-" + adress;
    }
}




