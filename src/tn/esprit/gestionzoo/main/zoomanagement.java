package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.Exception.InvalidAgeException;
import tn.esprit.gestionzoo.Exception.ZooFULLException;
import  tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

public class zoomanagement {

    public static void main(String[] args) throws InvalidAgeException {

        animal lion = new animal("Felidae", "Lion", 10, true);
        animal chercher = new animal("Felidae", "Lion", 5, true);

        zoo myzoo = new zoo("My_Zoo", "Ma ville",1);
        zoo x = new zoo("","tunis",2);
        zoo y = new zoo("Y","ALG",3);

        animal[] animals=new animal[10];

        myzoo.displayzoo();

        System.out.println(myzoo);
        System.out.println(myzoo.toString());
        System.out.println(lion);


        /*for( int i = 0; i < 8; i++ ){
            if (myzoo.addanimal(lion)){
                System.out.println("done");
            }
            else{
                System.out.println("no done");
            }
        }*/
        //System.out.println(myzoo.addanimal(lion));

        try {
            myzoo.addanimal(lion);
        }
        catch (ZooFULLException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(myzoo.getName()+"contient");
        }




        myzoo.display_animals();

        System.out.println(myzoo.searchanimal(lion));
        //myzoo.removeanimal(lion);
        System.out.println(zoo.comparerZoo(x,y));
        System.out.println("age :"+ lion.getAge());

        System.out.println(x.getName());

        Terrestrial Ter = new Terrestrial(4);

        Dolphin dof = new Dolphin("zone A", 5.4f,"x","name",21,true);
        Dolphin doff = new Dolphin("zone A", 5.4f,"x","name",21,true);
        penguin pen = new penguin("Zone B",14.9f,"y","m",22,false);
        Aquatic aq= new Dolphin("kk",10f,"family","name",44,false);


        //System.out.println(aq);
        System.out.println(Ter);
        System.out.println(dof);
        System.out.println(pen);
        //aq.swim();
        dof.swim();
        pen.swim();   //REDFINITION

        for(animal animal: animals){
            if (animal instanceof Aquatic)
                ((Aquatic) animal).swim();
        }


        myzoo.displayNumberOfAquaticsByType();

        dof.equals(doff);
        ///////////////////////////////////////
        animal dog = new animal("Berger","Fox",3,false);
        dog.setName("Simmba");
        try{
            dog.setAge(8);
        }
        catch ( InvalidAgeException exe)
        {
            System.out.println(exe.getMessage());
        }
        dog.setFamily("X");
        dog.setMammal(true);

        ////////PROSIT8

        penguin Peng = new penguin("North",20.5f,"Penguin","KAKA",14,false);
        Aquatic AK= new Dolphin("WEST",10f,"familyB","PAPA",10,false);
        Terrestrial ter=new Terrestrial(4);

        Peng.eatMeat(Food.BOTH);
        AK.eatMeat(Food.PLANT);
        ter.eatPlantAndMeet(Food.MEAT);



    }


}