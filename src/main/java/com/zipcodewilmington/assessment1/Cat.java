package com.zipcodewilmington.assessment1;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {

        // Call the superclass constructor
        super(name, age);

    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {

        // Call the superclass constructor
        super(age);
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {

        // Call the superclass constructor
        super(name);

    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {

        // Call the superclass constructor
        super();
    }

    /**
     * @return meow as a string
     */
    public String speak() {

        // Return meow
        return "meow";
    }
}
