import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int attempts = 0;
        int maxAttempts = 5;
        String password;

        do {
            System.out.println("Enter your password:");
            password = scanner.next();

            if (password.equals("1234")) {
                System.out.println("Correct password.");
                break;
            } else {
                attempts++;
                int remaining = maxAttempts - attempts;

                if (remaining > 0) {
                    System.out.println("Wrong password. You have " + remaining + " attempt(s) left.");
                } else {
                    System.out.println("Access blocked.");
                }
            }

        } while (attempts < maxAttempts);
    }
}
