import java.util.Scanner;

public class DetermineTypeOfCharacter {
    public static boolean isUppercase(char character) {
        return (character >= 65 && character <= 90);
    }

    public static boolean isLowercase(char character) {
        return (character >= 97 && character <= 122);
    }

    public static boolean isDigit(char character) {
        return (character >= 48 && character <= 57);
    }

    public static boolean isOtherCharacter(char character) {
        return (!isUppercase(character) && !isLowercase(character) && !isDigit(character));
    }

    public static void showTypeOfCharacter(char character) {
        if (isUppercase(character)) {
            System.out.println(character + " is uppercase.\n");
        } else if (isLowercase(character)) {
            System.out.println(character + " is lowercase.\n");
        } else if (isDigit(character)) {
            System.out.println(character + " is digit.\n");
        } else if (isOtherCharacter(character)) {
            System.out.println(character + " is other character.\n");
        } else {
            System.out.println("This should never happen.\n");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        char option = '0', character = '0';

        while (!exit) {
            option = '0';

            System.out.println();
            System.out.println("****************************************************************");
            System.out.println("Determine if a character is uppercase, lowercase, number, or other.");
            System.out.println("****************************************************************");
            System.out.println();

            System.out.print("Enter any character: ");
            character = input.next().charAt(0);
            showTypeOfCharacter(character);

            while (option != 'N' && option != 'n' && option != 'Y' && option != 'y') {
                System.out.print("Want to enter another character? (Y/N): ");
                option = input.next().charAt(0);
            }

            exit = (option == 'N' || option == 'n');
        }

        input.close();
    }
}