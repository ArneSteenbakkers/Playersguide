import java.util.Arrays;
import java.util.Scanner;

public class TheReplicatorOfDTo {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        int min = 1;
        int max = 7;
        askForNumberInRange(min, max, String.format("geef een nummer tussen %d en %d ", min , max));

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int i = 0;
        while (i < array1.length){
            array1[i] = Integer.parseInt(askForNumber("Input nummer "));
            i++;
        }
        System.out.println(ANSI_BLUE + "Array 1: " + Arrays.toString(array1));
        i = 0;
        while (i < array2.length) {
            array2[i] = array1[i];
            i++;
            System.out.println(ANSI_YELLOW + "Array 2: " + Arrays.toString(array2));
        }    }


    public static String askForNumber(String text){
        int intNumber;
        System.out.print(text);
        Scanner myObj = new Scanner(System.in);
        String numberInput = myObj.next();
        intNumber = Integer.parseInt(numberInput);
        System.out.println(intNumber);
       return numberInput;
    }

    public static int askForNumberInRange(int min, int max, String text){
        System.out.print(text);
        boolean stop = false;
        Scanner myObj = new Scanner(System.in);
        int numberInput = myObj.nextInt();
        do {
            if (numberInput < min || numberInput > max){
                System.out.println(numberInput + " is niet binnen de range");
                System.out.println("geef een nummer tussen de range");
                numberInput = myObj.nextInt();

            }
            else {
                System.out.println(numberInput + " is binnen de range");
                stop = true;
            }
        }
        while (!stop);
        return max;
    }

}

/*
Make a method with the signature int askForNumber(String text). Display the text parameter in the console window, get a response from the user, convert it to an int, and return it.
This might look like this: int result = askForNumber(“What is the airspeed velocity
        of an unladen swallow?”);.
Make a method with the signature int askForNumberInRange(String text, int min, int max). Only return if the entered number is between the min and max values. Otherwise, ask again.
Place these methods in at least one of your previous programs to improve it.
*/
