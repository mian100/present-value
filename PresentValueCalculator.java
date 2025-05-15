import java.util.Scanner;

public class PresentValueCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Present Value Calculator ====");

        System.out.print("Enter future value (F): ");
        double futureValue = scanner.nextDouble();

        System.out.print("Enter annual interest rate (r) in decimal (e.g., 0.05 for 5%): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter number of years (n): ");
        int years = scanner.nextInt();

        double presentValue = presentValue(futureValue, annualRate, years);

        System.out.printf("You need to deposit: $%.2f today.%n", presentValue);

        scanner.close();
    }

    // Method to calculate present value
    public static double presentValue(double futureValue, double annualRate, int years) {
        return futureValue / Math.pow(1 + annualRate, years);
    }
}
