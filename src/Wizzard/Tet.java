package Wizzard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tet {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        printSubString(num.subList(2,4));

    }

    private static void printSubString(List<Integer> num) {
        for(int a : num){
            System.out.print(a+" ");
        }
    }
}
