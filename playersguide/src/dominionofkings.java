import java.util.Scanner;

public class dominionofkings {
    public static void main(String[] args) {
        Scanner een = new Scanner(System.in);
        System.out.print("Amount of estates?: ");
        int estate = een.nextInt();
        System.out.print("Amount of duchy?: ");
        Scanner twee = new Scanner(System.in);
        int duchy = twee.nextInt();
        Scanner drie = new Scanner(System.in);
        System.out.print("Amount of provinces?: ");
        int province = drie.nextInt();
        int points = estate + duchy * 3 + province * 6;
        System.out.print("Amount of points?: ");
        System.out.println(points);
    }
}
