
import java.util.Scanner;

public class Watchtower {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int X;
        int Y;
        System.out.println("X coord");
        X = myObj.nextInt();
        System.out.println("Y coord");
        Y = myObj.nextInt();
        if (Y >0 && X>0) {
            System.out.println("NoordOost");}
        if (Y <0 && X>0) {
            System.out.println("ZuidOost");}
        if (Y >0 && X<0) {
            System.out.println("NoordWest");}
        if (Y <0 && X<0) {
            System.out.println("ZuidWest");}
        if (Y >0 && X==0) {
            System.out.println("Noord");}
        if (Y <0 && X==0) {
            System.out.println("Zuid");}
        if (Y ==0 && X>0) {
            System.out.println("Oost");}
        if (Y ==0 && X<0) {
            System.out.println("West");}
        if (Y ==0 && X==0) {
            System.out.println("\n" +
                    "         / \\\n" +
                    "        |\\_/|\n" +
                    "        |---|\n" +
                    "        |   |\n" +
                    "        |   |\n" +
                    "      _ |=-=| _\n" +
                    "  _  / \\|   |/ \\\n" +
                    " / \\|   |   |   ||\\\n" +
                    "|   |   |   |   | \\>\n" +
                    "|   |   |   |   |   \\\n" +
                    "| -   -   -   - |)   )\n" +
                    "|                   /\n" +
                    " \\                 /\n" +
                    "  \\               /\n" +
                    "   \\             /\n" +
                    "    \\           /\n");
        }



    }
}
