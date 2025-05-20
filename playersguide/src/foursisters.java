import java.util.Scanner;

public class foursisters {
    public static void main(String[] args) {
    Scanner een = new Scanner(System.in);
    System.out.print("Total eggs?: ");
    int egg = een.nextInt();
    int eggspersister = egg/ 4;
    int duckbeareggs = egg% 4;
    System.out.print(eggspersister + " ");
    System.out.print("eggs per sister and ");
    System.out.print(duckbeareggs);
    System.out.print(" eggs for the duckbear: ");
}}
