package Wizzard.Karten;


import java.util.Comparator;

import static Wizzard.Karten.Color.*;
import static Wizzard.Karten.Value.*;

public class Card {
    Enum Color;
    Enum Value;
    private int id;

    public Enum getColor() {
        return Color;
    }

    public void setColor(Enum color) {
        Color = color;
    }

    public Card(Enum Color, Enum Value){
        this.Color=Color;
        this.Value=Value;
    }

    public Enum getValue() {
        return Value;
    }

    public void setValue(Enum value) {
        Value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Comparator<Card> comp = new Comparator<Card>() {
        public int compare(Card c1 ,Card c2){
            return c2.getId()-c1.getId();
        }
    };

    public Card (int i) {
        this.id = i;
        switch (id) {
            case 1:
                this.Color= BLUE;
                this.Value= ONE;
                break;
            case 2:
                this.Color= BLUE;
                this.Value= TWO;
                break;
            case 3:
                this.Color= BLUE;
                this.Value= THREE;
                break;
            case 4:
                this.Color= BLUE;
                this.Value= FOUR;
                break;
            case 5:
                this.Color= BLUE;
                this.Value= FIVE;
                break;
            case 6:
                this.Color= BLUE;
                this.Value= SIX;
                break;
            case 7:
                this.Color= BLUE;
                this.Value= SEVEN;
                break;
            case 8:
                this.Color= BLUE;
                this.Value= EIGHT;
                break;
            case 9:
                this.Color= BLUE;
                this.Value= NINE;
                break;
            case 10:
                this.Color= BLUE;
                this.Value= TEN;
                break;
            case 11:
                this.Color= BLUE;
                this.Value= ELEVEN;
                break;
            case 12:
                this.Color= BLUE;
                this.Value= TWELVE;
                break;
            case 13:
                this.Color= BLUE;
                this.Value= THIRTEEN;
                break;
            case 14:
                this.Color= RED;
                this.Value= ONE;
                break;
            case 15:
                this.Color= RED;
                this.Value= TWO;
                break;
            case 16:
                this.Color= RED;
                this.Value= THREE;
                break;
            case 17:
                this.Color= RED;
                this.Value= FOUR;
                break;
            case 18:
                this.Color= RED;
                this.Value= FIVE;
                break;
            case 19:
                this.Color= RED;
                this.Value= SIX;
                break;
            case 20:
                this.Color= RED;
                this.Value= SEVEN;
                break;
            case 21:
                this.Color= RED;
                this.Value= EIGHT;
                break;
            case 22:
                this.Color= RED;
                this.Value= NINE;
                break;
            case 23:
                this.Color= RED;
                this.Value= TEN;
                break;
            case 24:
                this.Color= RED;
                this.Value= ELEVEN;
                break;
            case 25:
                this.Color= RED;
                this.Value= TWELVE;
                break;
            case 26:
                this.Color= RED;
                this.Value= THIRTEEN;
                break;
            case 27:
                this.Color= YELLOW;
                this.Value= ONE;
                break;
            case 28:
                this.Color= YELLOW;
                this.Value= TWO;
                break;
            case 29:
                this.Color= YELLOW;
                this.Value= THREE;
                break;
            case 30:
                this.Color= YELLOW;
                this.Value= FOUR;
                break;
            case 31:
                this.Color= YELLOW;
                this.Value= FIVE;
                break;
            case 32:
                this.Color= YELLOW;
                this.Value= SIX;
                break;
            case 33:
                this.Color= YELLOW;
                this.Value= SEVEN;
                break;
            case 34:
                this.Color= YELLOW;
                this.Value= EIGHT;
                break;
            case 35:
                this.Color= YELLOW;
                this.Value= NINE;
                break;
            case 36:
                this.Color= YELLOW;
                this.Value= TEN;
                break;
             case 37:
                 this.Color= YELLOW;
                 this.Value= ELEVEN;
                 break;
            case 38:
                this.Color= YELLOW;
                this.Value= TWELVE;
                break;
             case 39:
                 this.Color= YELLOW;
                 this.Value= THIRTEEN;
                 break;
            case 40:
                this.Color= GREEN;
                this.Value= ONE;
                break;
             case 41:
                 this.Color= GREEN;
                 this.Value= TWO;
                 break;
            case 42:
                this.Color= GREEN;
                this.Value= THREE;
                break;
             case 43:
                 this.Color= GREEN;
                 this.Value= FOUR;
                 break;
            case 44:
                this.Color= GREEN;
                this.Value= FIVE;
                break;
            case 45:
                this.Color= GREEN;
                this.Value= SIX;
                break;
            case 46:
                this.Color= GREEN;
                this.Value= SEVEN;
                break;
            case 47:
                this.Color= GREEN;
                this.Value= EIGHT;
                break;
            case 48:
                this.Color= GREEN;
                this.Value= NINE;
                break;
            case 49:
                this.Color= GREEN;
                this.Value= TEN;
                break;
            case 50:
                this.Color= GREEN;
                this.Value= ELEVEN;
                break;
            case 51:
                this.Color= GREEN;
                this.Value= TWELVE;
                break;
            case 52:
                this.Color= GREEN;
                this.Value= THIRTEEN;
                break;
            case 53:
            case 54:
            case 55:
            case 56:
                this.Color= WHITE;
                this.Value= FOOL;
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                this.Color= WHITE;
                this.Value= WIZZARD;
                break;

            default:
                this.Color= Wizzard.Karten.Color.NONE;
                this.Value= Wizzard.Karten.Color.NONE;
                break;


        }

    }


}
