package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Exception.ZooFULLException;

public class zoo {

    private animal[] animals;
    private String name;
    private String city;
    private static final int NBRCAGE=25;
    private Aquatic[] aquaticAnimals;
    private penguin[] penguins;
    private int AquaticNumber;

    private int NumberAnimal;

    public zoo(String name, String city, int AquaticNumber) {
        //this.name = (name != null && !name.isEmpty()) ? name : "nvalid name. Name cannot be empty.";
        setName(name);
        //this.name = name;
        this.city = city;

        this.animals = new animal[NBRCAGE]; // Initialize the animals array with the specified number of cages
        this.aquaticAnimals= new Aquatic[10];
        this.AquaticNumber=0;

        this.penguins=new penguin[10];
    }
    public void addAquaticAnimal(Aquatic aquatic){
        if (AquaticNumber<10){
            aquaticAnimals[AquaticNumber]=aquatic;
            AquaticNumber++;
            System.out.println("Animal Aquatic Added !");
        }
        else
            System.out.println("Animal Aquatic cannot be Added !");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.err.println("Invalid name. Name cannot be empty.");
        }
    }

    public String toString() {
        return "Name: " + name + "\nCity: " + city + "\nNumber of Cages: " + NBRCAGE;
    }
    public void displayzoo() {

        System.out.println("zoo_Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + NBRCAGE);

    }

    public void addanimal(animal animal) throws ZooFULLException
    {
        if (animals.length < 25)
        {
            if (searchanimal(animal) == -1)
            {
                System.out.println("Animal Already exists");
                if (isZooFull())
                {
                    throw new ZooFULLException("The Zoo is full");
                }


                for (int i = 0; i < animals.length; i++)
                {
                    if (animals[i] == null)
                    {
                        animals[i] = animal;
                        NumberAnimal ++ ;

                    }
                }

            }
        }

    }


    public void display_animals() {

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

    }

    public  int searchanimal(animal animal) {

        for (int i = 0; i < animals.length; i++) {
            if(animals[i] != null && animals[i].get_name().equals(animal.get_name())){
                return i;
            }
        }
        return -1;
    }

    public boolean removeanimal(animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].equals(animal)) {
                animals[i] = null;
                System.out.println("Deleted");
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull() {
        for (int i = 0; i < animals.length; i++) {
            if (animals.length == NBRCAGE) {
                System.out.println("ZOO IS FULL");
                return true;
            }
        }
        return false;
    }


    public static   zoo comparerZoo(zoo z1, zoo z2) {
            if (z1.getAnimalCount() > z2.getAnimalCount()) {
                return z1;
            } else {
                return z2;
            }
    }

    public int getAnimalCount() {
        return animals.length;
    }

    public void adddanimal(animal animal) {
        /*if (isZooFull()){
            System.out.println("Cannot ADD ANIMAL !");
            return false;}*/

        //else
            if (animals.length < 25)
            {
                if (searchanimal(animal) == -1) {
                    for (int i = 0; i < animals.length; i++) {
                        if (animals[i] == null) {
                            animals[i] = animal;
                            //return true;
                        }
                    }
                    //return false; // All cages are occupied
                }// else {
                    //return false; // The tn.esprit.gestionzoo.entities.animal is already in the tn.esprit.gestionzoo.entities.zoo
                //}
            }
        /*else {
            return false;
        }*/

    }

    public float maxPenguinSwimmingDepth()
    {
        float max=0f;
        for(penguin penguin: penguins)
        {
            if (penguin!=null && penguin.getSwimmingDepth()>max)
                max=penguin.getSwimmingDepth();
        }
        return max;
    }

    public void displayNumberOfAquaticsByType()
    {
        int nb_dof=0;
        int nb_peng=0;
        for (Aquatic aquatic: aquaticAnimals) {
            if (aquatic instanceof Dolphin)
                nb_dof++;
            else if (aquatic instanceof penguin)
                nb_peng++;
        }
        System.out.println("nombre de dolphin:"+nb_dof);
        System.out.println("nombre de penguin:"+nb_peng);
    }



}