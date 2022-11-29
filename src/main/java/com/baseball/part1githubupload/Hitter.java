package com.baseball.part1githubupload;
/**
 ***********************************************************************************
 * Title: Hitter
 * Author: Sean Laverty
 * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
 * File: Hitter.java
 * Description: extends player and creates an instance of a hitter from the abstract player class.
 *              As well as calculates hitter stats for player
 ***********************************************************************************
 * */
import java.text.DecimalFormat;

public class Hitter extends Player implements  java.io.Serializable{
    private final DecimalFormat df1 = new DecimalFormat("#.000");
//    private final DecimalFormat df2 = new DecimalFormat("#####");

    //Attributes
//    private Integer gamesPlayed;     // G
    private Integer atBats;          // AB
//    private Integer plateAppearances;// PA
    private Integer hits;            // H
//    private Integer base1;           // B1
//    private Integer base2;           // B2
//    private Integer base3;           // B3
//    private Integer homeRuns;        // HR
//    private Integer runs;            // R
//    private Integer runsBattedIn;    // RBI
//    private Integer BaseOnBall;      // BB
//    private Integer intentionalWalk; // IBB
//    private Integer strikeOuts;      // SO
//    private Integer hitByPitch;      // HBP
//    private Integer sacrificeFly;    // SF
//    private Integer sacrificeHit;    // SH
//    private Integer GroundIntoDoublePlay; // GDP
//    private Integer stolenBases;     // SB
//    private Integer caughtStealing;  // CS



    // noargs constructor
    public Hitter() {
        hits = 0;
        atBats = 0;
    }
    // Basic extend constructor
//    public Hitter(String name, String number) {
//        super(name, number);
//    }

    // Batting Average Constructor
    public Hitter(String name, Integer hits, Integer atBats){
        super(name);
        this.hits = hits;
        this.atBats = atBats;
    }

    // Minimal constructor
//    public Hitter(String name, String number, Integer atBats, Integer plateAppearances,
//                  Integer hits, Integer base1, Integer base2, Integer base3, Integer homeRuns,
//                  Integer runs, Integer runsBattedIn, Integer baseOnBall, Integer strikeOuts,
//                  Integer hitByPitch, Integer sacrificeFly, Integer stolenBases, Integer caughtStealing,
//                  Integer intentionalWalk) {
//        super(name, number);
//        this.atBats = atBats;
//        this.plateAppearances = plateAppearances;
//        this.hits = hits;
//        this.base1 = base1;
//        this.base2 = base2;
//        this.base3 = base3;
//        this.homeRuns = homeRuns;
//        this.runs = runs;
//        this.runsBattedIn = runsBattedIn;
//        this.BaseOnBall = baseOnBall;
//        this.strikeOuts = strikeOuts;
//        this.hitByPitch = hitByPitch;
//        this.sacrificeFly = sacrificeFly;
//        this.stolenBases = stolenBases;
//        this.caughtStealing = caughtStealing;
//        this.intentionalWalk = intentionalWalk;
//    }

    // Full Constructor
//    public Hitter(String name, String number, Integer gamesPlayed, Integer atBats,
//                  Integer plateAppearances, Integer hits, Integer base1, Integer base2,
//                  Integer base3, Integer homeRuns, Integer runs, Integer runsBattedIn,
//                  Integer baseOnBall, Integer intentionalWalk, Integer strikeOuts,
//                  Integer hitByPitch, Integer sacrificeFly, Integer sacrificeHit,
//                  Integer groundIntoDoublePlay, Integer stolenBases, Integer caughtStealing) {
//        super(name, number);
//        this.gamesPlayed = gamesPlayed;
//        this.atBats = atBats;
//        this.plateAppearances = plateAppearances;
//        this.hits = hits;
//        this.base1 = base1;
//        this.base2 = base2;
//        this.base3 = base3;
//        this.homeRuns = homeRuns;
//        this.runs = runs;
//        this.runsBattedIn = runsBattedIn;
//        BaseOnBall = baseOnBall;
//        this.intentionalWalk = intentionalWalk;
//        this.strikeOuts = strikeOuts;
//        this.hitByPitch = hitByPitch;
//        this.sacrificeFly = sacrificeFly;
//        this.sacrificeHit = sacrificeHit;
//        GroundIntoDoublePlay = groundIntoDoublePlay;
//        this.stolenBases = stolenBases;
//        this.caughtStealing = caughtStealing;
//    }

