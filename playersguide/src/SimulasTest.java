import java.util.Scanner;

public class SimulasTest {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        SimulasTestEnums state;
        state = SimulasTestEnums.LOCKED;
        System.out.println("Kist is op slot: Wat wil je doen?");

        while (true) {
            System.out.println(state);
            String command =  myObj.next();
            switch (state) {
                case LOCKED:
                    String unlock = "unlock";
                    if (command.contains(unlock)){
                        System.out.println("Kist is dicht: Wat wil je doen?");
                        state = SimulasTestEnums.CLOSED;
                    } else {
                        System.out.println("Kist is op slot: Wat wil je doen?");
                    }
                    break;
                case CLOSED:
                    String open = "open";
                    String lock = "lock";
                    if (command.contains(open)){
                        System.out.println("Kist is open: Wat wil je doen?");
                        state = SimulasTestEnums.OPEN;
                    } else if (command.contains(lock)) {
                        System.out.println("Kist is op slot: Wat wil je doen?");
                        state = SimulasTestEnums.LOCKED;
                    } else {
                        System.out.println("Kist is dicht: Wat wil je doen?");
                    }
                    break;
                case OPEN:
                    String close = "close";
                    if (command.contains(close)){
                        System.out.println("Kist is dicht: Wat wil je doen?");
                        state = SimulasTestEnums.CLOSED;
                    } else {
                        System.out.println("Kist is op open: Wat wil je doen?");
                    }
                    break;
            }
        }
    }
}
