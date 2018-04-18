package Wizzard.Player;

public class HumanPlayer extends AbstractPlayer {
    @Override
    public int getPoints() {
        return points;
    }


    public HumanPlayer(String name ){
        this.name=name;
    }

    @Override
    public void showHand() {

    }
}
