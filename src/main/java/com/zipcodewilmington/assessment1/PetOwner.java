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

        this.name = name;
        this.pets = new ArrayList<>();
        if (pets != null) {
            for (Pet pet : pets) {
                addPet(pet); 
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

        if (pet != null && !this.pets.contains(pet)) { 
            this.pets.add(pet);
            pet.setOwner(this); 
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

         if (pet != null && this.pets.remove(pet)) {
            pet.setOwner(null); 
        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        return this.pets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {

        if (pets.isEmpty()) {
            return 0;
        }
        Integer youngestAge = Integer.MAX_VALUE;
        for (Pet pet : pets) {
            if (pet.getAge() < youngestAge) {
                youngestAge = pet.getAge();
            }
        }
        return youngestAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {

          if (pets.isEmpty()) {
            return 0;
        }
        Integer oldestAge = Integer.MIN_VALUE;
        for (Pet pet : pets) {
            if (pet.getAge() > oldestAge) {
                oldestAge = pet.getAge();
            }
        }
        return oldestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {

        if (pets.isEmpty()) {
            return 0.0;
        }
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
        return pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets.toArray(new Pet[0]);
    }
}
