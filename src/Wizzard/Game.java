package Wizzard;

import Wizzard.Karten.CardManager;
import Wizzard.Karten.Hand;
import Wizzard.Player.AbstractPlayer;
import Wizzard.Player.HumanPlayer;

import java.util.ArrayList;

public class Game{

    final int  NRPLAYERS;
    int round;

    HumanPlayer hp;
    CardManager cm;
    ArrayList<Hand> handsForThisRound;
    ArrayList<AbstractPlayer> players;
    Board board;
    Hand trumpf;
    //0 = Ich , 1 = Spieler 2 , bis Spieleranzahl -1
    int playerStartingRound;




    public Game(int players, int startRound, ArrayList<AbstractPlayer> playerArrayList){
        this.NRPLAYERS =players;
        this.round= startRound;
        this.players=playerArrayList;
        playerStartingRound=0;
        cm = new CardManager(NRPLAYERS);
        handsForThisRound= cm.getCardsForPlayers(round);

        board = new Board();
        givePlayerCards();
        showBoard();
        startGame();



    }

    private void startGame() {

        askForStiche();

    }

    private void askForStiche() {
        for(int i =playerStartingRound ; i<NRPLAYERS; i++){
            players.get(i).sayStiche();

        }

    }

    private void givePlayerCards() {
        players.get(0).setHand(handsForThisRound.get(0));
        players.get(1).setHand(handsForThisRound.get(1));
        players.get(2).setHand(handsForThisRound.get(2));
        players.get(3).setHand(handsForThisRound.get(3));
        trumpf=handsForThisRound.get(4);


    }

    private void showBoard() {

        board.showBoard(players,trumpf);

    }
}
