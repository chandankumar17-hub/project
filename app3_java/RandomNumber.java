import java.util.Random;
import java.time.LocalDateTime;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("=== Random Number Generator ===");
        for (int i = 1; i <= 5; i++) {
            int num = rand.nextInt(100);
            System.out.println(LocalDateTime.now() + " -> Number " + i + ": " + num);
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("Done generating random numbers!");
    }
}

