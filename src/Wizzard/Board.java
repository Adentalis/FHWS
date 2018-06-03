package Wizzard;

import Wizzard.Karten.Card;
import Wizzard.Karten.Hand;
import Wizzard.Player.AbstractPlayer;

import java.util.ArrayList;

public class Board {

    public Board() {
    }

    ArrayList<AbstractPlayer> players;

    public void showBoard(ArrayList<AbstractPlayer> players,Hand trumpf){
        this.players=players;

        System.out.println("\t\t\t\t\t"+players.get(2).getName()+"\t\t\t\t\t\t\t\t\t\t\t\t\tSpieler\t\tAktuelle Stiche\t\tStiche gesagt\t\tPunkte  ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+players.get(0).getName()+"\t\t\t"+players.get(0).getAktuelleStiche()+"\t\t\t\t\t"+players.get(0).getGesagteStichte()+"\t\t\t\t"+players.get(0).getPoints());
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+players.get(1).getName()+"\t\t\t"+players.get(1).getAktuelleStiche()+"\t\t\t\t\t"+players.get(1).getGesagteStichte()+"\t\t\t\t"+players.get(1).getPoints());
        System.out.println("\t\t\t\t  ----------\t\t\t\t\t\t\t\t\t\t\t\t"+players.get(2).getName()+"\t\t\t"+players.get(2).getAktuelleStiche()+"\t\t\t\t\t"+players.get(2).getGesagteStichte()+"\t\t\t\t"+players.get(2).getPoints());
        System.out.print(players.get(1).getName()+"\t\t\t  | "); trumpf.printTrumpf();System.out.println(" |\t\t\t"+players.get(3).getName()+"\t\t\t\t\t\t\t\t"+players.get(3).getName()+"\t\t\t"+players.get(3).getAktuelleStiche()+"\t\t\t\t\t"+players.get(3).getGesagteStichte()+"\t\t\t\t"+players.get(3).getPoints());
        System.out.println("\t\t\t\t  ----------");
        System.out.println();
        System.out.println();
        System.out.println();

        players.get(0).getHand().printHand();


        System.out.println("\t\t\t\t\t"+players.get(0).getName());



    }



}