import java.util.Scanner;

public class bread {
        public static void main(String[] args) {
            System.out.println("Bread is ready.");
             System.out.println("Who is bread ready for?");
            System.out.println("Name: ");
            String userName = new Scanner(System.in).nextLine();
            System.out.println("Bread is ready for: " + userName);
        }
}


