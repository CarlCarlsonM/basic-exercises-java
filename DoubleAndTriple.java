import java.util.Scanner;

public class DoubleAndTriple {
    public static int getDoubleOfANumber(int number) {
        return number * 2;
    }

    public static int getTripleOfANumber(int number) {
        return number * 3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        char option = '0';
        int number = 0, doubleOfNumber = 0, tripleOfNumber = 0;

        while (!exit) {
            option = '0';

            System.out.println();
            System.out.println("****************************************************************");
            System.out.println("Get the double and triple of a number.");
            System.out.println("****************************************************************");
            System.out.println();

            System.out.print("Please enter a number (integer): ");
            number = input.nextInt();
            doubleOfNumber = getDoubleOfANumber(number);
            tripleOfNumber = getTripleOfANumber(number);
            System.out.println(doubleOfNumber + " is the double of " + number);
            System.out.println(tripleOfNumber + " is the triple of " + number + "\n");


            while (option != 'N' && option != 'n' && option != 'Y' && option != 'y') {
                System.out.print("Want to enter another number? (Y/N): ");
                option = input.next().charAt(0);
            }

            exit = (option == 'N' || option == 'n');
        }

        input.close();
    }
}