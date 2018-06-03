package Prog2.Exercise19;

public class MainNährstoffe {
    public static void main(String[] args) {


        //Nährstoffangaben n = new Nährstoffangaben(1,2,3,4,5,6);
        Nährstoffangaben n = new Nährstoffangaben.NährstoffangabenBuilder(20,30).withEiweiß(3).build();

        System.out.println(n.getKohlenhydrate());
        }
    }

