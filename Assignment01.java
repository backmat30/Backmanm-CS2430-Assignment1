
import java.util.Scanner;

public class Assignment01
{
    /**
     * The number of months in a year
     */
    public static final int NUMBER_OF_MONTHS = 12;

    /**
     * The scanner object used for reading input
     * Cannot be final for testing purposes
     */
    public static Scanner scanner;


    /**
     * Prints the greatest common divisor of two input integers
     */
    public static void printGCD()
    {
        System.out.println("Enter an integer");
        String num1String = scanner.nextLine();
        int num1 = Integer.parseInt(num1String);

        System.out.println("Enter another integer");
        String num2String = scanner.nextLine();
        int num2 = Integer.parseInt(num2String);

        int gcd = calculateGCD(num1, num2);
        System.out.println(gcd);
    }

    /**
     * Calculates the greatest common divisor for num1 and num2
     * Assumes all input integers are positive
     * It is recommended to use Euclids algorithm to calculate the greatest common divisor
     *
     * Euclids Algorithm
     * Step 1:  Divide the larger number by the smaller number and store the remainder in the larger number
     * Note:  The modulus (%) operator will calculate the remainder
     * Step 2:  Repeat step 1 until one of the numbers is equal to zero
     * Step 3:  Return the greatest common divisor which is the non-zero number
     *
     * @param num1 The first number
     * @param num2 The second number
     *
     * @return The greatest common divisor for num1 and num2
     */
    public static int calculateGCD(int num1, int num2)
    {
        int gcd = -1;

        while(num1 != 0 && num2 != 0){
            if(num1 > num2){
                num1 %= num2;
            } else{
                num2 %= num1;
            }
        }
        if(num1 == 0){
            gcd = num2;
        } else{
            gcd = num1;
        }

        return gcd;
    }

    /**
     * Prints the day of the week a given input date is
     * Retrieves a day, month, and year from the user
     * Output the day of the week for that given day, month, year
     */
    public static void printDayOfWeek()
    {
        System.out.println("Enter a day");
        String dayString = scanner.nextLine();
        int dayInt = Integer.parseInt(dayString);

        System.out.println("Enter a month");
        String monthString = scanner.nextLine();
        int monthInt = Integer.parseInt(monthString);

        System.out.println("Enter a year");
        String yearString = scanner.nextLine();
        int yearInt = Integer.parseInt(yearString);

        int dayOfWeek = calculateDayOfWeek(dayInt, monthInt, yearInt);

        // An array of week names would be better but arrays have not been taught yet

        if(dayOfWeek == 0)
        {
            System.out.println("Saturday");
        }
        else if(dayOfWeek == 1)
        {
            System.out.println("Sunday");
        }
        else if(dayOfWeek == 2)
        {
            System.out.println("Monday");
        }
        else if(dayOfWeek == 3)
        {
            System.out.println("Tuesday");
        }
        else if(dayOfWeek == 4)
        {
            System.out.println("Wednesday");
        }
        else if(dayOfWeek == 5)
        {
            System.out.println("Thursday");
        }
        else if(dayOfWeek == 6)
        {
            System.out.println("Friday");
        }

    }

    /**
     * Using Zeller's algorithm calculate the day of the week
     *
     * Day of week = { floor(13(m+1) / 5) + floor(y/4) + floor(c/4) + d + y - 2c } mod 7
     *
     * Y = the year, if the month is January or February Y=year-1
     * y = last two digits of Y.
     * c = the first two digits of Y
     * d = day of month (1 - 31)
     * m = shifted month (3=March, January=13, February=14)
     *
     * @param day The day of the month.  The first day of the month is 1.
     * @param month The month number.  January=1, December=12
     * @param year The year number.  For years >= 1.
     * @return The day of the week. 0=Saturday, 1=Sunday, 2=Monday, 3=Tuesday, 4=Wednesday, 5=Thursday, 6=Friday
     */
    public static int calculateDayOfWeek(int day, int month, int year)
    {
        int dayOfWeek = -1;

        // TODO IMPLEMENT

        return dayOfWeek;
    }

    /**
     * Prints all the perfect numbers below the input value
     */
    public static void printPerfectNumbers()
    {
        System.out.println("Enter a number");
        String maxNumberString = scanner.nextLine();
        int maxNumber = Integer.parseInt(maxNumberString);

        for(int i=1; i<maxNumber; i++)
        {
            if(isPerfectNumber(i))
            {
                System.out.println(i);
            }
        }
    }

    /**
     * Checks if an input number is a perfect number
     * A number is a perfect number if it is equal to the sum of all positive divisors
     * https://mathworld.wolfram.com/PerfectNumber.html
     *
     * @param number The number
     * @return True if the input number is perfect, false if not
     */
    public static boolean isPerfectNumber(int number)
    {
        boolean isPerfect = false;

        // TODO IMPLEMENT

        return isPerfect;
    }

    /**
     * Main method
     *
     * @param args Program arguments.  None required for this program.
     */
    public static void main(String[] args)
    {
        scanner = new Scanner(System.in);
        printDayOfWeek();
        printPerfectNumbers();
        printGCD();
    }
}
