/**
 * Name: [Adonais Bentancourt]
 * Date: [September 9th 2025]
* Purpose: InClass 3 - The program will take user input as the side of the cube and calculate the volume and surface area.
* [Write a description about this InClass 3 program]
 */

// Don't forget to import and declare a Scanner for user input.
    import java.util.Scanner;
public class InClass3_Adonais_Bentancourt
{
    public static void main(String[] args) 
    {
        // In-Class 3 Example:
            Scanner input = new Scanner(System.in);

            double side, volume, surfaceArea;
            // Step 1: Prompt the user to enter the length of the side of a cube.
            System.out.print("Please enter the length of the cube's side: ");
        // Step 2: Read the user's input and store it in a variable.
            side = input.nextDouble(); // this is the INPUT by user 
        // Step 3: Use an appropriate method to determine the volume of the cube.
            volume = Math.pow(side, 3);
         // Step 4: Use an appropriate method to determine the surface area of the cube.
            surfaceArea = 6 * Math.pow(side, 2); 
         // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
           // Step 5: Print the volume and surface area in clear sentences.
            System.out.println("The volume of the cube is " + volume);
            System.out.println("The Surface area of the cube is " + surfaceArea);
        }
}