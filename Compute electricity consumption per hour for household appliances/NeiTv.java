/**
 * Nei este un televizor care are un consum implicit de 35w.
 * Nei are o functie in plus si anume economicMode
 * EconomicMode este diferita fata de celelalte functii ale celorlalte aparate.
 * Cand functia este activata, consumul televizorului scade cu 10w , la 25W.
 * Cand functia este dezactivata consumul televizorului creste cu 10w si revine la valoarea initiala de 35w.
 * Aceasta functie are o implementare implicita din fabrica astfel incat sa reduca consumul de curent.
 */

package com.company;

public class NeiTv extends Tv {
    private float consumptionPerHour;
    private String serialNumber;

    public NeiTv(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void economicMode() {
        if (this.consumptionPerHour == 35) {
            consumptionPerHour -= 10;
            System.out.println("Economic mode enabled");
        }
    }

    @Override
    public void economicModeOff() {
        if (consumptionPerHour == 25) {
            consumptionPerHour += 10;
            System.out.println("Economic mode is off");
        }
    }

    @Override
    public void start() {
        this.consumptionPerHour = 35;
        if (consumptionPerHour == 35)
            System.out.println("Tv on");


    }

    @Override
    public void stop() {
        if (consumptionPerHour == 35 || consumptionPerHour == 25) {
            consumptionPerHour = 0;
            System.out.println("Tv off");
        }
    }

    @Override
    public float getConsumptionPerHour() {
        return consumptionPerHour;
    }
}
