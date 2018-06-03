package Prog2.Exercise18;

import java.util.ArrayList;
import java.util.Collections;

public class SortNames_Comparable {
    public static void main(String[] args) {


        Person p1 = new Person("Dieter");
        Person p2 = new Person("Anka");
        Person p3 = new Person("Vera");
        Person p4 = new Person("Maus");

        ArrayList<Person> p = new ArrayList<>();
        p.add(p1);
        p.add(p3);
        p.add(p4);
        p.add(p2);

        for( Person pe :p){
            pe.soutName();
        }
        System.out.println("-------");

       // Collections.sort(p); Geht nicht, da es nur bei primitiven Datentypen so leicht geht. Jetzt brauchen wir Comparable damit Java weiß, was es vergleich soll.

        Collections.sort(p,Person.comp);
        for( Person pe :p){
            pe.soutName();
        }

    }
}
