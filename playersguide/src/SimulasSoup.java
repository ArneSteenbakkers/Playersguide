import java.util.Scanner;

public class SimulasSoup {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        myObj.next();
        System.out.println(myObj);
        myObj.next();
        System.out.println(myObj);
        myObj.next();
        System.out.println(myObj);

        System.out.println("MENU");
        System.out.println("\tTYPE");
        System.out.println("\t\t1. Soup  2. Stew  3. Gumbo");
        System.out.println("\tINGREDIENT");
        System.out.println("\t\t1. Mushrooms  2. Chicken  3. Carrots  4. Potatoes");
        System.out.println("\tSEASONING");
        System.out.println("\t\t1. Spicy  2. Salty  3. Sweet");
    }
}
