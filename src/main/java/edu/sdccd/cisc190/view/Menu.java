package edu.sdccd.cisc190.view;

import java.util.Scanner;

public class Menu {
    Scanner input;
    public Menu() {
        input = new Scanner(System.in);
    }

    public int printMenu() {
        int selection;

        System.out.println("-------------");
        System.out.println("Main Menu");
        System.out.println("-------------");
        System.out.println("1 - Load Files");
        System.out.println("2 - List Pets");
        System.out.println("0 - Quit");

        selection = input.nextInt();
        return selection;
    }
}
