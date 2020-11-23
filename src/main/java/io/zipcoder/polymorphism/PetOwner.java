package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class PetOwner {
    private String petName;
    private Integer numberOfPets;
    private String typeOfPet;
    Scanner scanner = new Scanner(System.in);

    public PetOwner(){

    }

    public PetOwner(String petName, String typeOfPet, Integer numberOfPets) {
        this.petName = petName;
        this.typeOfPet = typeOfPet;
        this.numberOfPets = numberOfPets;
    }

    public void petInput(){

        System.out.println("How many pets do you have?");
        Integer numOfPets = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Pet> petList = new ArrayList<Pet>();

        for (int i = 1; i <= numOfPets; i++) {
            System.out.println("What is the name of pet number " + i + "?");
            String petName = scanner.nextLine();
            System.out.println("What kind of pet is pet number " + i + "?");
            String petType = scanner.nextLine();
            if(petType.equalsIgnoreCase("Dog")) {
                Dog dog = new Dog(petName);
                petList.add(dog);
            }
            if(petType.equalsIgnoreCase("Cat")){
                Cat cat = new Cat(petName);
                petList.add(cat);
            }
            if(petType.equalsIgnoreCase("Bird")){
                Bird bird = new Bird(petName);
                petList.add(bird);
            }
        }
        for (int i = 0; i < petList.size(); i++) {
            System.out.println("Pet " + i+1 + " is a " + petList.get(i).getClass().getSimpleName() + " named " + petList.get(i).getName() + ". It says " + petList.get(i).speak());

        }



    }





}
