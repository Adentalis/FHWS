package Wizzard.Player;

import Wizzard.Karten.Hand;

public abstract class AbstractPlayer {


    int points;
    int id;
    Hand hand;

    int gesagteStichte, aktuelleStiche;

    String name;

    public AbstractPlayer(String name){
        this.name = name;
        this.gesagteStichte=0;
        this.aktuelleStiche=0;
        this.points=0;
    }

    public void setHand(Hand h){
        this.hand= h;

    }
    public Hand getHand(){
        return hand;
    }

    public abstract void getMove();


    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void addPoints(int points){
        this.points+=points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGesagteStichte() {
        return gesagteStichte;
    }
    public abstract int sayStiche();

    public void setGesagteStichte(int gesagteStichte) {
        this.gesagteStichte = gesagteStichte;
    }

    public int getAktuelleStiche() {
        return aktuelleStiche;
    }

    public void setAktuelleStiche(int aktuelleStiche) {
        this.aktuelleStiche = aktuelleStiche;
    }



}