    // Setters
//    public void setGamesPlayed(Integer gamesPlayed) {
//        this.gamesPlayed = gamesPlayed;
//    }

//    public void setAtBats(Integer atBats) {
//        this.atBats = atBats;
//    }

//    public void setPlateAppearances(Integer plateAppearances) {
//        this.plateAppearances = plateAppearances;
//    }

//    public void setHits(Integer hits) {
//        this.hits = hits;
//    }

//    public void setBase1(Integer base1) {
//        this.base1 = base1;
//    }

//    public void setBase2(Integer base2) {
//        this.base2 = base2;
//    }
//
//    public void setBase3(Integer base3) {
//        this.base3 = base3;
//    }
//
//    public void setHomeRuns(Integer homeRuns) {
//        this.homeRuns = homeRuns;
//    }
//
//    public void setRuns(Integer runs) {
//        this.runs = runs;
//    }
//
//    public void setRunsBattedIn(Integer runsBattedIn) {
//        this.runsBattedIn = runsBattedIn;
//    }
//
//    public void setBaseOnBall(Integer baseOnBall) {
//        BaseOnBall = baseOnBall;
//    }
//
//    public void setIntentionalWalk(Integer intentionalWalk) {
//        this.intentionalWalk = intentionalWalk;
//    }
//
//    public void setStrikeOuts(Integer strikeOuts) {
//        this.strikeOuts = strikeOuts;
//    }
//
//    public void setHitByPitch(Integer hitByPitch) {
//        this.hitByPitch = hitByPitch;
//    }
//
//    public void setSacrificeFly(Integer sacrificeFly) {
//        this.sacrificeFly = sacrificeFly;
//    }
//
//    public void setSacrificeHit(Integer sacrificeHit) {
//        this.sacrificeHit = sacrificeHit;
//    }
//
//    public void setGroundIntoDoublePlay(Integer groundIntoDoublePlay) {
//        GroundIntoDoublePlay = groundIntoDoublePlay;
//    }
//
//    public void setStolenBases(Integer stolenBases) {
//        this.stolenBases = stolenBases;
//    }
//
//    public void setCaughtStealing(Integer caughtStealing) {
//        this.caughtStealing = caughtStealing;
//    }

    // Getters
//    public Integer getGamesPlayed() {
//        return gamesPlayed;
//    }

    public Integer getAtBats() {
        return atBats;
    }

//    public Integer getPlateAppearances() {
//        return plateAppearances;
//    }

    public Integer getHits() {
        return hits;
    }

//    public Integer getBase1() {
//        return base1;
//    }
//
//    public Integer getBase2() {
//        return base2;
//    }
//
//    public Integer getBase3() {
//        return base3;
//    }
//
//    public Integer getHomeRuns() {
//        return homeRuns;
//    }
//
//    public Integer getRuns() {
//        return runs;
//    }
//
//    public Integer getRunsBattedIn() {
//        return runsBattedIn;
//    }
//
//    public Integer getBaseOnBall() {
//        return BaseOnBall;
//    }
//
//    public Integer getIntentionalWalk() {
//        return intentionalWalk;
//    }
//
//    public Integer getStrikeOuts() {
//        return strikeOuts;
//    }
//
//    public Integer getHitByPitch() {
//        return hitByPitch;
//    }
//
//    public Integer getSacrificeFly() {
//        return sacrificeFly;
//    }
//
//    public Integer getSacrificeHit() {
//        return sacrificeHit;
//    }
//
//    public Integer getGroundIntoDoublePlay() {
//        return GroundIntoDoublePlay;
//    }
//
//    public Integer getStolenBases() {
//        return stolenBases;
//    }
//
//    public Integer getCaughtStealing() {
//        return caughtStealing;
//    }

