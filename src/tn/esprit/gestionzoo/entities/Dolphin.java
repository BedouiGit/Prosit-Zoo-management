package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Exception.InvalidAgeException;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;
    public Dolphin(String habitat,float swimmingSpeed,String family,String name,int age,boolean isMammal)throws InvalidAgeException {
        super(habitat,family,name,age,isMammal);
        this.swimmingSpeed=swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public String toString() {
        return super.toString()+ " Swimming Speed: " + swimmingSpeed   ; }

    public void swim(){
        System.out.println("This Dolphin animal is swimming");
    }

}
