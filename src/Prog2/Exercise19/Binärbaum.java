package Prog2.Exercise19;

public class Binärbaum{

    Element root;

    public class Element{

        Element left;
        Element right;
        Element parent;
        Person person;

        public Element(Person p){
            this.person = p;
        }

        public Person getPerson(){
            return person;
        }

        public  void setRight(Element child){
            this.right = child;
            if(child != null){
                child.parent = this;
            }
        }
        public  void setLeft(Element child){
            this.left = child;
            if(child != null){
                child.parent = this;
            }
        }

        public String toString(){
            return person.getName();
        }

    }
    //--------------------------------------


    public void add(Person p ){
        if(root== null){
            root = new Element(p);
        }else{


        }
    }



}
