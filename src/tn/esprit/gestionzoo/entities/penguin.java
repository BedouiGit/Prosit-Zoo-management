package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Exception.InvalidAgeException;

public class penguin extends Aquatic{

    private float swimmingDepth;
    public penguin(String habitat,float swimmingDepth,String family,String name,int age,boolean isMammal)throws InvalidAgeException
    {
        super(habitat,family, name,age, isMammal);
        this.swimmingDepth=swimmingDepth;
    }

    public float getSwimmingDepth()
    {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public String toString(){
        return super.toString()+" SwimmingDepth :"+ swimmingDepth;
    }

    public void swim(){
        System.out.println("This penguin animal is swimming");
    }
}
