package Wizzard;

import Wizzard.Player.HumanPlayer;

import java.util.ArrayList;

public class Game{

    final int  PLAYERS =4;
    HumanPlayer hp = new HumanPlayer("Daniel");
    CardManager cm = new CardManager(PLAYERS);
    ArrayList<Hand> handsForThisRound = new ArrayList<>();

    public static void main(String[] args) {
        Game game = new Game();
    }



    public Game(){
        System.out.println("Willkommen bei Wizzard");
        //System.out.println("Gegen wie viele Computer Gegner möchtest du spielen?");
        handsForThisRound= cm.getCardsForPlayers(5);







    }
}
