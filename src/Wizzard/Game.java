package Wizzard;

import Wizzard.Player.HumanPlayer;

import java.util.ArrayList;

public class Game{

    final int  PLAYERS =4;
    HumanPlayer hp = new HumanPlayer("Daniel");
    CardManager cm = new CardManager(PLAYERS);
    ArrayList<Hand> handsForThisRound;

    public static void main(String[] args) {
        Game game = new Game();
    }



    public Game(){
        System.out.println("Willkommen bei Wizzard");
        //System.out.println("Gegen wie viele Computer Gegner möchtest du spielen?");
        handsForThisRound= cm.getCardsForPlayers(5);

        System.out.println(handsForThisRound.size());
        Hand h1 = handsForThisRound.get(0);
        h1.printHand();







    }
}
