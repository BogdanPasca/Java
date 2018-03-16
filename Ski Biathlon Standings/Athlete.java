package com.company;

import java.io.Serializable;

public class Athlete implements Serializable {
    private String athleteNumber;
    private String athleteName;
    private String countryCode;
    private String skiTimeResult;
    private String firstShootingRange;
    private String secondShootingRange;
    private String thirdShootingRange;
    private int finalTime;
    private final static long serialVersionUID = 1L;


    public String getAthleteNumber() {
        return athleteNumber;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getSkiTimeResult() {
        return skiTimeResult;
    }

    public String getFirstShootingRange() {
        return firstShootingRange;
    }

    public String getSecondShootingRange() {
        return secondShootingRange;
    }

    public String getThirdShootingRange() {
        return thirdShootingRange;
    }

    @Override
    public String toString() {
        return athleteNumber + "," +
                athleteName + "," +
                countryCode + "," +
                skiTimeResult + "," +
                firstShootingRange + "," +
                secondShootingRange + "," +
                thirdShootingRange + "\n";

    }

    public void setAthleteNumber(String athleteNumber) {
        this.athleteNumber = athleteNumber;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String setSkiTimeResul(String skiTimeResult) {
        this.skiTimeResult = skiTimeResult;
        return this.skiTimeResult.toString();
    }


    public String setFirstShootingRange(String firstShootingRange) {
        this.firstShootingRange = firstShootingRange;
        return this.firstShootingRange.toString();
    }

    public String setSecondShootingRange(String secondShootingRange) {
        this.secondShootingRange = secondShootingRange;
        return this.secondShootingRange.toString();
    }

    public String setThirdShootingRange(String thirdShootingRange) {
        this.thirdShootingRange = thirdShootingRange;
        return this.thirdShootingRange.toString();
    }

    public int getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(int finalTime) {
        this.finalTime = finalTime;
    }
}
