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
        hands.clear();
        initAllCards();
        numberOfCardsThisRound = roundNumber * numberOfPlayers;
        initChoosenCards();

        for(int i = 0 ; i < numberOfPlayers ; i++){


        }




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
