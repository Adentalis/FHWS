package Wizzard;

import java.util.ArrayList;
import java.util.Random;

public class Tet {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        System.out.println(rnd.nextInt(3));
        System.out.println(num.get(1));
    }
}
