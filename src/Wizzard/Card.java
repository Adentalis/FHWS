package Wizzard;

;

import static Wizzard.Color.*;
import static Wizzard.Value.*;

public class Card {
    Enum Color;
    Enum Value;

    public Card(Enum Color, Enum Value){
        this.Color=Color;
        this.Value=Value;
    }

    public Card (int i) {
        switch (i) {
            case 1:
                this.Color= BLUE;
                this.Value= ONE;
                break;
            case 2:
                this.Color= BLUE;
                this.Value= TWO;
            case 3:
                this.Color= BLUE;
                this.Value= THREE;
            case 4:
                this.Color= BLUE;
                this.Value= FOUR;
            case 5:
                this.Color= BLUE;
                this.Value= FIVE;
            case 6:
                this.Color= BLUE;
                this.Value= SIX;
            case 7:
                this.Color= BLUE;
                this.Value= SEVEN;
            case 8:
                this.Color= BLUE;
                this.Value= EIGHT;
            case 9:
                this.Color= BLUE;
                this.Value= NINE;
            case 10:
                this.Color= BLUE;
                this.Value= TEN;
            case 11:
                this.Color= BLUE;
                this.Value= ELEVEN;
            case 12:
                this.Color= BLUE;
                this.Value= TWELVE;
            case 13:
                this.Color= BLUE;
                this.Value= THIRTEEN;
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
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.TWO));
            case 28:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.THREE));
            case 29:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.FOUR));
            case 30:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.FIVE));
            case 31:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.SIX));
            case 32:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.SEVEN));
            case 33:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.EIGHT));
            case 34:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.NINE));
            case 35:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.TEN));
            case 36:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.ELEVEN));
            case 37:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.TWELVE));
            case 38:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.THIRTEEN));
            case 39:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.ONE));
            case 40:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.TWO));
            case 41:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.THREE));
            case 42:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.FOUR));
            case 43:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.FIVE));
            case 44:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.SIX));
            case 45:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.SEVEN));
            case 46:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.EIGHT));
            case 47:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.NINE));
            case 48:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.TEN));
            case 49:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.ELEVEN));
            case 50:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.TWELVE));
            case 51:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.THIRTEEN));
            case 52:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.ONE));
            case 53:
            case 54:
            case 55:
            case 56:
                return (new Card(Wizzard.Color.WHITE, Wizzard.Value.ELEVEN));
            case 57:
            case 58:
            case 59:
            case 60:
                return (new Card(Wizzard.Color.WHITE, Wizzard.Value.FOOL));

            default:
                return (new Card(Wizzard.Color.NONE, Wizzard.Value.NONE));


        }
    }



    /*
    public Card (int i) {
        switch (i) {
            case 1:
                return (new Card(Wizzard.Color.BLUE, Wizzard.Value.ONE));
            case 2:
                return (new Card(Wizzard.Color.BLUE, Wizzard.Value.TWO));
            case 3:
                return (new Card(Wizzard.Color.BLUE, Wizzard.Value.THREE));
            case 4:
                return (new Card(Wizzard.Color.BLUE, Wizzard.Value.FOUR));
            case 5:
                return (new Card(Wizzard.Color.BLUE, Wizzard.Value.FIVE));
            case 6:
                return (new Card(Wizzard.Color.BLUE, Wizzard.Value.SIX));
            case 7:
                return (new Card(Wizzard.Color.BLUE, Wizzard.Value.SEVEN));
            case 8:
                return (new Card(Wizzard.Color.BLUE, Wizzard.Value.EIGHT));
            case 9:
                return (new Card(Wizzard.Color.BLUE, Wizzard.Value.NINE));
            case 10:
                return (new Card(Wizzard.Color.BLUE, Wizzard.Value.TEN));
            case 11:
                return (new Card(Wizzard.Color.BLUE, Wizzard.Value.ELEVEN));
            case 12:
                return (new Card(Wizzard.Color.BLUE, Wizzard.Value.TWELVE));
            case 13:
                return (new Card(Wizzard.Color.BLUE, Wizzard.Value.THIRTEEN));
            case 14:
                return (new Card(Wizzard.Color.RED, Wizzard.Value.TWO));
            case 15:
                return (new Card(Wizzard.Color.RED, Wizzard.Value.THREE));
            case 16:
                return (new Card(Wizzard.Color.RED, Wizzard.Value.FOUR));
            case 17:
                return (new Card(Wizzard.Color.RED, Wizzard.Value.FIVE));
            case 18:
                return (new Card(Wizzard.Color.RED, Wizzard.Value.SIX));
            case 19:
                return (new Card(Wizzard.Color.RED, Wizzard.Value.SEVEN));
            case 20:
                return (new Card(Wizzard.Color.RED, Wizzard.Value.EIGHT));
            case 21:
                return (new Card(Wizzard.Color.RED, Wizzard.Value.NINE));
            case 22:
                return (new Card(Wizzard.Color.RED, Wizzard.Value.TEN));
            case 23:
                return (new Card(Wizzard.Color.RED, Wizzard.Value.ELEVEN));
            case 24:
                return (new Card(Wizzard.Color.RED, Wizzard.Value.TWELVE));
            case 25:
                return (new Card(Wizzard.Color.RED, Wizzard.Value.THIRTEEN));
            case 26:
                return (new Card(Wizzard.Color.RED, Wizzard.Value.ONE));
            case 27:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.TWO));
            case 28:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.THREE));
            case 29:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.FOUR));
            case 30:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.FIVE));
            case 31:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.SIX));
            case 32:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.SEVEN));
            case 33:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.EIGHT));
            case 34:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.NINE));
            case 35:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.TEN));
            case 36:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.ELEVEN));
            case 37:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.TWELVE));
            case 38:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.THIRTEEN));
            case 39:
                return (new Card(Wizzard.Color.GREEN, Wizzard.Value.ONE));
            case 40:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.TWO));
            case 41:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.THREE));
            case 42:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.FOUR));
            case 43:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.FIVE));
            case 44:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.SIX));
            case 45:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.SEVEN));
            case 46:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.EIGHT));
            case 47:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.NINE));
            case 48:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.TEN));
            case 49:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.ELEVEN));
            case 50:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.TWELVE));
            case 51:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.THIRTEEN));
            case 52:
                return (new Card(Wizzard.Color.YELLOW, Wizzard.Value.ONE));
            case 53:
            case 54:
            case 55:
            case 56:
                return (new Card(Wizzard.Color.WHITE, Wizzard.Value.ELEVEN));
            case 57:
            case 58:
            case 59:
            case 60:
                return (new Card(Wizzard.Color.WHITE, Wizzard.Value.FOOL));

            default:
                return (new Card(Wizzard.Color.NONE, Wizzard.Value.NONE));


        }
    }

    */



}
