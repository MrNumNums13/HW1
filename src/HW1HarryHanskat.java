import java.util.Scanner;

/**
 * Created by harryhanskat on 9/7/17.
 */
public class HW1HarryHanskat {
    public static void main(String[] args){

        //2.1 - Convert Celsius to Farenheit
        System.out.println("\n***************** 2.1 - Convert Celsius to Farenheit ********************\n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Celsius temperature you would like to convert:");
        Double fahrenheit = scan.nextDouble();
        System.out.println(fahrenheit + " Celsius is " + ((9.0/5)*fahrenheit + 32) + " Fahrenheit");


        //2.5 - Calculate tips
        System.out.println("***************** 2.5 - Calculate tips ********************\n");

        System.out.println("Enter the subtotal and a gratuity rate: ");
        Double subtotal = scan.nextDouble();
        Double gratuityRate = scan.nextDouble();
        Double totalGratuity = subtotal * (gratuityRate * .01);
        System.out.println("The gratuity is $" + totalGratuity + " and the total is $" + (totalGratuity + subtotal));


        //2.6 - Sum of Digits
        System.out.println("\n***************** 2.6 - Sum of Digits ********************\n");

        System.out.println("Enter an number between 0 and 1000: ");
        int number = scan.nextInt();
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = (number / 100);
        System.out.println("The sum of the digits is "+ (ones+tens+hundreds));


        //2.7 - Number of Years
        System.out.println("\n***************** 2.7 - Number of Years ********************\n");

        System.out.println("Enter the number of seconds:");
        int minutes = scan.nextInt();
        double years = (((minutes / 60)/24)/365);
        double days = (minutes/60/24) % 365;
        System.out.println("That is approximately " + years + " years, and "+ days + " days.");
    }
}
