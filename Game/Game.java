package Game;
import Hero.*;
import java.util.Scanner;

public class Game {
    // constructors
    public Game() {
        this.displayTitleScreen();
        // this.promptUser();
        // if (this.scanUserInput().equals("play")) {
        //     this.displayHeroSelectionScreen();
        //     if (this.scanUserInput().equals("victor")) {
        //         Victor hero = new Victor();
        //         hero.printStatus();
        //     }
        // } else if (this.scanUserInput().equals("exit")) {
        //     this.displayTitleScreen();
        //     System.exit(0);
        // }
    }
    // properties
    private Scanner in = new Scanner(System.in);
    private String[] heroList = {
        "Ariana",
        "Arsen",
        "Candice",
        "Charles",
        "Robin",
        "Victor"
    };
    // methods
    public void promptUser() {
        System.out.printf(" > ");
        this.interpretCommand(this.in.nextLine().toLowerCase().trim().replaceAll(" +", " ").split(" ", 2));
    }
    public void interpretCommand(String[] userCommand) {
        String command = userCommand[0];
        if (userCommand.length > 1) {
            String option = userCommand[1];
        }
        if (command.equals("play")) {
            this.displayHeroSelectionScreen();
        } else if (command.equals("exit")) {
            System.exit(0);
        } else {
            System.out.printf("ERROR: Unknown command: [%s]%n", command);
            this.promptUser();
        }
    }
    public void displayTitleScreen() {
        System.out.printf("█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█      ▄▄▄▄▀  ▄  █ ▄███▄       ██▄     ▄      ▄     ▄▀  ▄███▄   ████▄    ▄     █%n");
        System.out.printf("█   ▀▀▀ █    █   █ █▀   ▀      █  █     █      █  ▄▀    █▀   ▀  █   █     █    █%n");
        System.out.printf("█       █    ██▀▀█ ██▄▄        █   █ █   █ ██   █ █ ▀▄  ██▄▄    █   █ ██   █   █%n");
        System.out.printf("█      █     █   █ █▄   ▄▀     █  █  █   █ █ █  █ █   █ █▄   ▄▀ ▀████ █ █  █   █%n");
        System.out.printf("█     ▀         █  ▀███▀       ███▀  █▄ ▄█ █  █ █  ███  ▀███▀         █  █ █   █%n");
        System.out.printf("█              ▀                      ▀▀▀  █   ██                     █   ██   █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                [Play]                                  [Exit]                █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█%n");
        //                                    ||                  ||                  ||
        //                                    48                  68                  88
        this.promptUser();
    }
    public void displayHeroSelectionScreen() {
        System.out.printf("█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                               Select your hero.                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█               Name                    Description                            █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█           [Ariana]                    The cruel fire witch.                  █%n");
        System.out.printf("█            [Arsen]                    The distinguished thief.               █%n");
        System.out.printf("█          [Candice]                    The warm-hearted ice magician.         █%n");
        System.out.printf("█          [Charles]                    The noble paladin knight.              █%n");
        System.out.printf("█            [Robin]                    The justice-thirsty ranger.            █%n");
        System.out.printf("█           [Victor]                    The glorious barbarian.                █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█                                                                              █%n");
        System.out.printf("█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█%n");
        //                                    ||                  ||                  ||
        //                                    48                  68                  88
        this.promptUser();
    }
}
