
import java.util.Scanner;

public class repairingtheclocktower {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int Tiktok;

        System.out.println("Number input");
        Tiktok = myObj.nextInt();
        if (Tiktok % 2 ==0 ){
            System.out.println("Tick");

        }
        else{
            System.out.println("Tock");

        }
    }
}