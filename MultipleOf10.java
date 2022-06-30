import java.util.Scanner;

public class MultipleOf10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        boolean exit = false, isMultipleOf10 = false;
        char option = '0';

        while (!exit) {
            option = '0';

            System.out.println();
            System.out.println("****************************************************************");
            System.out.println("Check if a number is a multiple of 10.");
            System.out.println("****************************************************************");
            System.out.println();

            System.out.print("Enter a number (integer): ");
            number = input.nextInt();

            isMultipleOf10 = (number % 10 == 0) ? true : false;
            if (isMultipleOf10) {
                System.out.println(number + " is multiple of 10. \n");
            } else {
                System.out.println(number + " is not multiple of 10. \n");
            }

            while (option != 'N' && option != 'n' && option != 'Y' && option != 'y') {
                System.out.print("Want to enter another number? (Y/N): ");
                option = input.next().charAt(0);
            }

            exit = (option == 'N' || option == 'n');
        }

        input.close();
    }
}