package edu.sdccd.cisc190.controller;

import edu.sdccd.cisc190.model.Cat;
import edu.sdccd.cisc190.model.Dog;
import edu.sdccd.cisc190.model.Pet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileController {

    public FileController() {

    }

    public List<Pet> readCatFile() throws Exception {
        List<Pet> pets = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(Objects.requireNonNull(getClass().getResourceAsStream("/cats.csv"))))) {
            String line;
            while ((line = br.readLine()) != null) {
                pets.add(Cat.fromCSV(line));
            }
        }
        return pets;
    }

    public List<Pet> readDogFile() throws Exception {
        List<Pet> pets = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(Objects.requireNonNull(getClass().getResourceAsStream("/dogs.csv"))))) {
            String line;
            while ((line = br.readLine()) != null) {
                pets.add(Dog.fromCSV(line));
            }
        }
        return pets;
    }
}
