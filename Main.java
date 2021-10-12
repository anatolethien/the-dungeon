import Game.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.displayTitleScreen();
        String userInput = game.scanUserInput();
        System.out.printf("'%s'", userInput);
        System.out.println(userInput == "play");
        // System.out.println("Welcome to the dungeon!");
        // Hero user = new Hero("Robin");
        // boolean running = true;
        // while (running) {
        //
        // }
    }
}
