import java.util.Scanner;

public class Converter {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);
      
      // Below this comment: declare any variables you may need
      int feet;
      double inches;
      double totalInches;
      double meters;
      
      // Below this comment: collect the required inputs
      System.out.print("Enter Feet   : ");
      feet = scnr.nextInt();

      System.out.print("Enter Inches : ");
      inches = scnr.nextDouble();
      
      // Below this comment: write Java code to do the computations needed to determine the correct output values
      totalInches = (feet * 12) + inches;
      meters = totalInches / 39.37;
      
      // Below this comment: output the correct output values that you computed above
      System.out.printf("%d' and %.2f\" is %.2f Meters.\n", feet, inches, meters);
   }
}
