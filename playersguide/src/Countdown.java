public class Countdown {
    public static void main(String[] args) {
//        for (int x = 10; x > 0; x--){
//            System.out.println(x);
//        }
        int result = countdown(10);
        System.out.println(result);
    }

    public static int countdown(int i){
        if (i > 0){
            System.out.println(i);
            return countdown(i - 1);
        } else {
            return 0;
        }
    }
}
