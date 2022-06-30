import java.lang.Math;
import java.util.Scanner;

public class PythagoreanTheorem {
    public static double getHypotenuse(double sideA, double sideB) {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sideA = 0, sideB = 0 ,hypotenuse = 0;
        boolean exit = false;
        char option = '0';

        while (!exit) {
            sideA = 0;
            sideB = 0;
            option = '0';

            System.out.println();
            System.out.println("****************************************************************");
            System.out.println("Get the hypotenuse from a right triangle.");
            System.out.println("****************************************************************");
            System.out.println();

            while (sideA <= 0) {
                System.out.print("Enter the length of side A (needs to be higher than 0): ");
                sideA = input.nextInt();
            }

            while (sideB <= 0) {
                System.out.print("Enter the length of side B (needs to be higher than 0): ");
                sideB = input.nextInt();
            }

            hypotenuse = getHypotenuse(sideA, sideB);

            System.out.println("The hypotenuse is: " + String.format("%,.2f", hypotenuse) + "\n");

            while (option != 'N' && option != 'n' && option != 'Y' && option != 'y') {
                System.out.print("Want to calculate another hypotenuse? (Y/N): ");
                option = input.next().charAt(0);
            }

            exit = (option == 'N' || option == 'n');
        }

        input.close();
    }
}