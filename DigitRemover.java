import java.util.Scanner;

public class DigitRemover {
    public static int getNumberOfDigits(int number) {
        int result = 1;
        while (number / 10 != 0) {
            number /= 10;
            result++;
        }
        return result;
    }

    public static int removeDigitsFromNumber(int number, int digitsToRemove) {
        int result = 0, count = 1;
        while (count <= digitsToRemove) {
            result = number / 10;
            number /= 10;
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0, numberOfDigits = 0, digitsToRemove = 0, resultingNumber = 0;
        boolean exit = false;
        char option = '0';

        while (!exit) {
            number = 0;
            numberOfDigits = 0;
            digitsToRemove = 0;
            resultingNumber = 0;
            option = '0';

            System.out.println();
            System.out.println("****************************************************************");
            System.out.println("Remove digits from a given number.");
            System.out.println("****************************************************************");
            System.out.println();

            while (number < 10 && number > -10) {
                System.out.print("Enter a number (num <= -10 or num >= 10): ");
                number = input.nextInt();
                numberOfDigits = getNumberOfDigits(number);
            }

            System.out.println("\nEnter the amount of digits to remove.");
            System.out.println("It needs to be higher than 0 and lower than " + numberOfDigits);
            while (digitsToRemove < 1 || digitsToRemove >= numberOfDigits) {
                System.out.print("Digits to remove? (0 < " + numberOfDigits + "): ");
                digitsToRemove = input.nextInt();
            }

            resultingNumber = removeDigitsFromNumber(number, digitsToRemove);

            System.out.println("\nOriginal number: " + number);
            System.out.println("Number after removing " + digitsToRemove + " digit(s): " + resultingNumber + "\n");

            while (option != 'N' && option != 'n' && option != 'Y' && option != 'y') {
                System.out.print("Want to remove the digits from another number? (Y/N): ");
                option = input.next().charAt(0);
            }

            exit = (option == 'N' || option == 'n');
        }

        input.close();
    }
}