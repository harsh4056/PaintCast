package com.example.moon.paintcast;

/**
 * Created by MOON on 11-11-2016.
 */

public class Coordinates {
    public String absicca;
    public String oordinate;

        Coordinates(){

        }
    Coordinates(String absicca, String oordinate){
        this.absicca=absicca;
        this.oordinate=oordinate;

    }



    public String getAbsicca() {
        return absicca;
    }

    public void setAbsicca(String absicca) {
        this.absicca = absicca;
    }

    public String getOordinate() {
        return oordinate;
    }

    public void setOordinate(String oordinate) {
        this.oordinate = oordinate;
    }



}
