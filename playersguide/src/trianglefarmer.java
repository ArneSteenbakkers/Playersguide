import java.util.Scanner;

public class trianglefarmer {
    public static void main(String[] args) {
        Scanner een = new Scanner(System.in);
        System.out.print("Base of triangle?: ");
        int base = een.nextInt();
        System.out.print("Height of triangle?: ");
        Scanner twee = new Scanner(System.in);
        int height = twee.nextInt();
        double Area = (base * height) / 2;
        System.out.print("Area of triangle?: ");
        System.out.print(Area);

    }
}
