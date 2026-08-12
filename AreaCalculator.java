import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calculate square area");
            System.out.println("2. Calculate circle area");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the side of the square: ");
                double side = scanner.nextDouble();
                double squareArea = side * side;
                System.out.println("Square area: " + squareArea);
            } else if (choice == 2) {
                System.out.println("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = 3.14 * radius * radius;
                System.out.println("Circle area: " + circleArea);
            } else if (choice == 3) {
                System.out.println("Program ended.");
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
