package edu.sdccd.cisc190;

import edu.sdccd.cisc190.controller.FileController;
import edu.sdccd.cisc190.controller.PetController;
import edu.sdccd.cisc190.view.Menu;
public class Main {
    private static Menu menu = new Menu();
    private static PetController petController = new PetController();
    private static FileController fileController = new FileController();
    public static void main(String[] args) {
        try {
            int selection;
            do {
                selection = menu.printMenu();
                switch (selection) {
                    case 1:
                        petController.addPets(fileController.readCatFile());
                        petController.addPets(fileController.readDogFile());
                    case 2:
                        petController.listPets();
                }
            } while(selection != 0);
        } catch (Exception e) {
            System.out.println("The following error was encountered, exiting: ");
            System.out.print(e.getMessage());
            System.exit(1);
        }
    }
}
