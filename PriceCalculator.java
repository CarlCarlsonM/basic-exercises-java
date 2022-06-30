import java.util.Scanner;

public class PriceCalculator {
    public static double calculatePriceAfterTax(int price, int quantity, double tax) {
        return (double)(price * quantity) * (1.0 + tax / 100.0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price = 0,  quantity = 0;
        double tax = -1.00;
        char option = '0';
        boolean exit = false;

        while (!exit) {
            price = 0;
            quantity = 0;
            tax = -1;
            option = '0';

            System.out.println();
            System.out.println("****************************************************************");
            System.out.println("Calculate the total price of a product after taxes.");
            System.out.println("****************************************************************");
            System.out.println("The price and quantity need to be greater than 0.");
            System.out.println("That tax needs to be a number between 0 and 100.");
            System.out.println("****************************************************************");
            System.out.println();

            while (price <= 0)  {
                System.out.print("Enter the price of the product (price > 0): $");
                price = input.nextInt();
            }

            while (quantity <= 0) {
                System.out.print("Enter the quantity of the product (quantity > 0): ");
                quantity = input.nextInt();
            }

            while (tax < 0 || tax > 100) {
                System.out.print("Enter the tax amount (0 <= tax <= 100): %");
                tax = input.nextDouble();
            }

            double total = calculatePriceAfterTax(price, quantity, tax);

            System.out.println("\nThe price after tax is $" + String.format("%,.2f", total) + "\n");

            while (option != 'N' && option != 'n' && option != 'Y' && option != 'y') {
                System.out.print("Want to calculate the price for another item? (Y/N): ");
                option = input.next().charAt(0);
            }

            exit = (option == 'N' || option == 'n');
        }

        input.close();
    }
}
