package Prog2.Exercise19;

public class Nährstoffangaben {
    public int getPortionsgröße() {
        return portionsgröße;
    }

    public int getAnzahlPortionen() {
        return anzahlPortionen;
    }

    public int getEiweiß() {
        return eiweiß;
    }

    public int getFett() {
        return fett;
    }

    public int getKohlenhydrate() {
        return kohlenhydrate;
    }

    public int getNatrium() {
        return natrium;
    }

    private int portionsgröße;
    private int anzahlPortionen;

    private int eiweiß, fett, kohlenhydrate, natrium;

    private Nährstoffangaben(int p, int aP , int e, int f, int k , int n){
        this.portionsgröße = p;
        this.anzahlPortionen = aP;
        this.eiweiß = e;
        this.fett = f;
        this.kohlenhydrate = k;
        this.natrium = n;
    }


    public static class NährstoffangabenBuilder{

         int portionsgröße;
         int anzahlPortionen;

         int eiweiß, fett, kohlenhydrate, natrium;

         public NährstoffangabenBuilder(int p ,int ap){
             this.portionsgröße =p;
             this.anzahlPortionen =ap;

         }
         public NährstoffangabenBuilder withEiweiß(int e){
             this.eiweiß = e;
             return this;
         }
        public NährstoffangabenBuilder withFett(int f){
            this.fett = f;
            return this;
        }
        public NährstoffangabenBuilder withKohlenhydrate(int k){
            this.kohlenhydrate = k;
            return this;
        }
        public NährstoffangabenBuilder withNatrium(int n){
            this.natrium = n;
            return this;
        }

        //Ahhhh - Die nicht gesetzten Attribute werden einfach mit 0 übergeben...eZ
        public Nährstoffangaben build(){
            return new Nährstoffangaben(portionsgröße,anzahlPortionen,eiweiß,fett,kohlenhydrate,natrium);
        }

    }

}
