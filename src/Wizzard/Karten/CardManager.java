package Wizzard.Karten;

import Wizzard.Karten.Hand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class CardManager {
    private int roundNumber;
    private int numberOfPlayers;
    private int numberOfCardsThisRound;
    private int trumpfKarte;

    private ArrayList<Hand> hands = new ArrayList<>();
    private ArrayList<Integer> allCards = new ArrayList<>();
    private ArrayList<Integer> choosenCards = new ArrayList<>();
    private ArrayList<Integer> cardsForPlayer = new ArrayList<>();

    public CardManager(int numberOfPlayers){
        this.numberOfPlayers=numberOfPlayers;
    }

    public ArrayList<Hand> getCardsForPlayers(int round){
        this.roundNumber= round;
        numberOfCardsThisRound = roundNumber * numberOfPlayers;
        hands.clear();
        initAllCards();
        initChoosenCards();

        //erstelle Alle Hände
        for(int i = 0 ; i <numberOfPlayers ;i++){

            for(int j = 0 ; j<roundNumber;j++){
                cardsForPlayer.add(choosenCards.get(0));
                choosenCards.remove(0);
            }
            hands.add(new Hand(cardsForPlayer));
            cardsForPlayer.clear();
        }

        //trump erstellen
        cardsForPlayer.add(choosenCards.get(0));
        hands.add(new Hand(cardsForPlayer));
        cardsForPlayer.clear();

        //Ich muss auf die ArrayList hand von jeder Hand zugreifen um diese sortieren zu könnnen!
        Collections.sort(hands.get(0).hand,Card.comp);

        return hands;
    }

    private void initChoosenCards() {
        choosenCards.clear();
        Random rnd = new Random();
        int takeNumber;
        //ziehe jedesmal eine rnd nummer aus der restlichen Liste
        // das +1 wegen der Trumpfkarte

        if(numberOfCardsThisRound<60) {
            for (int i = 0; i < numberOfCardsThisRound + 1; i++) {
                takeNumber = rnd.nextInt(allCards.size());
                choosenCards.add(allCards.get(takeNumber));
                allCards.remove(takeNumber);

            }
        }else { // falls letzte Runde ist
            for (int i = 0; i < numberOfCardsThisRound; i++) {
                takeNumber = rnd.nextInt(allCards.size());
                choosenCards.add(allCards.get(takeNumber));
                allCards.remove(takeNumber);
            }
            // erstelle eine Karte mit -1 was wert/color=None ist, es gibt ja keinen trumpf am ende
            choosenCards.add(-1);
        }



    }

    private void initAllCards() {
        allCards.clear();
        for(int i = 1 ; i <61 ; i++){
            allCards.add(i);
        }
    }


}
