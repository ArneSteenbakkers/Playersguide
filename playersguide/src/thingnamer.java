import java.util.Scanner;

public class thingnamer {
    public static void main(String[] args) {
        System.out.println("What kind of thing are we talking about?");
        Scanner input = new Scanner(System.in);
        String a = input.next(); //stores the answer of the first question
        System.out.println("How would you describe it? Big? Azure? Tattered?");
        String b = input.next(); //stores the answer of the second question
        String c = "of Doom"; //string c stores "of doom"
        String d = "3000"; //string d stores "3000"
        System.out.println("The " + b + " " + a + " " + c + " " + d + "!"); // removed of
        /*to make this code more understandable you could remove String c = "of Doom"; and String d = "3000"
        and place them in the system.out.println()*/
}}
