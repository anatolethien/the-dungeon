package controller;

import view.Terminal;

public class Game {
    // constructors
    public Game() {
        Terminal terminal = new Terminal();
        while (running) {
            terminal.prompt();
            System.out.println(terminal.input[0]);
            running = false;
        }
    }
    // properties
    public static boolean running = true;
    // methods
}