    // getBattingAverage
    @Override
    public String getAverage() {
        double value = (double)(this.getHits()) / (double)(this.getAtBats());
        return df1.format(value);
    }


    // getSluggingPercent
//    @Override
//    public String getSLG() {
//        double value = (double) (getBase1() + 2*getBase2() + 3*getBase3() + 4*getHomeRuns()) /
//                (double) (getAtBats());
//        return df1.format(value);
//    }

    // getOnBasePercent
//    @Override
//    public String getOBP() {
//        double value = (double)(this.getHits() + this.getBaseOnBall() + this.getHitByPitch()) /
//                (double)(getAtBats() + getBaseOnBall() + getHitByPitch() + getSacrificeFly());
//        return df1.format(value);
//    }

    // getOnBasePlusSlugging
//    @Override
//    public String getOPS() {
//        double value = Double.parseDouble(this.getOBP()) + Double.parseDouble(this.getSLG());
//        return df1.format(value);
//    }

    // getIsolatedPower
//    @Override
//    public String getISO(){
//        double value = Double.parseDouble(this.getSLG()) - Double.parseDouble(this.getAverage());
//        return df1.format(value);
//    }


//    @Override
//    public String getOPSPlus(){
//        double lgOPB = 0.309;
//        double lgSlug = 0.392;
//        double value = (100 * ((Double.parseDouble(getOBP()) / lgOPB) + (Double.parseDouble(getSLG()) / lgSlug) -1));
//        return df2.format(value);
//    }
   // wOBA = (0.690×uBB + 0.722×HBP + 0.888×1B + 1.271×2B + 1.616×3B + 2.101×HR) / (AB + BB – IBB + SF + HBP)
//    @Override
//    public String get_wOBA(){
//        double value = (0.690 * getBaseOnBall() + 0.722* getHitByPitch() +
//                0.888 * getBase1() + 1.271 * getBase2() + 1.616 * getBase3() + 2.101 * getHomeRuns()) /
//                (getAtBats() + getBaseOnBall()  + getSacrificeFly() + getHitByPitch());
//
//        return df1.format(value);
//    }

    // Future Method for reformation my classes and founding to a particular decimal place
//    public static double roundN(double num, int places) {
//        return (int)(num * Math.pow(10, places) + 0.5) / (Math.pow(10, places));
//    }
//-------------------------------------------------------------------------------------------
//    @Override
//    public String getWinLossPercent(){
//        return null;
//    }
    @Override
    public String getERA(){
        return null;
    }
//    @Override
//    public String getWHIP(){
//        return null;
//    }
//    @Override
//    public String getERAPlus(){
//        return null;
//    }
//------------------------------------------------------------------------------------------

//    @Override
//    public String toString(){
//        String result = "";
//        result += super.toString() + "\n";
//        result += "Standard ";
//        result += "[AVG: " + getAverage() + " ";
//        result += " SLG: " + getSLG() + " ";
//        result += " OBP: " + getOBP() + " ";
//        result += " OPS: " + getOPS() +  " " ;
//        result += " ISO: " + getISO() + " ]";
//        result += "\nAdvanced [";
//        result += "OPS+ " + getOPSPlus() + " wOBA: " + get_wOBA() + " ]";
//        return result;
//    } // toString (method)

    @Override
    public String toString(){
        String result = "";
        result += super.getName() + "\t";
        result += " AVG= " + getAverage();
        result += "\n";
        return result;
    } // toString (method)

} // Hitter (class)
