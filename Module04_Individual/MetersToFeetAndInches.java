import java.util.Scanner;

public class Converter {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);
      
      // Below this comment: declare any variables you may need
      double meters;
      int feet;
      double inches;
      double metersInFeet;
      double metersInInches;
      int foot = 12;

      // Below this comment: collect the required inputs
      System.out.print("Enter distance in Meters : ");
      meters = scnr.nextDouble();
      
      // Below this comment: write Java code to do the computations needed to determine the correct output values
      metersInInches = meters * 39.37;
      metersInFeet = meters * 3.28;
      feet = (int)metersInFeet;
      inches = metersInInches - (feet * foot);

      // Below this comment: output the correct output values that you computed above
      System.out.printf("%.2f meters in Feet and Inches is : %d' %.2f\"\n", meters, feet, inches);
   }
}
