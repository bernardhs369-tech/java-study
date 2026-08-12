import java.util.Random;
import java.util.Scanner;

public class GuessingGameFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1; // number between 1 and 100
        int maxAttempts = 10;
        boolean guessedCorrectly = false;

        System.out.println("=== Guessing Game (1 to 100) ===");
        System.out.println("You have " + maxAttempts + " attempts. Good luck!");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("\nAttempt " + attempt + " of " + maxAttempts + " - Enter a number: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("🎉 Congratulations! You guessed the number " + secretNumber + "!");
                guessedCorrectly = true;
                break; // exits the for loop as soon as it's correct
            } else if (guess < secretNumber) {
                System.out.println("The secret number is HIGHER than " + guess);
            } else {
                System.out.println("The secret number is LOWER than " + guess);
            }
        }

        if (!guessedCorrectly) {
            System.out.println("\n😢 Out of attempts! The secret number was: " + secretNumber);
        }

        scanner.close();
    }
}
