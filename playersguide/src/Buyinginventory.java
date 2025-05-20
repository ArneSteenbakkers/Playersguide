
import java.util.Scanner;

public class Buyinginventory {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int cost;
        String name1 = "Arne";
                String name2;
        System.out.println("Name?");
        name2 = myObj.next();
        System.out.println(" ");
        System.out.println("1. Rope");
        System.out.println("2. TORCHES");
        System.out.println("3. Climbing Equipment");
        System.out.println("4. Clean Water");
        System.out.println("5. Machete");
        System.out.println("6. Canoe");
        System.out.println("7. Food Supplies");

        System.out.println(" ");
        System.out.println("What Price you want to check");
        cost = myObj.nextInt();
    switch (cost){
        case 1 :
            if(name1.equals(name2)){
                System.out.println("50% discount, Rope: 10 gold");
            } else
                System.out.println("Rope: 5 gold");

            break;
        case 2 :
            if(name1.equals(name2)){
                System.out.println("50% discount, torches: 7.5 gold");
            } else
                System.out.println("Rope: 15 gold");
            break;
        case 3 :
            if(name1.equals(name2)){
                System.out.println("50% discount, Climbing Equipment: 12.5 gold");
            } else
                System.out.println("Climbing Equipment: 25 gold");
            break;
        case 4 :
            if(name1.equals(name2)){
                System.out.println("50% discount, Clean Water: 0.5 gold");
            } else
                System.out.println("Clean Water: 1 gold");
            break;
        case 5 :
            if(name1.equals(name2)){
                System.out.println("50% discount, Machete: 10 gold");
            } else
                System.out.println("Machete: 20 gold");
            break;
        case 6 :
            if(name1.equals(name2)){
                System.out.println("50% discount, canoe: 100 gold");
            } else
                System.out.println("Canoe: 200 gold");
            break;
        case 7 :
            if(name1.equals(name2)){
                System.out.println("50% discount, Food Supplies: 0.5 gold");
            } else
                System.out.println("Food Supplies: 1 gold");
            break;
    }

        }



    }

