package com.zipcodewilmington.assessment1;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {

        // Call the superclass constructor
        super(name, age);

    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {

        // Call the superclass constructor
        super(age);
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
       
        // Call the superclass constructor
        super(name);
    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        
        // Call the superclass constructor
        super();
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        
        // Return bark
        return "bark";
    }
}
