import java.util.Scanner;

public class AskForNumberInRange {
    public static int askForNumberInRange(int min, int max, String text){
        System.out.print(text);
        boolean stop = false;
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();
        do {
            if (number < min || number > max){
                System.out.println(number + " is niet binnen de range");
                System.out.println("geef een nummer tussen de range");
                number = myObj.nextInt();
            }
            else {
                System.out.println(number + " is binnen de range");
                stop = true;
            }
        }
        while (!stop);
        return number;
    }
}
