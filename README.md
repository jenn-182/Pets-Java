# Pets-Java

* **Objective:** To implement a `PetsOwner` which manipulates composite `Pet` objects.
* **Description** Pets are Animals that can be either Dog or Cat. An Owner can have multiple Pets.

## Pet

* Ensure each of the test cases in the class [Pet](https://github.com/ZipCodeCore/Pets-Java/blob/main/src/main/java/com/zipcodewilmington/assessment1/Pet.java) successfully passes upon completion of each of the method stubs in the class [PetTest](https://github.com/ZipCodeCore/Pets-Java/blob/main/src/test/java/com/zipcodewilmington/assessment1/PetTest.java).
  * Constructors
    * `Pet()`
    * `Pet(String)`
    * `Pet(int)`
    * `Pet(String, int)`
  * `String getName()`
  * `Integer getAge()`
  * `void setOwner(PetOwner owner)`
  * `PetOwner getOwner()`

### Step 1 - Define instance variables

* To create a programmatic representation of a `Pet`, begin by declaring an instance variable for each of the following properties:
  * `String name`
    * a collection of characters, representative of a name.
  * `Integer age`
    * an integer, representative of an age in years.
  * `PetOwner owner`
    * the owner of this `Pet`.

### Step 2 - Define the constructors

* Define a `Pet` constructor whose parameters are used to initialize its instance variables.
* A `Pet` can be constructed in 4 ways.
    1. `Pet()`
        * Upon [nullary construction](https://en.wikipedia.org/wiki/Nullary_constructor), pet has `age` of 0 and `name` of "".    
    2. `Pet(String)`
        * Upon construction, `name` field should be set to respective parameter value, pet has default age of 0.
    3. `Pet(int)`
        * Upon construction, `age` field should be set to respective parameter value, pet has default name of "".
    4. `Pet(String, int)`
        * `name` and `age` variables should set to respective parameter values.

### Step 3 - Define getter and setter methods

* Understand that instance variables are not directly exposed outside of the class. We use getter and setter methods to retrieve and assign values, respectively, to gatekeep their contents.
* Define a [getter and setter](https://en.wikipedia.org/wiki/Mutator_method#Java) for each of the instance variables declared in the `Pet` class.
  * `String getName()`
  * `Integer getAge()`
  * `void setOwner()`
  * `PetOwner getOwner()`

## Cats and Dogs

* Understand that `Pet` is the parent class. `Cat` and `Dog` inherit from `Pet`, and implement the `Animal` interface.
* **Cat**
  * Ensure the class [Cat](https://github.com/ZipCodeCore/Pets-Java/blob/main/src/main/java/com/zipcodewilmington/assessment1/Cat.java) supports all methods of `Pet` construction, successfully completing each of the method stubs in the class [CatTest](https://github.com/ZipCodeCore/Pets-Java/blob/main/src/test/java/com/zipcodewilmington/assessment1/CatTest.java).
  * The mechanism by which a `Cat` speaks is by meowing; ensure a cat's `speak` method returns `meow` as a string.
* **Dog**
  * Ensure the class [Dog](https://github.com/ZipCodeCore/Pets-Java/blob/main/src/main/java/com/zipcodewilmington/assessment1/Dog.java) supports all methods of `Pet` construction, successfully completing each of the method stubs in the class [DogTest](https://github.com/ZipCodeCore/Pets-Java/blob/main/src/test/java/com/zipcodewilmington/assessment1/DogTest.java).
  * The mechanism by which a `Dog` speaks is by barking; ensure a dog's `speak` method returns `bark` as a string.

### Part 5 - PetOwner

* Ensure each of the test cases in the class [PetOwner](https://github.com/ZipCodeCore/Pets-Java/blob/main/src/main/java/com/zipcodewilmington/assessment1/PetOwner.java) successfully passes upon completion of each of the method stubs in the class [PetOwner](https://github.com/ZipCodeCore/Pets-Java/blob/main/src/test/java/com/zipcodewilmington/assessment1/PetOwnerTest.java).

  * `PetOwner(String name, Pet... pets)`
  * `void addPet(Pet pet)`
  * `void removePet(Pet pet)`
  * `Boolean isOwnerOf(Pet pet)`
  * `Integer getYoungestPetAge()`
  * `Integer getOldestPetAge()`
  * `Double getAveragePetAge()`
  * `Integer getNumberOfPets()`
  * `String getName()`
  * `Pet[] getPets()`
