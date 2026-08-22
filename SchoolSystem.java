import java.util.Scanner;

public class SchoolSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students are in the class?");
        int quantity = scanner.nextInt();

        int totalPassed = 0;
        int totalRetake = 0;
        int totalFailed = 0;
        double highestAverage = 0;
        double lowestAverage = 10;
        double sumOfAverages = 0;

        for (int i = 1; i <= quantity; i++) {

            double sum = 0;

            for (int j = 1; j <= 3; j++) {

                System.out.println("Enter grade " + j + " for student " + i);
                double grade = scanner.nextDouble();
                sum = sum + grade;
            }

            double average = sum / 3;

            if (average > highestAverage) {
                highestAverage = average;
            }

            if (average < lowestAverage) {
                lowestAverage = average;
            }

            if (average >= 7) {
                System.out.println("Passed");
                totalPassed++;
            } else if (average <= 5) {
                System.out.println("Failed");
                totalFailed++;
            } else {
                System.out.println("Retake");
                totalRetake++;
            }

            sumOfAverages = sumOfAverages + average;
        }

        double overallAverage = sumOfAverages / quantity;

        System.out.println("----- STUDENT SUMMARY -----");
        System.out.println("Passed: " + totalPassed);
        System.out.println("Retake: " + totalRetake);
        System.out.println("Failed: " + totalFailed);

        System.out.println("----- CLASS AVERAGE -----");
        System.out.println("Highest average: " + String.format("%.2f", highestAverage));
        System.out.println("Lowest average: " + String.format("%.2f", lowestAverage));
        System.out.println("Overall class average: " + String.format("%.2f", overallAverage));
    }
}
