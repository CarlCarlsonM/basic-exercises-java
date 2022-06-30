import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static double celsiusToFahrenheit(double temperatureCelsius) {
        return 32 + 9 * temperatureCelsius / 5;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        char option = '0';
        double temperatureCelsius = 0.0, temperatureFahrenheit = 0.0;

        while (!exit) {
            option = '0';

            System.out.println();
            System.out.println("****************************************************************");
            System.out.println("Get the temperature in Fahrenheit from the temperature in Celsius.");
            System.out.println("****************************************************************");
            System.out.println();

            System.out.print("What is the current temperature (in Celsius)?: ");
            temperatureCelsius = input.nextDouble();
            temperatureFahrenheit = celsiusToFahrenheit(temperatureCelsius);
            System.out.println("The temperature in Fahrenheit is: " + String.format("%,.2f", temperatureFahrenheit) + "\n");


            while (option != 'N' && option != 'n' && option != 'Y' && option != 'y') {
                System.out.print("Want to try again? (Y/N): ");
                option = input.next().charAt(0);
            }

            exit = (option == 'N' || option == 'n');
        }

        input.close();
    }
}