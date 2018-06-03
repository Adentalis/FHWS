package Wizzard;

import Wizzard.Player.AbstractPlayer;
import Wizzard.Player.HumanPlayer;
import Wizzard.Player.RandomPlayer;

import java.util.ArrayList;

public class Wizzard_Main {
    public static void main(String[] args) {
        System.out.println("Willkommen bei Wizzard");
        int amountOfPlayers = 4;
        int startRound= 8;
        ArrayList<AbstractPlayer> players = new ArrayList<>();
        players.add(new HumanPlayer("Daniel"));
        players.add(new RandomPlayer("Bot2"));
        players.add(new RandomPlayer("Bot3"));
        players.add(new RandomPlayer("Bot4"));


        Game game = new Game(players.size(),startRound,players);
    }
}
