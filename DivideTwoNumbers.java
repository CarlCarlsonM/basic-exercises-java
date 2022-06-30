import java.util.Scanner;

public class DivideTwoNumbers {
    public static double divideTwoNumbers(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        double num1 = 0, num2 = 0, result = 0;
        char option = '0';

        while (!exit) {
            num1 = 0;
            num2 = 0;
            option = '0';

            System.out.println();
            System.out.println("****************************************************************");
            System.out.println("Divide two numbers.");
            System.out.println("****************************************************************");
            System.out.println();

            System.out.print("Enter the first number: ");
            num1 = input.nextDouble();

            while (num2 == 0) {
                System.out.print("Enter the second number (it cannot be 0): ");
                num2 = input.nextDouble();
            }

            result = divideTwoNumbers(num1, num2);
            System.out.println("\n" + num1 + "/" + num2 + " = " + String.format("%,.2f", result) + "\n");

            while (option != 'N' && option != 'n' && option != 'Y' && option != 'y') {
                System.out.print("Want to perform another division? (Y/N): ");
                option = input.next().charAt(0);
            }

            exit = (option == 'N' || option == 'n');            
        }

        input.close();
    }
}