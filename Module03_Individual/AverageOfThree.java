import java.util.Scanner;

public class ComputeAverage {
   public static void main(String[] args) {
      // declare and instantiate a Scanner object to collect user input
      Scanner scnr = new Scanner(System.in);
      // Collect the first number from the user.
      System.out.print("Enter first number  : ");
      int firstNumber = scnr.nextInt();
      // Collect the second number from the user.
      System.out.print("Enter second number : ");
      int secondNumber = scnr.nextInt();
      // Collect the third number from the user.
      System.out.print("Enter third number  : ");
      int thirdNumber = scnr.nextInt();
      
      // Below this comment: write a single Java statement to declare a variable named average of data type int.
      int average;
      
      // Below this comment: write a single Java statement to compute the average of the three numbers inputted above, 
      // and store the result in a variable named average.
      average = (firstNumber + secondNumber + thirdNumber) / 3;
      
      // Below this comment: write a single Java statement to display the average of the three input values.
      System.out.println("The average is : " + average);
   }
}
