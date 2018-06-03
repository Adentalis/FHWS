package Prog2.Exercise18;

import java.util.Comparator;

public class Person  {

    String name;

    public Person(String n){
        this.name=n;
    }

    public String getName(){
        return name;
    }

    public void soutName(){
        System.out.println(name);
    }

    public static Comparator<Person> comp = new Comparator<Person>() {
        public int compare(Person p1 ,Person p2){
            return p1.getName().compareTo(p2.getName());
        }
    };

    }

