package com.zipcodewilmington.assessment1;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */

    //define instance variables
    //name, age, owner
    private String name;
    private Integer age;
    private PetOwner owner;
 
        
    public Pet() {

        //default age of 0 and name of ""
        this("",0); 
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {

        //default age of 0
        //specified name
        this(name, 0);
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {

        //default name of ""
        //specified age
        this("", age);
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        
        //set name and age
        this.name = name;
        this.age = age;
    }

    /**
     * @return name of this pet
     */
    public String getName() {
       
        return name;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {

        return age;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {
        
        this.owner = newPetOwner;

        //add this pet to the owner's pets list
        if (newPetOwner != null) {
            newPetOwner.addPet(this);
        }
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        
        return owner;
    }
}
