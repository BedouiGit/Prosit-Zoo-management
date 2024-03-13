package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Exception.InvalidAgeException;

public class animal {

    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public String toString() {
        return "animal_Name: " + name + "\nFamily: " + family + "\nAge: " + age + "\nIs Mammal: " + isMammal;    }
    public animal(String family, String name, int age, boolean isMammal)throws InvalidAgeException {
        this.family = family;
        this.name = name;
        //this.age = age;
        setAge(age);
        this.isMammal = isMammal;
    }
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public String get_name() {
        return name;
    }
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
        else {
            System.err.println("Invalid name. Name cannot be empty.");
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age)throws InvalidAgeException {
        if (age >= 0)
            this.age = age;
        else {
            //System.err.println("Invalid age. Age cannot be negative.");
            throw new InvalidAgeException("Invalid Age");


        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }


}