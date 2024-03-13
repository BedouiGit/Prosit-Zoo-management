package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Exception.InvalidAgeException;

public class Aquatic extends animal implements Carnivore <Food> {
    private String habitat ;
    public Aquatic(String habitat,String family,String name,int age,boolean isMammal)throws InvalidAgeException {
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            System.out.println("Les objets sont la même instance.");
            return true;
        }



        Aquatic other = (Aquatic) obj;

        boolean sameName = this.get_name().equals(other.get_name());
        boolean sameAge = this.getAge() == other.getAge();
        boolean sameHabitat =  this.habitat.equals(other.habitat);

        if (sameName && sameAge && sameHabitat) {
            System.out.println("Les animaux aquatiques sont identiques.");
            return true;
        } else {
            System.out.println("Les animaux aquatiques ne sont pas identiques.");
            return false;
        }
    }
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String toString() {
        return "habitat: " + habitat;   }

    public void eatMeat(Food meat){
        if(meat==Food.MEAT||meat==Food.BOTH){
            System.out.println("eating meat");
        } else {
            System.out.println("cannot eat meat");
        };
    }

    public  void swim(){};
}
