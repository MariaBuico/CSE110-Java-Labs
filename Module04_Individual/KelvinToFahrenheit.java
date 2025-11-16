import java.util.Scanner;

public class TempConversion { 
   public static void main(String[] args) {
    // Below this comment: declare and instantiate a Scanner
    Scanner scnr = new Scanner(System.in);
      
    // Below this comment: declare any other variables you may need
    double Kelvin;
    double Fahrenheit;

    // Below this comment: collect the requried inputs from the user
    System.out.print("Enter temperature in Kelvin : ");
    Kelvin = scnr.nextDouble();

    // Below this comment: compute and store the required output values
    Fahrenheit = (Kelvin - 273.15) * 9/5 + 32;

    // Below this comment: disply the required results
    System.out.printf("%.2f degrees Kelvin is %.2f Fahrenheit\n", Kelvin, Fahrenheit);

          
   }
}