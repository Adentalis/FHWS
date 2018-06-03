package Wizzard.Karten;

import Wizzard.Karten.Card;

import java.util.ArrayList;

import static Wizzard.Karten.Color.*;
import static Wizzard.Karten.Value.*;


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

    public void printTrumpf(){
        for(Card c : hand) {
            if (c.Color == BLUE)
                System.out.print(" B ");
            else if (c.Color == RED)
                System.out.print(" R ");
            else if (c.Color == YELLOW)
                System.out.print(" Y ");
            else if (c.Color == GREEN)
                System.out.print(" G ");
            else if (c.Color == WHITE)
                System.out.print(" W ");
            else
                System.out.print(" X ");
        }
            for (Card c : hand) {
                if (c.Value == ONE)
                    System.out.print(" 1 ");
                else if (c.Value == TWO)
                    System.out.print(" 2 ");
                else if (c.Value == THREE)
                    System.out.print(" 3 ");
                else if (c.Value == FOUR)
                    System.out.print(" 4 ");
                else if (c.Value == FIVE)
                    System.out.print(" 5 ");
                else if (c.Value == SIX)
                    System.out.print(" 6 ");
                else if (c.Value == SEVEN)
                    System.out.print(" 7 ");
                else if (c.Value == EIGHT)
                    System.out.print(" 8 ");
                else if (c.Value == NINE)
                    System.out.print(" 9 ");
                else if (c.Value == TEN)
                    System.out.print(" 10");
                else if (c.Value == ELEVEN)
                    System.out.print(" 11");
                else if (c.Value == TWELVE)
                    System.out.print(" 12");
                else if (c.Value == THIRTEEN)
                    System.out.print(" 13");
                else if (c.Value == WIZZARD)
                    System.out.print(" W ");
                else if (c.Value == FOOL)
                    System.out.print(" N ");
                else
                    System.out.print(" X ");
            }

    }
    public void printHand(){
        System.out.print("\t\tFarbe: ");
        for(Card c : hand){
           if(c.Color==BLUE)
               System.out.print(" B ");
           else if(c.Color==RED)
               System.out.print(" R ");
           else if(c.Color==YELLOW)
               System.out.print(" Y ");
           else if(c.Color==GREEN)
               System.out.print(" G ");
           else if(c.Color==WHITE)
               System.out.print(" W ");
           else
               System.out.print(" X ");

        }
        System.out.println();
        System.out.print("\t\tWert:  ");
        for(Card c : hand){
            if(c.Value==ONE)
                System.out.print(" 1 ");
            else if(c.Value==TWO)
                System.out.print(" 2 ");
            else if(c.Value==THREE)
                System.out.print(" 3 ");
            else if(c.Value==FOUR)
                System.out.print(" 4 ");
            else if(c.Value==FIVE)
                System.out.print(" 5 ");
            else if(c.Value==SIX)
                System.out.print(" 6 ");
            else if(c.Value==SEVEN)
                System.out.print(" 7 ");
            else if(c.Value==EIGHT)
                System.out.print(" 8 ");
            else if(c.Value==NINE)
                System.out.print(" 9 ");
            else if(c.Value==TEN)
                System.out.print(" 10");
            else if(c.Value==ELEVEN)
                System.out.print(" 11");
            else if(c.Value==TWELVE)
                System.out.print(" 12");
            else if(c.Value==THIRTEEN)
                System.out.print(" 13");
            else if(c.Value==WIZZARD)
                System.out.print(" W ");
            else if(c.Value==FOOL)
                System.out.print(" N ");
            else
                System.out.print(" X ");

        }
        System.out.println();
        System.out.print("\t\tWähle:\t");
        for(int i = 1 ; i <=hand.size();i++){
            if(i<10)
            System.out.print(i+"  ");
            else
                System.out.print(i+" ");
        }
        System.out.println();
    }




}
