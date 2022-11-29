package com.baseball.part1githubupload;
/**
 ***********************************************************************************
 * Title: Player
 * Author: Sean Laverty
 * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
 * File: Player.java
 * Description: Abstract class for player creates a template for a player instance
 ***********************************************************************************
 * */
public abstract class Player {
    // Attributes
    private String name;
    private String number;


    // noargs constructor
    public Player(){
        this.name="";
        this.number="";
    }

    // Full constructor
//    public Player(String name, String number){
//        this.name = name;
//        this.number = number;
//    }

    // Minimal constructor
    public Player(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

//    public String getNumber() {
//        return number;
//    }
//
//    // Setters
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setNumber(String number) {
//        this.number = number;
//    }

    @Override
    public String toString() {
        String result = "";
        result += " Name: " + name;
        result += ", Number: " + number ;
        return result;
    }
    // Abstract getAverage
    public abstract String getAverage();

//    // getSLG
//    public abstract String getOPS();
//
//    // getOPS
//    public abstract String getOBP();
//
//    //getOPB
//    public abstract String getSLG();
//
//    // getIOS
//    public abstract String getISO();
////----------------------------------------------------------------------
    //Advanced batter stats
    // getOPSPlus
//    public abstract String getOPSPlus();
//    //get wOBA
//    public abstract String get_wOBA();
//    // get_wRAA
//    public abstract String get_wRAA();
//    // getWRC
//    public abstract String getWRC();
//    // getWRC+
//    public abstract String getWRCPlus();
// ---------------------------------------------------------------------
    //Pitching Stats

    // get win/loss %
//    public abstract String getWinLossPercent();

    // get ERA
    public abstract String getERA();

//    // get WHIP
//    public abstract String getWHIP();
//
//    // get ERA+
//    public abstract String getERAPlus();

    // get FIP
//    public abstract Double getFIP();

} // Player Class
