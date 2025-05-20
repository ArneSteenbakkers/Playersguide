import java.util.Scanner;

public class HuntingTheManticore {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int distanceFromCity = AskForNumberInRange.askForNumberInRange(1,100,"Speler 1, hoe ver wil je de Manticore van de stad neerzetten? ");
        int guess;
        int turnNumber = 1;
        int manticoreHP = 10;

        System.out.println("\n" + "\n");
        System.out.println("Speler 2, hoe ver staat de Manticore");
        System.out.println("Dit is turn: " + turnNumber +  ", je HP is: " + (16 - turnNumber) + "\nDe Manticore heeft: " + manticoreHP + " HP");
        System.out.println("De volgende hit zal " + TurnDamage.turnDamage(turnNumber) + " damage doen");

        guess = myObj.nextInt();
        for  (turnNumber = 1; turnNumber < 15 && manticoreHP > 0; turnNumber++) {
            if (distanceFromCity > guess) {
                System.out.println("Hoger raden\n");
            }
            else if (distanceFromCity < guess){
                System.out.println("Lager raden\n");
            }
            else{
                System.out.println("Raak! Je hebt " + (TurnDamage.turnDamage(turnNumber +1)) + " damage gedaan");
                System.out.println(" ");
                manticoreHP = manticoreHP - TurnDamage.turnDamage(turnNumber + 1);

            }
            if (manticoreHP >= 0){
                System.out.println("Dit is turn: " + (turnNumber + 1) + ", je HP is: " + (10 - turnNumber));
                System.out.println("De Manticore heeft: " + manticoreHP + " HP");
                System.out.println("De volgende hit zal " + TurnDamage.turnDamage(turnNumber + 2) + " damage doen");
                // turnNumber + 2, want de damage van de volgende turn moet gegeven worden

                guess = myObj.nextInt();
            }
            else {
                turnNumber = 10;
                System.out.println("Gewonnen");
            }
        }
        if(manticoreHP > 0) {
            System.out.println("Je HP is: 0");
            System.out.println("Verloren");
        }
    }
}