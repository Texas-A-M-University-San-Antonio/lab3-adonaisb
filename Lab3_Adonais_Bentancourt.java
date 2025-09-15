//[Adonais Bentancourt]
// [September 9th 2025]
//*Purpose of Lab 3 Tracking the value of homes over a period of time */
import java.util.Scanner;

public class Lab3_Adonais_Bentancourt
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double initialH, interestRate, finalH;
        int NUMBER_ELAPSED_YEARS;

        System.out.println("Please input the initial value of the home: ");
        initialH = input.nextDouble();

        System.out.println("Please insert the number of elapsed years: ");
        NUMBER_ELAPSED_YEARS = input.nextInt(); // we use input.nextInt() becasue we are working with an integer instead of a DOuble

        System.out.println("Please input the interest rate: ");
        interestRate = input.nextDouble();
        interestRate = interestRate / 100; // This is converting the interest rate from percent to a decimal 

        finalH = initialH * Math.pow(1+interestRate, NUMBER_ELAPSED_YEARS); // This is the equation for P*(1+r)^t but instead we use Math.pow() to represent (1+r) to the power of t 
        
        System.out.println("The final value of the home is: " + finalH);
        
    }
}