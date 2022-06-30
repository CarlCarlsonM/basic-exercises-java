import java.util.Scanner;

public class BiggestOf3Numbers {
    public static int getBiggestOf3Numbers(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else if (c > a && c > b) {
            return c;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        int num1 = 0, num2 = 0, num3 = 0, biggest = 0;
        char option = '0';

        while (!exit) {
            option = '0';

            System.out.println();
            System.out.println("****************************************************************");
            System.out.println("Get the biggest of 3 numbers.");
            System.out.println("****************************************************************");
            System.out.println();

            System.out.print("Enter the first number: ");
            num1 = input.nextInt();

            System.out.print("Enter the second number: ");
            num2 = input.nextInt();

            System.out.print("Enter the third number: ");
            num3 = input.nextInt();

            biggest = getBiggestOf3Numbers(num1, num2, num3);
            System.out.print("\nThe biggest number is: " + biggest + "\n\n");

            while (option != 'N' && option != 'n' && option != 'Y' && option != 'y') {
                System.out.print("Want to perform another division? (Y/N): ");
                option = input.next().charAt(0);
            }

            exit = (option == 'N' || option == 'n'); 
        }

        input.close();
    }    
}