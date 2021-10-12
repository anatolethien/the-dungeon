package Game;
import java.util.Scanner;

public class Game {
    // properties
    private Scanner scanner = new Scanner(System.in);
    private String[] heroList = {"Ariana", "Arsen", "Candice", "Charles", "Robin", "Victor"};
    // methods
    public String scanUserInput() {
        System.out.printf(" > ");
        return this.scanner.nextLine().toLowerCase().trim();
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
    }
}
