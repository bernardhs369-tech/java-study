import java.util.Random;
import java.util.Scanner;

public class GuessingGameWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1; // number between 1 and 100
        int maxAttempts = 10;
        int currentAttempt = 1;
        boolean guessedCorrectly = false;

        System.out.println("=== Guessing Game (1 to 100) ===");
        System.out.println("You have " + maxAttempts + " attempts. Good luck!");

        while (currentAttempt <= maxAttempts && !guessedCorrectly) {
            System.out.print("\nAttempt " + currentAttempt + " of " + maxAttempts + " - Enter a number: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("🎉 Congratulations! You guessed the number " + secretNumber + "!");
                guessedCorrectly = true;
            } else if (guess < secretNumber) {
                System.out.println("The secret number is HIGHER than " + guess);
            } else {
                System.out.println("The secret number is LOWER than " + guess);
            }

            currentAttempt++;
        }

        if (!guessedCorrectly) {
            System.out.println("\n😢 Out of attempts! The secret number was: " + secretNumber);
        }

        scanner.close();
    }
}
