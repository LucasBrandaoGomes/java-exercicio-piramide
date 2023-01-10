import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);

        for(int i=1; i <= number; i++) {
            String str = ""+i;
            for(int j = 1; j < i; j++) {
                str += i;
            }

            System.out.println(str);
        }
    }
}