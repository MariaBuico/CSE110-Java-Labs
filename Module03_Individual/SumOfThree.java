import java.util.Scanner;

public class ComputeSum {
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
      
      // Below this comment: write a single Java statement to declare a variable named total of data type int.
      int total;
      
      // Below this comment: write a single Java statement to compute the sum of the three numbers inputted above, 
      // and store the result in a variable named total.
      total = firstNumber + secondNumber + thirdNumber;
      
      // Below this comment: write a single Java statement to display the sum of the three input values.
      System.out.println("The sum is : " + total);
   }
}
