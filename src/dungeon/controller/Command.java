package controller;

public class Command {
    // constructors
    public Command(String[] input) {
        try {
            command = input[0];
            argument = input[1];
        } catch(Exception e) {
            argument = "";
        }
    }
    // properties
    public String command;
    public String argument;
    // methods
    void eval(String status) {
        if (command.equals("exit")) {
            exit();
        }
        if (status.equals("titleScreen")) {
            if (command.equals("play")) {
                play();
            } else {
                error();
            }
        } else if (status.equals("selectCharacter")) {
            if (argument.equals("victor")) {
                System.out.println("You chose Victor!");
            } else if (argument.equals("ariana")) {
                System.out.println("You chose Ariana!");
            } else {
                error();
            }
        }
    }
    void exit() {
        System.exit(0);
    }
    void play() {
        System.out.println("play");
    }
    void error() {
        System.out.println("Error");
    }




}
