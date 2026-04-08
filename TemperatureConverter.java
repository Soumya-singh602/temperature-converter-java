import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        // Fixed value
        double fahrenheit = 98.6;
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("[Fixed] %.2f°F = %.2f°C\n", fahrenheit, celsius);

        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter temperature in Fahrenheit: ");

        if (scanner.hasNextDouble()) {
            double userF = scanner.nextDouble();

            // Validation (absolute zero check)
            if (userF < -459.67) {
                System.out.println("Invalid input! Temperature below absolute zero.");
            } else {
                double userC = (userF - 32) * 5 / 9;
                System.out.printf("[User Input] %.2f°F = %.2f°C\n", userF, userC);
            }
        } else {
            System.out.println("Error: Please enter a valid number!");
        }

        scanner.close();
    }
}
