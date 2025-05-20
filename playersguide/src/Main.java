//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int X;
        int Y;
        System.out.println("X coord");
        X = myObj.nextInt();
        System.out.println("Y coord");
        Y = myObj.nextInt();
        System.out.println("deploy to" );
        System.out.println(ANSI_RED_BACKGROUND + ANSI_BLUE + "(" + X + "," + (Y-1) + ")" + ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND + ANSI_YELLOW + "(" + (X-1) + "," + Y + ")"+ ANSI_RESET );
        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_RED + "(" + X + "," + (Y+1) + ")"+ ANSI_RESET );
        System.out.println(ANSI_YELLOW_BACKGROUND + ANSI_BLACK+ "(" + (X+1) + "," + Y + ")" +ANSI_RESET);

        Toolkit.getDefaultToolkit().beep();
    }
}