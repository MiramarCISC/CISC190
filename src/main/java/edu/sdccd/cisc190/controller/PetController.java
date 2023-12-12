package edu.sdccd.cisc190.controller;

import edu.sdccd.cisc190.model.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetController {
    List<Pet> pets;

    public PetController() {
        pets = new ArrayList<>();
    }

    public boolean addPets(List<Pet> newPets) {
        return pets.addAll(newPets);
    }

    public void listPets() {
        for (Pet pet: pets) {
            System.out.println(pet);
        }
    }
}
