public class TurnDamage {
    public static int turnDamage(int turnsAmount){
        int damage = 1;
            for (int i = 1; i < turnsAmount; i++){
                if (i%3 == 0 && i%5 == 0){
                    damage = 10;
                }
                else if (i%3 == 0){
                    damage = 3;
                } else if (i%5 == 0) {
                    damage = 5;
                }
                else {
                    damage = 1;
                }
            }
        return damage;
    }
}
