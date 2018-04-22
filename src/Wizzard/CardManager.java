package Wizzard;

import java.util.ArrayList;
import java.util.Random;

public class CardManager {
    private int roundNumber;
    private int numberOfPlayers;
    private int numberOfCardsThisRound;

    private ArrayList<Hand> hands = new ArrayList<>();
    private ArrayList<Integer> allCards = new ArrayList<>();
    private ArrayList<Integer> choosenCards = new ArrayList<>();

    public CardManager(int numberOfPlayers){
        this.numberOfPlayers=numberOfPlayers;
    }

    public ArrayList<Hand> getCardsForPlayers(int round){
        this.roundNumber= round;
        numberOfCardsThisRound = roundNumber * numberOfPlayers;
        hands.clear();
        initAllCards();
        initChoosenCards();

        for(int a : choosenCards){
            System.out.print(a + " ");

        }

        ArrayList<Integer> cardsForPlayer = new ArrayList<>();
        cardsForPlayer.add(choosenCards.get(0));
        cardsForPlayer.add(choosenCards.get(1));
        cardsForPlayer.add(choosenCards.get(2));
        cardsForPlayer.add(choosenCards.get(3));

        hands.add(new Hand(cardsForPlayer));

        return hands;
    }

    private void initChoosenCards() {
        choosenCards.clear();
        Random rnd = new Random();

        //ziehe jedesmal eine rnd nummer aus der restlichen Liste
        for(int i = 0 ; i < numberOfCardsThisRound ; i++){
            int numbersleft = allCards.size();
            int takeNumber = rnd.nextInt(numbersleft);
            choosenCards.add(allCards.get(takeNumber));
            allCards.remove(takeNumber);

        }




    }

    private void initAllCards() {
        allCards.clear();
        for(int i = 1 ; i <61 ; i++){
            allCards.add(i);
        }
    }


}
