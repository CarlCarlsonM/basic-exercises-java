import java.util.Scanner;

public class LuckyNumber {
    public static void printProgramIntro() {
        System.out.println();
        System.out.println("****************************************************************");
        System.out.println("Get your lucky number from your date of birth.");
        System.out.println("****************************************************************");
        System.out.println("Please enter your date of birth.");
        System.out.println("The format needs to be day/month/year.");
        System.out.println("****************************************************************");
        System.out.println("Remember the following: ");
        System.out.println("January, March, May, July, August, October, December have 31 days.");
        System.out.println("April, June, September, November have 30 days.");
        System.out.println("February has 28 days in a regular year and 29 days in a leap year.");
        System.out.println("Leap years: 1904, 1908, 1912 ... 2000, 2004, 2008, 2012, 2016, 2020.");
        System.out.println("****************************************************************");
        System.out.println();
        System.out.println("Date of birth?: ");
    }

    public static boolean isValidDate(int day, int month, int year) {
        switch (month) {
            case 1: //January has 31 days
                return (day >= 1 && day <= 31);
            case 2: //February has 28 days in a regular year and 29 days in a leap year
                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                return ((day >= 1 && day <= 28) || (day == 29 && isLeapYear));
            case 3: //March has 31 days
                return (day >= 1 && day <= 31);
            case 4: //April has 30 days
                return (day >= 1 && day <= 30);
            case 5: //May has 31 days
                return (day >= 1 && day <= 31);
            case 6: //June has 30 days
                return (day >= 1 && day <= 30);
            case 7: //July has 31 days       
                return (day >= 1 && day <= 31);
            case 8: //August has 31 days
                return (day >= 1 && day <= 31);
            case 9: //September has 30 days
                return (day >= 1 && day <= 30);
            case 10: //October has 31 days
                return (day >= 1 && day <= 31);
            case 11: //November has 30 days
                return (day >= 1 && day <= 30);
            case 12: //December has 31 days
                return (day >= 1 && day <= 31);
            default:
                return false;
        }          
    }

    public static int getLuckyNumberFromDoB(int day, int month, int year) {
        int sumDoB = day + month + year;
        int result = 0;

        while (sumDoB != 0) {
            result += sumDoB % 10;
            sumDoB = sumDoB / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = -1, month = -1, year = 1899;
        boolean exit = false, validDate = false;
        char option = '0';

        while (!exit) {
            day = -1;
            month = -1;
            year = 1899;
            option = '0';
            validDate = false;

            while (!validDate) {
                printProgramIntro();

                while (day < 1 || day > 31) {
                    System.out.print("Day (DD: 1 to 31): ");
                    day = input.nextInt();
                }
    
                while (month < 1 || month > 12) {
                    System.out.print("Month (MM: 1 to 12): ");
                    month = input.nextInt();
                }
    
                while (year < 1900 || year > 2021) {
                    System.out.print("Year (YYYY: 1900 to 2021): ");
                    year = input.nextInt();
                }

                validDate = isValidDate(day, month, year);

                if (!validDate) {
                    day = -1;
                    month = -1;
                    year = 1899;

                    System.out.println();
                    System.out.println("****************************************************************");
                    System.out.println("Invalid date, please try again. Remember the guidelines.");
                    System.out.println("****************************************************************");
                    System.out.println();

                    while (option != 'C' && option != 'c') {
                        System.out.print("Press key C to continue: ");
                        option = input.next().charAt(0);
                    }
                }
            }

            int luckyNumber = getLuckyNumberFromDoB(day, month, year);

            System.out.println();
            System.out.println("****************************************************************");
            System.out.println("Your lucky number is: " + luckyNumber);
            System.out.println("****************************************************************");
            System.out.println();

            while (option != 'N' && option != 'n' && option != 'Y' && option != 'y') {
                System.out.print("Want to calculate another lucky number? (Y/N): ");
                option = input.next().charAt(0);
            }

            exit = (option == 'N' || option == 'n');
        }

        input.close();
    }
}