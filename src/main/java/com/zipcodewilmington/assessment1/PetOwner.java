package com.zipcodewilmington.assessment1;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    private String name;
    private List<Pet> pets; 

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {

        // Initialize the name and pets list
        this.name = name;
        // Initialize the pets list
        this.pets = new ArrayList<>();
        if (pets != null) {
            // Add each pet to the list of owned pets
            for (Pet pet : pets) {
                addPet(pet); 
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

        // Check if the pet is not null and is not already in the list of owned pets
        if (pet != null && !this.pets.contains(pet)) { 
            // Add the pet to the list of owned pets
            this.pets.add(pet);
            // Set the owner of the pet to this PetOwner
            pet.setOwner(this); 
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        
        // Check if the pet is not null and is in the list of owned pets
         if (pet != null && this.pets.remove(pet)) {
            // If the pet was removed, set its owner to null
            pet.setOwner(null); 
        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        // Check if the pet is in the list of owned pets
        return this.pets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {

        // If there are no pets, return 0
        if (pets.isEmpty()) {
            return 0;
        }
        // Find the youngest pet's age
        Integer youngestAge = Integer.MAX_VALUE;
        for (Pet pet : pets) {
            if (pet.getAge() < youngestAge) {
                youngestAge = pet.getAge();
            }
        }
        // Return the youngest age found
        return youngestAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {

        // If there are no pets, return 0
        if (pets.isEmpty()) {
            return 0;
        }
        // Find the oldest pet's age
        Integer oldestAge = Integer.MIN_VALUE;

        // Iterate through the pets list to find the oldest age
        for (Pet pet : pets) {
            if (pet.getAge() > oldestAge) {
                oldestAge = pet.getAge();
            }
        }
        // Return the oldest age found
        return oldestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {

        // If there are no pets, return 0
        if (pets.isEmpty()) {
            return 0.0;
        }
        // Calculate the total age of all pets and divide by the number of pets
        double totalAge = 0;
        for (Pet pet : pets) {
            totalAge += pet.getAge();
        }
        return totalAge / pets.size();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {

        // Return the size of the pets list
        return pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {

        // Return the name of the PetOwner
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        // Convert the list of pets to an array and return it
        return pets.toArray(new Pet[0]);
    }
}
