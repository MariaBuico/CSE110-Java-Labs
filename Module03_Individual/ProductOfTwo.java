import java.util.Scanner;

public class ComputeProduct {
   public static void main(String[] args) {
      // declare and instantiate a Scanner object to collect user input
      Scanner scnr = new Scanner(System.in);
      // Collect the first number from the user.
      System.out.print("Enter first number  : ");
      int firstNumber = scnr.nextInt();
      // Collect the second number from the user.
      System.out.print("Enter second number : ");
      int secondNumber = scnr.nextInt();
      System.out.println(""); // blank line
      
      // Below this comment: write a single Java statement to declare a variable named product of data type int.
      int product;
      
      // Below this comment: write a single Java statement to compute the product of the two numbers inputted above, 
      // and store the result in a variable named product.
      product = firstNumber * secondNumber;
      
      // Below this comment: write a single Java statement to display the product of the two input values.
      System.out.println("The product is : " + product);
   }
}
