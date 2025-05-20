import java.util.Scanner;

public class ThePrototype {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int number = AskForNumberInRange.askForNumberInRange(1,100,"Type je nummer");
        System.out.println("50 lege lines");
        System.out.println("raad");
        int guess;
        guess = myObj.nextInt();
        while  (number != guess) {
           if (number > guess) {
               System.out.println("hoger raden");
           }
           else {
             System.out.println("lager raden");
           }
            guess = myObj.nextInt();
            System.out.println(guess);
        }

            System.out.println("goed");
        }

}



