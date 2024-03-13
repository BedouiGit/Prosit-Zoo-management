package tn.esprit.gestionzoo.entities;

public class Terrestrial implements Omnivore <Food>{
    private int nbrLegs;

    public Terrestrial(int nbrLegs){
        this.nbrLegs=nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public String toString() {
        return "Legs number: " + nbrLegs   ; }

    public void eatPlantAndMeet(Food food){
        if(food==Food.MEAT||food==Food.BOTH){
            System.out.println("eating both");
        } ;
    }
    public void eatMeat(Food meat){
        if(meat==Food.MEAT||meat==Food.BOTH){
            System.out.println("eating meat");
        } else {
            System.out.println("cannot eat meat");
        };
    }
    public void eatPlant (Food plant){
        if(plant==Food.PLANT||plant==Food.BOTH){
            System.out.println("eating plant");
        } else {
            System.out.println("cannot eat plant");
        };
    }
}