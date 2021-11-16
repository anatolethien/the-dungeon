package view;

import java.util.Scanner;

public class Terminal {
    // constructors
    public Terminal() {
        System.out.println("Hello from Terminal");
    }
    // properties
    private Scanner scanner = new Scanner(System.in);
    public String[] input;
    // methods
    public void prompt() {
        System.out.printf(" > ");
        this.input = this.scanner.nextLine().toLowerCase().trim().replaceAll(" +", " ").split(" ", 2);
    }
    void displayTitleScreen() {
        System.out.println("Title screen");
    }
    // void buildScreen() {
    //     String[]
    // }

}
