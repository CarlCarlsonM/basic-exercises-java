import java.util.Scanner;

public class KmhToMs {
    public static double convertKmhToMs(double speedKmh) {
        return speedKmh * 5 / 18;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double speedKmh = 0, speedMs = 0;
        boolean exit = false;
        char option = '0';

        while (!exit) {
            option = '0';

            System.out.println();
            System.out.println("****************************************************************");
            System.out.println("Convert speed from km/h to m/s.");
            System.out.println("****************************************************************");
            System.out.println();

            System.out.print("Please enter the speed (km/h) to convert: ");
            speedKmh = input.nextDouble();
            speedMs = convertKmhToMs(speedKmh);

            System.out.println("The speed in m/s is: " + String.format("%,.2f", speedMs) + "\n");

            while (option != 'N' && option != 'n' && option != 'Y' && option != 'y') {
                System.out.print("Want to do another conversion? (Y/N): ");
                option = input.next().charAt(0);
            }

            exit = (option == 'N' || option == 'n');
        }

        input.close();
    }
}
