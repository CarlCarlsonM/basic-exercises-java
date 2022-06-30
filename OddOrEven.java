import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        char option = '0';
        int num = 0;
        boolean isEven = false;

        while (!exit) {
            option = '0';

            System.out.println();
            System.out.println("****************************************************************");
            System.out.println("Check if a number is odd or even.");
            System.out.println("****************************************************************");
            System.out.println();

            System.out.print("Enter a number (integer): ");
            num = input.nextInt();
            
            isEven = (num % 2 == 0) ? true : false;
            if (isEven) {
                System.out.println(num + " is even. \n");
            } else {
                System.out.println(num + " is odd. \n");
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