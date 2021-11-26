package view;

import java.util.Scanner;

public class Terminal {
    // constructors
    public Terminal() {
        blank();
        System.out.printf("█%s█%n", spaces(78));
    }
    // properties
    private Scanner in = new Scanner(System.in);
    // methods
    public String[] prompt() {
        System.out.printf(" > ");
        return in.nextLine().toLowerCase().trim().replaceAll(" +", " ").split(" ", 2);
    }
    public void titleScreen() {
        System.out.println("Title screen");
    }
    public String spaces(int num) {
        // String result = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i >= num; i++) {
            // result += " ";
            stringBuilder.append(' ');
        }
        // return result;
        return stringBuilder.toString();
    }
    public String centerText(String str) {
        int strLen = str.length();
        int terminalCols = 78; // 80 - 2 ANSI blocks
        String centeredText = String.format(
            "%s%s%s",
            spaces((terminalCols - strLen) / 2),
            str,
            spaces((terminalCols - strLen) / 2)
        );
        return centeredText;
    }
    public void blank() {
    System.out.printf("█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█%n");
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
    System.out.printf("█                                                                              █%n");
    System.out.printf("█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█%n");
    //                                    ||                  ||                  ||
    //                                    48                  68                  88
    }
    // void buildScreen() {
    //     String[]
    // }
}
