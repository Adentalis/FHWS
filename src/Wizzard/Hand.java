package Wizzard;

import java.util.ArrayList;

public class Hand {

    ArrayList<Card> hand = new ArrayList<>();

    public Hand(ArrayList<Integer> cardList ){
        for(int a :cardList){
            hand.add(new Card(a));
        }
    }

    public int getNumberOfCards(){
        return hand.size();
    }




}
