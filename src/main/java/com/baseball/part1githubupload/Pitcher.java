package com.baseball.part1githubupload; /**
 * **********************************************************************************
 * Title: Pitcher
 * Author: Sean Laverty
 * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
 * File: Pitcher.java
 * Description: extends player and creates an instance pitcher for the abstract player class
 *              of calculates Pitcher stats for player
 * **********************************************************************************
 */

public class Pitcher extends Player {
//    private final DecimalFormat df1 = new DecimalFormat("#.000");
//    private final DecimalFormat df2 = new DecimalFormat("#.00");
//    private final DecimalFormat df3 = new DecimalFormat("#");
    private Integer earnedRuns;
    private Double inningsPitched;
    private Integer hits;
    private Integer wins;
    private Integer loses;
    private Integer baseOnBall;
    private Integer strikeOuts;
    private Integer battersFaced;
    private Integer homeRuns;


    // noargs constructor
    public Pitcher() {
        earnedRuns = 0;
        inningsPitched = 0.0;
    }

    // Basic extend constructor
//    public Pitcher(String name, String number) {
//        super(name, number);
//    }

    public Pitcher(String name, Integer earnedRuns, Double inningsPitched){
        super(name);
        this.earnedRuns = earnedRuns;
        this.inningsPitched = inningsPitched;
    }



    // Minimal Constructor
//    public Pitcher(String name, String number, Integer earnedRuns, Double inningsPitched, Integer hits, Integer wins,
//                   Integer loses, Integer baseOnBall) {
//        super(name, number);
//        this.earnedRuns = earnedRuns;
//        this.inningsPitched = inningsPitched;
//        this.hits = hits;
//        this.wins = wins;
//        this.loses = loses;
//        this.baseOnBall = baseOnBall;
//    }

    //Full Constructor
//    public Pitcher(String name, String number, Integer earnedRuns, Double inningsPitched, Integer hits,
//                   Integer wins, Integer loses, Integer baseOnBall, Integer strikeOuts,
//                   Integer battersFaced, Integer homeRuns) {
//        super(name, number);
//        this.earnedRuns = earnedRuns;
//        this.inningsPitched = inningsPitched;
//        this.hits = hits;
//        this.wins = wins;
//        this.loses = loses;
//        this.baseOnBall = baseOnBall;
//        this.strikeOuts = strikeOuts;
//        this.battersFaced = battersFaced;
//        this.homeRuns = homeRuns;
//    }

    // setters
    public void setEarnedRuns(Integer earnedRuns) {
        this.earnedRuns = earnedRuns;
    }

    public void setInningsPitched(Double inningsPitched) {
        this.inningsPitched = inningsPitched;
    }

//    public void setHits(Integer hits) {
//        this.hits = hits;
//    }
//
//    public void setWins(Integer wins) {
//        this.wins = wins;
//    }
//
//    public void setLoses(Integer loses) {
//        this.loses = loses;
//    }
//
//    public void setBaseOnBall(Integer baseOnBall) {
//        this.baseOnBall = baseOnBall;
//    }
//
//    public void setStrikeOuts(Integer strikeOuts) {
//        this.strikeOuts = strikeOuts;
//    }
//
//    public void setBattersFaced(Integer battersFaced) {
//        this.battersFaced = battersFaced;
//    }
//
//    public void setHomeRuns(Integer homeRuns) {
//        this.homeRuns = homeRuns;
//    }

    // Getters
    public Integer getEarnedRuns() {
        return earnedRuns;
    }

    public Double getInningsPitched() {
        return inningsPitched;
    }

//    public Integer getHits() {
//        return hits;
//    }
//
//    public Integer getWins() {
//        return wins;
//    }
//
//    public Integer getLoses() {
//        return loses;
//    }
//
//    public Integer getBaseOnBall() {
//        return baseOnBall;
//    }
//
//    public Integer getStrikeOuts() {
//        return strikeOuts;
//    }
//
//    public Integer getBattersFaced() {
//        return battersFaced;
//    }
//
//    public Integer getHomeRuns() {
//        return homeRuns;
//    }

    //------------------------------------------------------------------------------
//Integer earnedRuns, Double inningsPitched, Integer walks,
//                    Integer hits, Integer wins, Integer loses, Integer runs,
//                    Integer baseOnBall, Integer strikeOuts, Integer battersFaced
    // Pitcher statistics getters
//    @Override
//    public String getWinLossPercent() {
//        double value = (double) (this.getWins()) / (double) (this.getWins() + this.getLoses());
//        return df1.format(value);
//    }

    @Override
    public String getERA() {
        double value = (9 * (double) (this.getEarnedRuns()) / (this.getInningsPitched()));
        return String.format("%.2f", value);
    }

//    @Override
//    public String getWHIP() {
//        double value = ((double) (this.getBaseOnBall() + this.getHits()) / (this.getInningsPitched()));
//        return df1.format(value);
//    }
//
//    @Override
//    public String getERAPlus() {
//        double alConstantERA = 3.88;
//        double value = (100 * (alConstantERA / Double.parseDouble(getERA())));
//        return df3.format(value);
//    }

    // Future Method for reformation my classes and founding to a particular decimal place
//    public static double roundN(double num, int places) {
//        return (int)(num * Math.pow(10, places) + 0.5) / (Math.pow(10, places));
//    }

    //------------------------------------------------------------------------------
    // Unnecessary getters
    @Override
    public String getAverage() {
        return null;
    }

//    @Override
//    public String getSLG() {
//        return null;
//    }
//
//    @Override
//    public String getOBP() {
//        return null;
//    }
//
//    @Override
//    public String getOPS() {
//        return null;
//    }
//
//    @Override
//    public String getISO() {
//        return null;
//    }
//
//    @Override
//    public String getOPSPlus() {
//        return null;
//    }
//
//    @Override
//    public String get_wOBA() {
//        return null;
//    }

    //------------------------------------------------------------------------------
//    @Override
//    public String toString() {
//        String result = "";
//        result += super.toString() + "\n";
//        result += "W-L%: " + getWinLossPercent() + "%  ";
//        result += "ERA: " + getERA() + " ";
//        result += "WHIP: " + getWHIP() + " ";
//        result += "ERA+: " + getERAPlus();
//        return result;
//    } // toString (method)

    @Override
    public String toString(){
        String result = "";
        result += super.getName() + "\t";
        result += " ERA= " + getERA();
        result += "\n";
        return result;
    } // toString (method)

}
